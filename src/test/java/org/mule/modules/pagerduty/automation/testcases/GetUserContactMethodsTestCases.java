package src.test.java.org.mule.modules.pagerduty.automation.testcases;

public class GetUserContactMethodsTestCases extends AbstractTestCase{
	
	public GetUserContactMethodsTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetUserContactMethods() throws Exception 
	{
		String id = getId();
		
		UserContactMethodsGetResponse userContactMethodsGetResponse = getConnector().getUserContactMethods(id);
		assertNotNull(userContactMethodsGetResponse);
	    assertEquals("200", userContactMethodsGetResponse.getStatusCode());
	}

}
