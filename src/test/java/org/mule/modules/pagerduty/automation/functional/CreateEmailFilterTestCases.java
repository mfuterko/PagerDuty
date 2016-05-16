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

public class CreateEmailFilterTestCases extends PagerDutyAbstractTestCases{
	
	public CreateEmailFilterTestCases()
	{
		super(PagerDutyConnector.class);
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testCreateEmailFilter() throws Exception 
	{
		String serviceId = getServiceId();
		EmailFilterPostRequest request = new EmailFilterPostRequest();
		
		EmailFiltersPostResponse emailFiltersPostResponse = getConnector().createEmailFilter(serviceId,request);
		
		assertNotNull(emailFiltersPostResponse);
	    assertEquals("200", emailFiltersPostResponse.getStatusCode());
	}

}
