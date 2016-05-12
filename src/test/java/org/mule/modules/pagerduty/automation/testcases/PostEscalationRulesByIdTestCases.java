package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.EscalationRulesByIdPostResponse;

public class PostEscalationRulesByIdTestCases extends AbstractTestCase{
	
	public PostEscalationRulesByIdTestCases()
	{
		super();
	}
	    @Test
	    @Category({FunctionalTestSuite.class})
	    public void testPostEscalationRulesById() throws Exception 
	    {
	    	String id = getEscalationId();
	    	EscalationRulesByIdPostResponse  escalationRulesByIdPostResponse = getConnector().postEscalationRulesById(id);
	    	
	    	assertNotNull(escalationRulesByIdPostResponse);
		     assertEquals("200", escalationRulesByIdPostResponse.getStatusCode() );
	    }

}
