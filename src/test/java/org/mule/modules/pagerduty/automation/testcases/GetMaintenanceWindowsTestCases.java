package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
    	MaintenanceWindowsGetResponse maintenanceWindowsGetResponse = getConnector().getMaintenanceWindows(query, serviceIds, teams, filter, include);
    	assertNotNull(maintenanceWindowsGetResponse);
	    assertEquals("200", maintenanceWindowsGetResponse.getStatusCode() );
    }
}
