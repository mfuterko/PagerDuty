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
import org.mule.modules.pagerduty.bean.MaintenanceWindowByIdGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetMaintenanceWindowsByIdTestCases.
 */
public class GetMaintenanceWindowsByIdTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the maintenance windows by id test cases.
	 */
	public GetMaintenanceWindowsByIdTestCases()
	{
		super(PagerDutyConnector.class);
	}
    
    /**
     * Test get maintenance windows by id.
     *
     * @throws Exception the exception
     */
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
