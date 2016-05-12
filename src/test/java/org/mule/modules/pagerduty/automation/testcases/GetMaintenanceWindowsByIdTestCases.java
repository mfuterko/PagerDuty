package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.MaintenanceWindowByIdGetResponse;

public class GetMaintenanceWindowsByIdTestCases extends AbstractTestCase{
	
	public GetMaintenanceWindowsByIdTestCases()
	{
		super();
	}
    @Test
    @Category({FunctionalTestSuite.class})
    public void testGetMaintenanceWindowsById() throws Exception 
    {
    	String id = getId();
    	MaintenanceWindowByIdGetResponse maintenanceWindowByIdGetResponse = getConnector().getMaintenanceWindowsById(id);
    	assertNotNull(maintenanceWindowByIdGetResponse);
	    assertEquals("200", maintenanceWindowByIdGetResponse.getStatusCode() );
    }

}
