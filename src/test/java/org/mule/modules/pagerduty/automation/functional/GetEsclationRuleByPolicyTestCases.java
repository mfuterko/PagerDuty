/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.EscalationRuleByPolicyGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetEsclationRuleByPolicyTestCases.
 */
public class GetEsclationRuleByPolicyTestCases extends PagerDutyAbstractTestCases {
	
	/**
	 * Instantiates a new gets the esclation rule by policy test cases.
	 */
	public GetEsclationRuleByPolicyTestCases()
	{
		super(PagerDutyConnector.class);
	}
	    
    	/**
    	 * Test get esclation rule by policy.
    	 *
    	 * @throws Exception the exception
    	 */
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
