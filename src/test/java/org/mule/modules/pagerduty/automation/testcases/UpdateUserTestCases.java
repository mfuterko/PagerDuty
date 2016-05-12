package src.test.java.org.mule.modules.pagerduty.automation.testcases;

public class UpdateUserTestCases extends AbstractTestCase{
	
	public UpdateUserTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testUpdateUser() throws Exception 
	{
		String id = getId();
		UserPutRequest request = new UserPutRequest();
		
		UserPutResponse userPutResponse = getConnector().updateUser(id,request);
		
		assertNotNull(userPutResponse);
	    assertEquals("200", userPutResponse.getStatusCode());
	}

}
