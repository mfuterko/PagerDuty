package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.EmailFilterPutRequest;
import org.mule.modules.pagerduty.bean.EmailFilterPutResponse;

public class UpdateEmailFilterTestCases extends AbstractTestCase{
	
	public UpdateEmailFilterTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testUpdateEmailFilter() throws Exception 
	{
		String serviceId = getServiceId();
		String emailFilterId = getEmailFilterId();
		
		EmailFilterPutRequest request = new EmailFilterPutRequest();
		EmailFilterPutResponse emailFilterPutResponse = getConnector().updateEmailFilter(serviceId,emailFilterId,request);
		assertNotNull(emailFilterPutResponse);
	    assertEquals("200", emailFilterPutResponse.getStatusCode());
	}

}
