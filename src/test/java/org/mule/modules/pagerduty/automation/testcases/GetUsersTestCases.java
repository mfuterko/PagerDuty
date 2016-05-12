package test.java.org.mule.modules.pagerduty.automation.testcases;

import src.test.java.org.mule.modules.pagerduty.automation.testcases.AbstractTestCase;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Category;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.FunctionalTestSuite;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Test;

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
