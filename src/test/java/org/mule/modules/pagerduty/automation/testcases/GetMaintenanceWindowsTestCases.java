/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ObjectInputStream.GetField;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.MaintenanceWindowsGetResponse;

public class GetMaintenanceWindowsTestCases extends AbstractTestCase{

	public GetMaintenanceWindowsTestCases()
	{
		super();
	}
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
