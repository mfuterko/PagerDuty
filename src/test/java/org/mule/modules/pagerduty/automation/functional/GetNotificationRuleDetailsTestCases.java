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
import org.mule.modules.pagerduty.bean.NotificationRuleGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetNotificationRuleDetailsTestCases.
 */
public class GetNotificationRuleDetailsTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the notification rule details test cases.
	 */
	public GetNotificationRuleDetailsTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test get notification rule details.
	 *
	 * @throws Exception the exception
	 */
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
