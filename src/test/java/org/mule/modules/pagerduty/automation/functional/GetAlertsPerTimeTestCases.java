/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.ReportsAlertsPerTimeResponse;

public class GetAlertsPerTimeTestCases extends PagerDutyAbstractTestCases{
	
	public GetAlertsPerTimeTestCases()
	{
		super();
	}
    @Test
    @Category({FunctionalTestSuite.class})
    public void testGetAlertsPerTime() throws Exception 
    {
    	String since = getSince();
    	String until = getUntil();
    	String rollup = getRollup();
    	ReportsAlertsPerTimeResponse reportsAlertsPerTimeResponse = getConnector().getAlertsPerTime(since, until, rollup);
    	assertNotNull(reportsAlertsPerTimeResponse);
	    assertEquals("200", reportsAlertsPerTimeResponse.getStatusCode() );
    }

}
