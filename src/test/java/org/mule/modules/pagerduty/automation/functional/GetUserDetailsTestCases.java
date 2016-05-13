package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.UserDetailsGetResponse;

public class GetUserDetailsTestCases extends PagerDutyAbstractTestCases{
	
	public GetUserDetailsTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetUserDetails() throws Exception 
	{
		String id = getId();
		String include = getInclude();
		UserDetailsGetResponse userDetailsOnCallGetResponse = getConnector().getUserDetails(id,include);
		assertNotNull(userDetailsOnCallGetResponse);
	    assertEquals("200", userDetailsOnCallGetResponse.getStatusCode());
	}

}