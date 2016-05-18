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
import org.mule.modules.pagerduty.bean.EscalationRulesByIdGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetEscalationRulesByIdTestCases.
 */
public class GetEscalationRulesByIdTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the escalation rules by id test cases.
	 */
	public GetEscalationRulesByIdTestCases()
	{
		super(PagerDutyConnector.class);
	}
	    
    	/**
    	 * Test get escalation rules by id.
    	 *
    	 * @throws Exception the exception
    	 */
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
