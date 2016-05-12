package src.test.java.org.mule.modules.pagerduty.automation.testcases;

import org.mule.modules.pagerduty.automation.AbstractTestCase;

public class DeleteTeamTestCases extends AbstractTestCase{
	
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
