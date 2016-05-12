package src.test.java.org.mule.modules.pagerduty.automation.testcases;

public class GetNotificationRuleDetailsTestCases extends AbstractTestCase{
	
	public GetNotificationRuleDetailsTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetNotificationRuleDetails() throws Exception 
	{
		String userId = getUserId();
		String notificationRuleId = getNotificationRuleId();
		
		NotificationRuleGetResponse notificationRuleGetResponse = getConnector().getNotificationRuleDetails(userId,notificationRuleId);
		assertNotNull(notificationRuleGetResponse);
	    assertEquals("200", notificationRuleGetResponse.getStatusCode() );
	}

}
