package src.test.java.org.mule.modules.pagerduty.automation.testcases;

public class DeleteContactMethodTestCases extends AbstractTestCase{
	
	public DeleteContactMethodTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testDeleteContactMethod() throws Exception 
	{
		String userId = getUserId();
		String contactMethodId = getContactMethodId();
		StatusResponse statusResponse = getConnector().deleteContactMethod(userId,contactMethodId);
		assertNotNull(statusResponse);
	    assertEquals("200", statusResponse.getStatusCode());
	}

}
