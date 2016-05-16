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
import org.mule.modules.pagerduty.bean.StatusResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class DeleteNotificationRuleTestCases.
 */
public class DeleteNotificationRuleTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new delete notification rule test cases.
	 */
	public DeleteNotificationRuleTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test delete notification rule.
	 *
	 * @throws Exception the exception
	 */
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
