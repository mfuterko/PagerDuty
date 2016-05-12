package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;

public class GetEscalationRulesByIdTestCases extends AbstractTestCase{
	
	public GetEscalationRulesByIdTestCases()
	{
		super();
	}
	    @Test
	    @Category({FunctionalTestSuite.class})
	    public void testGetEscalationRulesById() throws Exception 
	    {
	    	String id = getEscalationId();
	    	EscalationRulesByIdGetResponse escalationRulesByIdGetResponse = getConnector().getEscalationRulesById(id);
	    	assertNotNull(escalationRulesByIdGetResponse);
		     assertEquals("200", escalationRulesByIdGetResponse.getStatusCode() );
	    	
	    }

}
