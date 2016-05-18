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
import org.mule.modules.pagerduty.bean.UserPostRequest;
import org.mule.modules.pagerduty.bean.UserPostResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class CreateUserTestCases.
 */
public class CreateUserTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new creates the user test cases.
	 */
	public CreateUserTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test create user.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testCreateUser() throws Exception 
	{
		UserPostRequest request = new UserPostRequest();
		
		UserPostResponse userPostResponse = getConnector().createUser(request);
		assertNotNull(userPostResponse);
	    assertEquals("201", userPostResponse.getStatusCode());
	}

}
