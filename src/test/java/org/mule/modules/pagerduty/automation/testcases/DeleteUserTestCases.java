package src.test.java.org.mule.modules.pagerduty.automation.testcases;

public class DeleteUserTestCases extends AbstractTestCase{
	
	public DeleteUserTestCases()
	{
		super();
	}
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
