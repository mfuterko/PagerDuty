
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.StatusResponse;

public class DeleteTeamTestCases extends PagerDutyAbstractTestCases{
	
	public DeleteTeamTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testDeleteTeam() throws Exception 
	{
		String teamId = getTeamId();
		StatusResponse statusResponse = getConnector().deleteTeam(teamId);
		assertNotNull(statusResponse);
	    assertEquals("200", statusResponse.getStatusCode() );
	}

}
