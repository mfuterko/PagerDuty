package test.java.org.mule.modules.pagerduty.automation.testcases;

import src.test.java.org.mule.modules.pagerduty.automation.testcases.AbstractTestCase;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Category;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.FunctionalTestSuite;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Test;

public class CreateEmailFilterTestCases extends AbstractTestCase{
	
	public CreateEmailFilterTestCases()
	{
		super();
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
