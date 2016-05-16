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
import org.mule.modules.pagerduty.bean.UserPutRequest;
import org.mule.modules.pagerduty.bean.UserPutResponse;

public class UpdateUserTestCases extends PagerDutyAbstractTestCases{
	
	public UpdateUserTestCases()
	{
		super(PagerDutyConnector.class);
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testUpdateUser() throws Exception 
	{
		String id = getId();
		UserPutRequest request = new UserPutRequest();
		
		UserPutResponse userPutResponse = getConnector().updateUser(id,request);
		
		assertNotNull(userPutResponse);
	    assertEquals("200", userPutResponse.getStatusCode());
	}

}
