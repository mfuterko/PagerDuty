package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.NotificationRuleGetResponse;

public class GetNotificationRuleDetailsTestCases extends PagerDutyAbstractTestCases{
	
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
