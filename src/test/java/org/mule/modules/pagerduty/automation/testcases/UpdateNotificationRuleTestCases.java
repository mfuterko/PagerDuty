/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.NotificationRulePutResponse;

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
		NotificationRulePutResponse notificationRulePutResponse = getConnector().updateNotificationRule(userId,notificationRuleId, null);
		assertNotNull(notificationRulePutResponse);
	    assertEquals("200", notificationRulePutResponse.getStatusCode() );
	}
}
