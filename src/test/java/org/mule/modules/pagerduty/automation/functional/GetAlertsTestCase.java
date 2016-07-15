package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.AlertsResponse;

public class GetAlertsTestCase extends PagerDutyAbstractTestCases {

	public GetAlertsTestCase() {
		super(PagerDutyConnector.class);
	}
	
	@Test
	@Category({FunctionalTestSuite.class})
    public void testGetAlerts() throws Exception 
    {
    	String since = getSince();
    	String until = getUntil();
    	AlertsResponse response = getConnector().getAlerts(since, until, null,null);
    	assertNotNull(response);
	    assertEquals("200", response.getStatusCode() );
    }

}
