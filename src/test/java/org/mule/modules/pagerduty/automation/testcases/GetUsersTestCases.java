/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.UsersGetResponse;

public class GetUsersTestCases extends AbstractTestCase{
	
	public GetUsersTestCases()
	{
		super();
	}
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