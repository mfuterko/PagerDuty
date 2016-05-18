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
import org.mule.modules.pagerduty.bean.UserDetailsOnCallGetResponse;
// TODO: Auto-generated Javadoc

/**
 * The Class GetUserDetailsOnCallTestCases.
 */
public class GetUserDetailsOnCallTestCases extends PagerDutyAbstractTestCases {
	
	/**
	 * Instantiates a new gets the user details on call test cases.
	 */
	public GetUserDetailsOnCallTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test get user details on call.
	 *
	 * @throws Exception the exception
	 */
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
