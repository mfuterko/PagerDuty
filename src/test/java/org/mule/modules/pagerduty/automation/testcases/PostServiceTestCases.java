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
import org.mule.modules.pagerduty.bean.ServicePostRequest;
import org.mule.modules.pagerduty.bean.ServicePostResponse;

public class PostServiceTestCases extends AbstractTestCase {
	
	public PostServiceTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testPostService() throws Exception 
	{
		ServicePostRequest request = new ServicePostRequest();
		
		ServicePostResponse servicePostResponse = getConnector().postService(request);
		assertNotNull(servicePostResponse);
	    assertEquals("200", servicePostResponse.getStatusCode() );
	}

}
