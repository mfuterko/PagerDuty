package src.test.java.org.mule.modules.pagerduty.automation.testcases;

public class CreateNotificationRulesTestCases extends AbstractTestCase{
	
	public CreateNotificationRulesTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testCreateNotificationRules() throws Exception 
	{
		String userId = getUserId();
		NotificationRulePostRequest request = new NotificationRulePostRequest();
		
		NotifcationRulePostResponse notifcationRulePostResponse = getConnector().CreateNotificationRules(userId,request);
		assertNotNull(notifcationRulePostResponse);
	    assertEquals("200", notifcationRulePostResponse.getStatusCode() );
	}

}
