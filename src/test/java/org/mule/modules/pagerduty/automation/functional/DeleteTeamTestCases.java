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
import org.mule.modules.pagerduty.bean.StatusResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class DeleteTeamTestCases.
 */
public class DeleteTeamTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new delete team test cases.
	 */
	public DeleteTeamTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test delete team.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testDeleteTeam() throws Exception 
	{
		String teamId = "PX8ZIBZ";
		StatusResponse statusResponse = getConnector().deleteTeam(teamId);
		assertNotNull(statusResponse);
	    assertEquals("204", statusResponse.getStatusCode() );
	}

}
