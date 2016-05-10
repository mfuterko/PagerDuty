package org.mule.modules.pagerduty.automation;

import org.junit.Before;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.tools.devkit.ctf.mockup.ConnectorDispatcher;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

public abstract class AbstractTestCase {
	
	private PagerDutyConnector connector;
	private ConnectorDispatcher<PagerDutyConnector> dispatcher;
	
	
	protected PagerDutyConnector getConnector() {
		return connector;
	}


	protected ConnectorDispatcher<PagerDutyConnector> getDispatcher() {
		return dispatcher;
	}

	@Before
	public void init() throws Exception {
		
		//Initialization for single-test run
        ConnectorTestContext.initialize(PagerDutyConnector.class, false);
		
		//Context instance
		ConnectorTestContext<PagerDutyConnector> context = ConnectorTestContext.getInstance(PagerDutyConnector.class);
		
		//Connector dispatcher
		dispatcher = context.getConnectorDispatcher();
		
		connector = dispatcher.createMockup();
		
	}

}
