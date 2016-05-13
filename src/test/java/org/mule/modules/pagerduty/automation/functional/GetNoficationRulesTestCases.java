/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.NotificationRulesGetResponse;

public class GetNoficationRulesTestCases  extends PagerDutyAbstractTestCases{
	
	public GetNoficationRulesTestCases()
	{
		super();
	}
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
