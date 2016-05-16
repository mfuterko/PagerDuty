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
import org.mule.modules.pagerduty.bean.StatusResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class DeleteServiceTestCases.
 */
public class DeleteServiceTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new delete service test cases.
	 */
	public DeleteServiceTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test delete service.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testDeleteService() throws Exception 
	{
		String id = getId();
		StatusResponse statusResponse = getConnector().deleteService(id);
		
		assertNotNull(statusResponse);
	    assertEquals("200", statusResponse.getStatusCode());
				
	}

}
