package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import org.mule.modules.pagerduty;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.bean.EscalationPoliciesGetResponse;
import org.mule.tools.devkit.ctf.junit.RegressionTests;

public class GetEscalationPoliciesTestCases extends AbstractTestCase{
	
	public GetEscalationPoliciesTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testEscalationPolicies() throws Exception {
		
		String query = getEscalationId();
		String teams = getTeams();
		String include = getInclude();
		EscalationPoliciesGetResponse escalationPoliciesGetResponse = getConnector().getEscalationPolicies(query, teams,include);
		 assertNotNull(escalationPoliciesGetResponse);
	     assertEquals("200", escalationPoliciesGetResponse.getStatusCode());
    }

}
