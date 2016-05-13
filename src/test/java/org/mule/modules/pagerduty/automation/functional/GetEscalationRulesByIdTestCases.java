package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.EscalationRulesByIdGetResponse;

public class GetEscalationRulesByIdTestCases extends PagerDutyAbstractTestCases{
	
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
