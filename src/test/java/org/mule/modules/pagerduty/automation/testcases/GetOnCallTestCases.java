package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.bean.OnCallGetResponse;
import org.mule.tools.devkit.ctf.junit.RegressionTests;

public class GetOnCallTestCases extends AbstractTestCase{
	
	public GetOnCallTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetOnCall() throws Exception {
		
		String query = getEscalationId(); 
		OnCallGetResponse onCallGetResponse = getConnector().getOnCall(query);
		assertNotNull(onCallGetResponse);
	     assertEquals("200", onCallGetResponse.getStatusCode());
	}
		

}
