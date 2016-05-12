package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.TeamGetResponse;

public class GetTeamInformationTestCases extends AbstractTestCase{
	
	public GetTeamInformationTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetTeamInformation() throws Exception 
	{
		String teamId = getTeamId();
		TeamGetResponse teamGetResponse = getConnector().getTeamInformation(teamId);
		assertNotNull(teamGetResponse);
	    assertEquals("200", teamGetResponse.getStatusCode());
	}

}
