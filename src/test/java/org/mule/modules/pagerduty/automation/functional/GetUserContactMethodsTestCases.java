package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.UserContactMethodsGetResponse;

public class GetUserContactMethodsTestCases extends PagerDutyAbstractTestCases{
	
	public GetUserContactMethodsTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetUserContactMethods() throws Exception 
	{
		String id = getId();
		
		UserContactMethodsGetResponse userContactMethodsGetResponse = getConnector().getUserContactMethods(id);
		assertNotNull(userContactMethodsGetResponse);
	    assertEquals("200", userContactMethodsGetResponse.getStatusCode());
	}

}
