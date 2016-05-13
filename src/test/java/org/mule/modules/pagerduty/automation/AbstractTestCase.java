/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
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
	
	public String getEscalationId()
	{
		return null;
	}
	
	public String getTeamId()
	{
		return null;
	}
	
	public String getUserId()
	{
		return null;
	}
	
	public String getnotificationRuleId()
	{
		return null;
	}
	public String getEscalationPolicyId()
	{
		return null;
	}
	public String getQuery()
	{
		return null;
	}
	
	public String getInclude()
	{
		return null;
	}
	
	public String getServiceId()
	{
		return null;
	}
	
	public String getemailFilterId()
	{
		return null;
	}
	
	public String getSince()
	{
		return null;
	}
	public String getUntil()
	{
		return null;
	}
	public String getTimeZone()
	{
		return null;
	}
	
	public String getOverflow()
	{
		return null;
	}
	public String getContactMethodId()
	{
		return null;
	}
}
