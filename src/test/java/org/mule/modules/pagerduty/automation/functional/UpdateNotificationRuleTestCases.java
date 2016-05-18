/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.NotificationRulePutResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class UpdateNotificationRuleTestCases.
 */
public class UpdateNotificationRuleTestCases extends PagerDutyAbstractTestCases{

	
	/**
	 * Instantiates a new update notification rule test cases.
	 */
	public UpdateNotificationRuleTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test update notification rule.
	 *
	 * @throws Exception the exception
	 */
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
