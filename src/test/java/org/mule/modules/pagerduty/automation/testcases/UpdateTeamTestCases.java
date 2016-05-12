package src.test.java.org.mule.modules.pagerduty.automation.testcases;

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
