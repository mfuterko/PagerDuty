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
import org.mule.modules.pagerduty.bean.ServicePostRequest;
import org.mule.modules.pagerduty.bean.ServicePostResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class PostServiceTestCases.
 */
public class PostServiceTestCases extends PagerDutyAbstractTestCases {
	
	/**
	 * Instantiates a new post service test cases.
	 */
	public PostServiceTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test post service.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testPostService() throws Exception 
	{
		ServicePostRequest request = new ServicePostRequest();
		request.setName("Service1");
		request.setDescription(null);
		request.setEscalation_policy_id("PNHP3EH");
		request.setType("generic_events_api");
		request.setVendor_id(null);
		request.setAcknowledgment_timeout(35);
		request.setAuto_resolve_timeout(400);
		request.setSeverity_filter(null);
		
		ServicePostResponse servicePostResponse = getConnector().postService(request);
		assertNotNull(servicePostResponse);
	    assertEquals("200", servicePostResponse.getStatusCode() );
	}

}
