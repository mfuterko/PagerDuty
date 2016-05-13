/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.EscalationRuleByPolicyPutRequest;
import org.mule.modules.pagerduty.bean.EscalationRuleByPolicyPutResponse;

public class UpdateEscalationRuleTestCases extends AbstractTestCase {
	
	public UpdateEscalationRuleTestCases()
	{
		super();
	}
	    @Test
	    @Category({FunctionalTestSuite.class})
	    public void testUpdateEscalationRule() throws Exception 
	    {
	    	String escalationPolicyId = getEscalationPolicyId(); 
	    	String escalationRuleId = getEscalationRuleId();
	    	EscalationRuleByPolicyPutRequest request = new EscalationRuleByPolicyPutRequest();
	    	EscalationRuleByPolicyPutResponse escalationRuleByPolicyPutResponse = getConnector().updateEscalationRule(escalationPolicyId, escalationRuleId, request);
	    	assertNotNull(escalationRuleByPolicyPutResponse);
		     assertEquals("200", escalationRuleByPolicyPutResponse.getStatusCode() );
	    }

}
