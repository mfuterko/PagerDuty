package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.StatusResponse;

public class DeleteNotificationRuleTestCases extends PagerDutyAbstractTestCases{
	
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
		
		StatusResponse statusResponse = getConnector().deleteNotificationRule(userId,notificationRuleId);
		assertNotNull(statusResponse);
	    assertEquals("200", statusResponse.getStatusCode());
	}

}
