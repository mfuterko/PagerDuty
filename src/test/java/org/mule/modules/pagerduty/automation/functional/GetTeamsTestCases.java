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
import org.mule.modules.pagerduty.bean.Teams;
import org.mule.modules.pagerduty.bean.TeamsGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetTeamsTestCases.
 */
public class GetTeamsTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the teams test cases.
	 */
	public GetTeamsTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test get teams.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetTeams() throws Exception 
	{
		String query = null;
		TeamsGetResponse response = getConnector().getTeams(query);
		Teams[] teams = response.getTeams();
		for(Teams t : teams){
			System.out.println("Id is : "+t.getId());
			System.out.println("Name : "+t.getName());
			System.out.println("Description is: "+t.getDescription());
			
		}
		assertNotNull(response);
	    assertEquals("200", response.getStatusCode() );
	}

}
