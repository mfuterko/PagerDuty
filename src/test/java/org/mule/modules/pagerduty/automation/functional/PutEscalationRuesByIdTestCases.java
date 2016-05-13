/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.EscalationRulesByIdPutRequest;
import org.mule.modules.pagerduty.bean.EscalationRulesByIdPutResponse;

public class PutEscalationRuesByIdTestCases extends PagerDutyAbstractTestCases{
	
	public PutEscalationRuesByIdTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testPutEscalationRuesById() throws Exception {
		
		String escalationPolicyId = getEscalationPolicyId(); 
		String escalationRuleId = getEscalationRuleId(); 
		EscalationRulesByIdPutRequest escalationRulesByIdPutRequest = new EscalationRulesByIdPutRequest();
		EscalationRulesByIdPutResponse escalationRulesByIdPutResponse = getConnector().putEscalationRuesById(escalationPolicyId, escalationRuleId, escalationRulesByIdPutRequest);
		
		assertNotNull(escalationRulesByIdPutResponse);
	     assertEquals("200", escalationRulesByIdPutResponse.getStatusCode() );
		
	}

}
