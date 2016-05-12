package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.UserDetailsOnCallGetResponse;
public class GetUserDetailsOnCallTestCases extends AbstractTestCase {
	
	public GetUserDetailsOnCallTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetUserDetailsOnCall() throws Exception 
	{
		String id = getId();
		String include = getInclude();
		UserDetailsOnCallGetResponse userDetailsOnCallGetResponse = getConnector().getUserDetailsOnCall(id,include);
		assertNotNull(userDetailsOnCallGetResponse);
	    assertEquals("200", userDetailsOnCallGetResponse.getStatusCode());
	}

}
