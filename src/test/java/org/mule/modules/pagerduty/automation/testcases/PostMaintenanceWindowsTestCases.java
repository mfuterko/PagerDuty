package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.MaintenanceWindowsPostRequest;
import org.mule.modules.pagerduty.bean.MaintenanceWindowsPostResponse;

public class PostMaintenanceWindowsTestCases extends AbstractTestCase {
	
	public PostMaintenanceWindowsTestCases()
	{
		super();
	}
    @Test
    @Category({FunctionalTestSuite.class})
    public void testPostMaintenanceWindows() throws Exception 
    {
    	MaintenanceWindowsPostRequest request = new MaintenanceWindowsPostRequest();
    	MaintenanceWindowsPostResponse maintenanceWindowsPostResponse = getConnector().postMaintenanceWindows(request);
    	assertNotNull(maintenanceWindowsPostResponse);
	    assertEquals("200", maintenanceWindowsPostResponse.getStatusCode() );
    }

}
