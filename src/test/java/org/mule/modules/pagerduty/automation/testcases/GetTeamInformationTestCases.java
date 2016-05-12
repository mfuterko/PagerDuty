package src.test.java.org.mule.modules.pagerduty.automation.testcases;

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
		assertNotNull(statusResponse);
	    assertEquals("200", statusResponse.getStatusCode());
	}

}
