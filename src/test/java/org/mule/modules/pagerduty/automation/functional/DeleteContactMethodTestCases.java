package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.StatusResponse;

public class DeleteContactMethodTestCases extends PagerDutyAbstractTestCases{
	
	public DeleteContactMethodTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testDeleteContactMethod() throws Exception 
	{
		String userId = getUserId();
		String contactMethodId = getContactMethodId();
		StatusResponse statusResponse = getConnector().deleteContactMethod(userId,contactMethodId);
		assertNotNull(statusResponse);
	    assertEquals("200", statusResponse.getStatusCode());
	}

}
