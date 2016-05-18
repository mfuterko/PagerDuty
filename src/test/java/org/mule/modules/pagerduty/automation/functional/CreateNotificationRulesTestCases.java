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
import org.mule.modules.pagerduty.bean.NotifcationRulePostResponse;
import org.mule.modules.pagerduty.bean.NotificationRulePostRequest;

// TODO: Auto-generated Javadoc
/**
 * The Class CreateNotificationRulesTestCases.
 */
public class CreateNotificationRulesTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new creates the notification rules test cases.
	 */
	public CreateNotificationRulesTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test create notification rules.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testCreateNotificationRules() throws Exception 
	{
		String userId = getUserId();
		NotificationRulePostRequest request = new NotificationRulePostRequest();
		
		NotifcationRulePostResponse notifcationRulePostResponse = getConnector().createNotificationRules(userId,request);
		assertNotNull(notifcationRulePostResponse);
	    assertEquals("201", notifcationRulePostResponse.getStatusCode() );
	}

}
