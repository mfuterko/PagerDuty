package src.test.java.org.mule.modules.pagerduty.automation.testcases;

public class GetContactMethodDetailsTestCases extends AbstractTestCase{
	
	public GetContactMethodDetailsTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetContactMethodDetails() throws Exception 
	{
		String userId = getUserId();
		String contactMethodId = getContactMethodId();
		
		ContactMethodDetailsGetResponse contactMethodDetailsGetResponse = getConnector().getContactMethodDetails(userID,contactMethodId);
		assertNotNull(contactMethodDetailsGetResponse);
	    assertEquals("200", contactMethodDetailsGetResponse.getStatusCode());
	}

}
