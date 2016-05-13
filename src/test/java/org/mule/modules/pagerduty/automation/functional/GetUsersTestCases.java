package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.UsersGetResponse;

public class GetUsersTestCases extends PagerDutyAbstractTestCases{
	
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
