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
 * The Class DeleteUserTestCases.
 */
public class DeleteUserTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new delete user test cases.
	 */
	public DeleteUserTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test delete user.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testDeleteUser() throws Exception 
	{
		String id = getId();
		StatusResponse statusResponse = getConnector().deleteUser(id);
		assertNotNull(statusResponse);
	    assertEquals("200", statusResponse.getStatusCode());
	}

}
