package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.StatusResponse;

public class DeleteServiceTestCases extends AbstractTestCase{
	
	public DeleteServiceTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testDeleteService() throws Exception 
	{
		String id = getId();
		StatusResponse statusResponse = getConnector().deleteService(id);
		
		assertNotNull(statusResponse);
	    assertEquals("200", statusResponse.getStatusCode());
				
	}

}
