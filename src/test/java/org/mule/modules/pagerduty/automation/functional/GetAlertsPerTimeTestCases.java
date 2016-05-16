/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.ReportsAlertsPerTimeResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetAlertsPerTimeTestCases.
 */
public class GetAlertsPerTimeTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the alerts per time test cases.
	 */
	public GetAlertsPerTimeTestCases()
	{
		super(PagerDutyConnector.class);
	}
    
    /**
     * Test get alerts per time.
     *
     * @throws Exception the exception
     */
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
