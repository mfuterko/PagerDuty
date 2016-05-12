package test.java.org.mule.modules.pagerduty.automation.testcases;

public class DeleteServiceTestCases extends AbstractTestCase{
	
	public DeleteServiceTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testDeleteService() throws Exception 
	{
		String id = getId();
		StatusResponse statusResponse = getConnector().deleteService(id);
		
		assertNotNull(statusResponse);
	    assertEquals("200", statusResponse.getStatusCode());
				
	}

}
