package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.NotifcationRulePostResponse;
import org.mule.modules.pagerduty.bean.NotificationRulePostRequest;

public class CreateNotificationRulesTestCases extends PagerDutyAbstractTestCases{
	
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
		
		NotifcationRulePostResponse notifcationRulePostResponse = getConnector().createNotificationRules(userId,request);
		assertNotNull(notifcationRulePostResponse);
	    assertEquals("200", notifcationRulePostResponse.getStatusCode() );
	}

}
