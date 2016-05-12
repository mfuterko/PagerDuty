package src.test.java.org.mule.modules.pagerduty.automation.testcases;

public class UpdateNotificationRuleTestCases extends AbstractTestCase{

	
	public UpdateNotificationRuleTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testUpdateNotificationRule() throws Exception 
	{
		String userId = getUserId();
		String notificationRuleId = getNotificationRuleId();
		NotificationRulePutResponse notificationRulePutResponse = getConnector().updateNotificationRule(userId,notificationRuleId);
		assertNotNull(notificationRulePutResponse);
	    assertEquals("200", notificationRulePutResponse.getStatusCode() );
	}
}
