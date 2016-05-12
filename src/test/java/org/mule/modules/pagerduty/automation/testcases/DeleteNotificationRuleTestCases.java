package src.test.java.org.mule.modules.pagerduty.automation.testcases;

public class DeleteNotificationRuleTestCases extends AbstractTestCase{
	
	public DeleteNotificationRuleTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testDeleteNotificationRule() throws Exception 
	{
		String userId = getUserId();
		String notificationRuleId = getnotificationRuleId();
		
		StatusResponse statusResponse = getConnector().DeleteNotificationRule(userId,notificationRuleId);
		assertNotNull(statusResponse);
	    assertEquals("200", statusResponse.getStatusCode());
	}

}
