package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.UserPutRequest;
import org.mule.modules.pagerduty.bean.UserPutResponse;

public class UpdateUserTestCases extends AbstractTestCase{
	
	public UpdateUserTestCases()
	{
		super();
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
