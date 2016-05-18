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
import org.mule.modules.pagerduty.bean.EmailFilterPostRequest;
import org.mule.modules.pagerduty.bean.EmailFiltersPostResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class CreateEmailFilterTestCases.
 */
public class CreateEmailFilterTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new creates the email filter test cases.
	 */
	public CreateEmailFilterTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test create email filter.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testCreateEmailFilter() throws Exception 
	{
		String serviceId = getServiceId();
		EmailFilterPostRequest request = new EmailFilterPostRequest();
		
		EmailFiltersPostResponse emailFiltersPostResponse = getConnector().createEmailFilter(serviceId,request);
		
		assertNotNull(emailFiltersPostResponse);
	    assertEquals("201", emailFiltersPostResponse.getStatusCode());
	}

}
