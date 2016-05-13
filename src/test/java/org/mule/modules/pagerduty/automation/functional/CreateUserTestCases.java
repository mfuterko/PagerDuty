package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.UserPostRequest;
import org.mule.modules.pagerduty.bean.UserPostResponse;

public class CreateUserTestCases extends PagerDutyAbstractTestCases{
	
	public CreateUserTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testCreateUser() throws Exception 
	{
		UserPostRequest request = new UserPostRequest();
		
		UserPostResponse userPostResponse = getConnector().createUser(request);
		assertNotNull(userPostResponse);
	    assertEquals("200", userPostResponse.getStatusCode());
	}

}
