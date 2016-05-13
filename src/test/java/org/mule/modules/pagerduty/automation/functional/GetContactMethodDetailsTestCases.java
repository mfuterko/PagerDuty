package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.ContactMethodDetailsGetResponse;

public class GetContactMethodDetailsTestCases extends PagerDutyAbstractTestCases{
	
	public GetContactMethodDetailsTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetContactMethodDetails() throws Exception 
	{
		String userId = getUserId();
		String contactMethodId = getContactMethodId();
		
		ContactMethodDetailsGetResponse contactMethodDetailsGetResponse = getConnector().getContactMethodDetails(userId,contactMethodId);
		assertNotNull(contactMethodDetailsGetResponse);
	    assertEquals("200", contactMethodDetailsGetResponse.getStatusCode());
	}

}
