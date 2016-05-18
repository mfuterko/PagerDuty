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
import org.mule.modules.pagerduty.bean.EmailFilterPutRequest;
import org.mule.modules.pagerduty.bean.EmailFilterPutResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class UpdateEmailFilterTestCases.
 */
public class UpdateEmailFilterTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new update email filter test cases.
	 */
	public UpdateEmailFilterTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test update email filter.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testUpdateEmailFilter() throws Exception 
	{
		String serviceId = "1";
		String emailFilterId = "1";
		
		EmailFilterPutRequest request = new EmailFilterPutRequest();
		request.setBody_mode("always");
		request.setSubject_mode("always");
		request.setBody_regex(null);
		request.setFrom_email_mode(null);
		request.setFrom_email_regex(null);
		request.setSubject_regex(null);
			
		EmailFilterPutResponse emailFilterPutResponse = getConnector().updateEmailFilter(serviceId,emailFilterId,request);
		assertNotNull(emailFilterPutResponse);
	    assertEquals("200", emailFilterPutResponse.getStatusCode());
	}

}
