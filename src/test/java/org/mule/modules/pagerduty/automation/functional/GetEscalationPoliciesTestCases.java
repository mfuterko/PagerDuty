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

public class GetEscalationPoliciesTestCases extends PagerDutyAbstractTestCases{
	
	public GetEscalationPoliciesTestCases()
	{
		super(PagerDutyConnector.class);
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testEscalationPolicies() throws Exception {
		
		String query = "";
		String teams = "";
		String include = "";
		EscalationPoliciesGetResponse escalationPoliciesGetResponse = getConnector().getEscalationPolicies(query,teams,include);
		 assertNotNull(escalationPoliciesGetResponse);
	     assertEquals("200", escalationPoliciesGetResponse.getStatusCode());
    }

}
