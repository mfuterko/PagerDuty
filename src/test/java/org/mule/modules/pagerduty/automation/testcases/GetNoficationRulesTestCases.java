package src.test.java.org.mule.modules.pagerduty.automation.testcases;

public class GetNoficationRulesTestCases  extends AbstractTestCase{
	
	public GetNoficationRulesTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetNoficationRules() throws Exception 
	{
		String userId = getUserId();
		
		NotificationRulesGetResponse notificationRulesGetResponse = getConnector().getNoficationRules(userId);
		
		assertNotNull(notificationRulesGetResponse);
	    assertEquals("200", notificationRulesGetResponse.getStatusCode() );
	}

}
