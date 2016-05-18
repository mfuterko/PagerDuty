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
import org.mule.modules.pagerduty.bean.MaintenanceWindowsPostRequest;
import org.mule.modules.pagerduty.bean.MaintenanceWindowsPostResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class PostMaintenanceWindowsTestCases.
 */
public class PostMaintenanceWindowsTestCases extends PagerDutyAbstractTestCases {
	
	/**
	 * Instantiates a new post maintenance windows test cases.
	 */
	public PostMaintenanceWindowsTestCases()
	{
		super(PagerDutyConnector.class);
	}
    
    /**
     * Test post maintenance windows.
     *
     * @throws Exception the exception
     */
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
