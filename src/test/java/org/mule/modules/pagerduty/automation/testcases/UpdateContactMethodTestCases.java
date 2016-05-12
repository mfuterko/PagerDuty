package src.test.java.org.mule.modules.pagerduty.automation.testcases;

public class UpdateContactMethodTestCases extends AbstractTestCase{
	
	public UpdateContactMethodTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testUpdateContactMethod() throws Exception 
	{
		String userId = getUserId();
		String contactMethodId = getContactMethodId();
		ContactMethodPutRequest request = new ContactMethodPutRequest();
		
		ContactMethodPutResponse contactMethodPutResponse = getConnector().updateContactMethod(userId,contactMethodId,request);
		assertNotNull(contactMethodPutResponse);
	    assertEquals("200", contactMethodPutResponse.getStatusCode());
	}

}
