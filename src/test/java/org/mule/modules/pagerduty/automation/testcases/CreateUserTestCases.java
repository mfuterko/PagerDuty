package src.test.java.org.mule.modules.pagerduty.automation.testcases;

import org.mule.modules.pagerduty.bean.UserPostRequest;

public class CreateUserTestCases extends AbstractTestCase{
	
	public CreateUserTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testCreateUser() throws Exception 
	{
		UserPostRequest request = new UserPostRequest();
		
		UserPostResponse userPostResponse = getConnector().createUser(request);
		assertNotNull(userPostResponse);
	    assertEquals("200", userPostResponse.getStatusCode());
	}

}
