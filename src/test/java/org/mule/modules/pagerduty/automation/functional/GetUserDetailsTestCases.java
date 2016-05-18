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
import org.mule.modules.pagerduty.bean.UserDetailsGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetUserDetailsTestCases.
 */
public class GetUserDetailsTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the user details test cases.
	 */
	public GetUserDetailsTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test get user details.
	 *
	 * @throws Exception the exception
	 */
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
