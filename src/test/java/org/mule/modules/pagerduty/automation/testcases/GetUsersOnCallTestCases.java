package src.test.java.org.mule.modules.pagerduty.automation.testcases;

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
