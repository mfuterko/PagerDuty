package test.java.org.mule.modules.pagerduty.automation.testcases;

public class PostServiceTestCases extends AbstractTestCase {
	
	public PostServiceTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testPostService() throws Exception 
	{
		ServicePostRequest request = new ServicePostRequest();
		
		ServicePostResponse servicePostResponse = getConnector().postService(request);
		assertNotNull(servicePostResponse);
	    assertEquals("200", servicePostResponse.getStatusCode() );
	}

}
