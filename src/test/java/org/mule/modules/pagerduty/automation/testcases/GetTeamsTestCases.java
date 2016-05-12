package src.test.java.org.mule.modules.pagerduty.automation.testcases;

public class GetTeamsTestCases extends AbstractTestCase{
	
	public GetTeamsTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetTeams() throws Exception 
	{
		String query = getQuery();
		TeamsGetResponse TeamsGetResponse = getConnector().getTeams(query);
		assertNotNull(TeamsGetResponse);
	    assertEquals("200", TeamsGetResponse.getStatusCode() );
	}

}
