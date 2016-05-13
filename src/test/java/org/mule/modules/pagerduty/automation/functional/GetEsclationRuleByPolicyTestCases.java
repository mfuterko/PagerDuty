/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.EscalationRuleByPolicyGetResponse;

public class GetEsclationRuleByPolicyTestCases extends PagerDutyAbstractTestCases {
	
	public GetEsclationRuleByPolicyTestCases()
	{
		super();
	}
	    @Test
	    @Category({FunctionalTestSuite.class})
	    public void testGetEsclationRuleByPolicy() throws Exception 
	    {
	    	String escalation_policy_id = getEscalationPolicyId(); 
	    	String id = getEscalationId();
	    	
	    	EscalationRuleByPolicyGetResponse escalationRuleByPolicyGetResponse = getConnector().getEsclationRuleByPolicy(escalation_policy_id, id);
	    	assertNotNull(escalationRuleByPolicyGetResponse);
		     assertEquals("200", escalationRuleByPolicyGetResponse.getStatusCode());
	    }

}
