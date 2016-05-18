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
import org.mule.modules.pagerduty.bean.Team;
import org.mule.modules.pagerduty.bean.TeamPostRequest;
import org.mule.modules.pagerduty.bean.TeamsPostResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class CreateTeamTestCases.
 */
public class CreateTeamTestCases extends PagerDutyAbstractTestCases{

	/**
	 * Instantiates a new creates the team test cases.
	 */
	public CreateTeamTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test create team.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testCreateTeam() throws Exception 
	{
		TeamPostRequest request = new TeamPostRequest();
		request.setName("Team4");
		request.setDescription("Test team4 creation");
		TeamsPostResponse response = getConnector().createTeam(request);
		if(response != null){
			Team t = response.getTeam();
			System.out.println("The id of the Team is : "+t.getId());
			System.out.println("The name of the Team is : "+t.getName());
			System.out.println("The description of the Team is : "+t.getDescription());
		}
		assertNotNull(response);
	    assertEquals("201", response.getStatusCode() );
	}
}
