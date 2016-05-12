package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.NotificationRulesGetResponse;

public class GetNoficationRulesTestCases  extends AbstractTestCase{
	
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
