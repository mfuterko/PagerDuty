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
import org.mule.modules.pagerduty.bean.TeamPutRequest;
import org.mule.modules.pagerduty.bean.TeamPutResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class UpdateTeamTestCases.
 */
public class UpdateTeamTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new update team test cases.
	 */
	public UpdateTeamTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test update team.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testUpdateTeam() throws Exception 
	{
		String teamId = "POS8ODC";
		TeamPutRequest request = new TeamPutRequest();
		request.setDescription("Description Update Test");
		request.setName("Name update");
		TeamPutResponse teamPutResponse = getConnector().updateTeam(teamId,request);
		assertNotNull(teamPutResponse);
		if(teamPutResponse != null){
			Team team = teamPutResponse.getTeam();
			System.out.println("The updated description is : "+team.getDescription());
		    
		}
		assertEquals("200", teamPutResponse.getStatusCode() );
	}
}
