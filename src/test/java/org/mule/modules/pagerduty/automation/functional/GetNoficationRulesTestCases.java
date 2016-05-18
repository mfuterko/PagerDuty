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
import org.mule.modules.pagerduty.bean.NotificationRulesGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetNoficationRulesTestCases.
 */
public class GetNoficationRulesTestCases  extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the nofication rules test cases.
	 */
	public GetNoficationRulesTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test get nofication rules.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetNoficationRules() throws Exception 
	{
		String userId = getUserId();
		
		NotificationRulesGetResponse notificationRulesGetResponse = getConnector().getNoficationRules(userId);
		
		assertNotNull(notificationRulesGetResponse);
	    assertEquals("200", notificationRulesGetResponse.getStatusCode() );
	}

}
