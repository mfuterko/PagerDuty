package src.test.java.org.mule.modules.pagerduty.automation.testcases;

public class CreateContactMethodTestCases extends AbstractTestCase{
	
	public CreateContactMethodTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testCreateContactMethod() throws Exception 
	{
		String userId = getUserId();
		ContactMethodPostRequest request = new ContactMethodPostRequest();
		
		ContactMethodPostResponse contactMethodPostResponse = getConnector().createContactMethod(userId,request);
		assertNotNull(contactMethodPostResponse);
	    assertEquals("200", contactMethodPostResponse.getStatusCode());
	}

}
