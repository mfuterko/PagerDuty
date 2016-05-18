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
import org.mule.modules.pagerduty.bean.EscalationPoliciesGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetEscalationPoliciesTestCases.
 */
public class GetEscalationPoliciesTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the escalation policies test cases.
	 */
	public GetEscalationPoliciesTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test escalation policies.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testEscalationPolicies() throws Exception {
		
		String query = "";
		String teams = "";
		String include = "";
		EscalationPoliciesGetResponse escalationPoliciesGetResponse = getConnector().getEscalationPolicies(null,null,null);
		 assertNotNull(escalationPoliciesGetResponse);
	     assertEquals("200", escalationPoliciesGetResponse.getStatusCode());
    }

}
