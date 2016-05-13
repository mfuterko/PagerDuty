/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.UserDetailsGetResponse;
import org.mule.modules.pagerduty.bean.UserDetailsOnCallGetResponse;

public class GetUserDetailsTestCases extends AbstractTestCase{
	
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
