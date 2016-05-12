package test.java.org.mule.modules.pagerduty.automation.testcases;

import src.test.java.org.mule.modules.pagerduty.automation.testcases.AbstractTestCase;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Category;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.FunctionalTestSuite;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Test;

public class DeleteEmailFilterTestCases extends AbstractTestCase{
	
	public DeleteEmailFilterTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testDeleteEmailFilter() throws Exception 
	{
		String serviceId = getServiceId();
		
		String emailFilterId = getemailFilterId();
		
		StatusResponse statusResponse = getConnector().deleteEmailFilter(serviceId,emailFilterId);
		
		assertNotNull(statusResponse);
	    assertEquals("200", statusResponse.getStatusCode());
		
		
	}

}
