package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.TeamPutRequest;
import org.mule.modules.pagerduty.bean.TeamPutResponse;

public class UpdateTeamTestCases extends AbstractTestCase{
	
	public UpdateTeamTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testUpdateTeam() throws Exception 
	{
		String teamId = getTeamId();
		TeamPutRequest request = new TeamPutRequest();
		TeamPutResponse teamPutResponse = getConnector().updateTeam(teamId,request);
		assertNotNull(teamPutResponse);
	    assertEquals("200", teamPutResponse.getStatusCode() );
	}

}
