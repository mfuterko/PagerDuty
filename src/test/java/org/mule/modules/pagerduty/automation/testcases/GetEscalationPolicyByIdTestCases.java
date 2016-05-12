package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.EscalationPolicyIdGetResponse;

public class GetEscalationPolicyByIdTestCases extends AbstractTestCase{
	
	public GetEscalationPolicyByIdTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetEscalationPolicyById() throws Exception {
		
		String id = getEscalationId();
		EscalationPolicyIdGetResponse  escalationPolicyIdGetResponse = getConnector().getEscalationPolicyById(id);
		 assertNotNull(escalationPolicyIdGetResponse);
	     assertEquals("200", escalationPolicyIdGetResponse.getStatusCode());
		
	}

}
