package src.test.java.org.mule.modules.pagerduty.automation.testcases;

public class CreateTeamTestCases extends AbstractTestCase{

	public CreateTeamTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testCreateTeam() throws Exception 
	{
		TeamPostRequest request = new TeamPostRequest();
		TeamsPostResponse teamsPostResponse = getConnector().CreateTeam(request);
		assertNotNull(teamsPostResponse);
	    assertEquals("200", teamsPostResponse.getStatusCode() );
	}
}
