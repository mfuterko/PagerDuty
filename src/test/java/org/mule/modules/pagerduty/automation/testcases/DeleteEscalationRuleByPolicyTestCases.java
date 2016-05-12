package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.StatusResponse;

public class DeleteEscalationRuleByPolicyTestCases extends AbstractTestCase{

		public DeleteEscalationRuleByPolicyTestCases()
		{
			super();
		}
	    @Test
	    @Category({FunctionalTestSuite.class})
	    public void testDeleteEscalationRuleByPolicy() throws Exception 
	    {
	    	String escalation_policy_id = getEscalationPolicyId();
	    	String id = getEscalationId();
	    	
	    	StatusResponse  statusResponse = getConnector().deleteEscalationRuleByPolicy(escalation_policy_id, id);
	    	assertNotNull(statusResponse);
		     assertEquals("200", statusResponse.getStatusCode() );
	    }
}
