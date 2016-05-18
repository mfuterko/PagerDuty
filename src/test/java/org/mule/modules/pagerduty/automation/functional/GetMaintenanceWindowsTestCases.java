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
import org.mule.modules.pagerduty.bean.MaintenanceWindowsGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetMaintenanceWindowsTestCases.
 */
public class GetMaintenanceWindowsTestCases extends PagerDutyAbstractTestCases{

	/**
	 * Instantiates a new gets the maintenance windows test cases.
	 */
	public GetMaintenanceWindowsTestCases()
	{
		super(PagerDutyConnector.class);
	}
    
    /**
     * Test get maintenance windows test cases.
     *
     * @throws Exception the exception
     */
    @Test
    @Category({FunctionalTestSuite.class})
    public void testGetMaintenanceWindowsTestCases() throws Exception 
    {
    	String query = getQuery();
    	String serviceIds = getServiceId();
    	String teams = getTeams();
    	String filter = getFilter();
    	String include = getInclude();
    	MaintenanceWindowsGetResponse maintenanceWindowsGetResponse = getConnector().getMaintenanceWindows(query, serviceIds, teams, filter, include);
    	assertNotNull(maintenanceWindowsGetResponse);
	    assertEquals("200", maintenanceWindowsGetResponse.getStatusCode() );
    }
}
