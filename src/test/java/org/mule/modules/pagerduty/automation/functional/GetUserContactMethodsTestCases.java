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
import org.mule.modules.pagerduty.bean.UserContactMethodsGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetUserContactMethodsTestCases.
 */
public class GetUserContactMethodsTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the user contact methods test cases.
	 */
	public GetUserContactMethodsTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test get user contact methods.
	 *
	 * @throws Exception the exception
	 */
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
