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
import org.mule.modules.pagerduty.bean.UsersGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetUsersTestCases.
 */
public class GetUsersTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the users test cases.
	 */
	public GetUsersTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test get users.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetUsers() throws Exception 
	{
		String query = getQuery();
		String include = getInclude();
		
		UsersGetResponse usersGetResponse = getConnector().getUsers(query,include);
		
		assertNotNull(usersGetResponse);
	    assertEquals("200", usersGetResponse.getStatusCode());
	}

}
