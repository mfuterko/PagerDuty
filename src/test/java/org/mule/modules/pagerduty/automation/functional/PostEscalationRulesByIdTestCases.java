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
import org.mule.modules.pagerduty.bean.EscalationRulesByIdPostResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class PostEscalationRulesByIdTestCases.
 */
public class PostEscalationRulesByIdTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new post escalation rules by id test cases.
	 */
	public PostEscalationRulesByIdTestCases()
	{
		super(PagerDutyConnector.class);
	}
	    
    	/**
    	 * Test post escalation rules by id.
    	 *
    	 * @throws Exception the exception
    	 */
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
