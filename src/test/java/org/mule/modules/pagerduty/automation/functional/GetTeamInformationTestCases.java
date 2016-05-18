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
import org.mule.modules.pagerduty.bean.TeamGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetTeamInformationTestCases.
 */
public class GetTeamInformationTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the team information test cases.
	 */
	public GetTeamInformationTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test get team information.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetTeamInformation() throws Exception 
	{
		String teamId = "PEVRWJ5";
		TeamGetResponse teamGetResponse = getConnector().getTeamInformation(teamId);
		assertNotNull(teamGetResponse);
	    assertEquals("200", teamGetResponse.getStatusCode());
	}

}
