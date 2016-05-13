/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.UsersOnCallGetResponse;

public class GetUsersOnCallTestCases extends AbstractTestCase{
	
	public GetUsersOnCallTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetUsersOnCall() throws Exception 
	{
		String query = getQuery();
		String include = getInclude();
		UsersOnCallGetResponse usersOnCallGetResponse = getConnector().getUsersOnCall(query,include);
		assertNotNull(usersOnCallGetResponse);
	    assertEquals("200", usersOnCallGetResponse.getStatusCode() );
	}

}
