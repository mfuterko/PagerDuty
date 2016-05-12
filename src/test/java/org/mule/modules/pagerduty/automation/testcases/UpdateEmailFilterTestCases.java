package test.java.org.mule.modules.pagerduty.automation.testcases;

import org.mule.modules.pagerduty.bean.EmailFilterPutRequest;

import src.test.java.org.mule.modules.pagerduty.automation.testcases.AbstractTestCase;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Category;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.FunctionalTestSuite;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Test;

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
