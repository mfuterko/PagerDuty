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
import org.mule.modules.pagerduty.bean.UsersListByScheduleGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetListOfSchedulesOfUserTestCases.
 */
public class GetListOfSchedulesOfUserTestCases extends PagerDutyAbstractTestCases{

	/**
	 * Instantiates a new gets the list of schedules of user test cases.
	 */
	public GetListOfSchedulesOfUserTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test get list of schedules of user.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetListOfSchedulesOfUser() throws Exception 
	{
		String id = getId();
		String since = getSince();
		String until = getUntil();
		
		UsersListByScheduleGetResponse usersListByScheduleGetResponse = getConnector().getListOfSchedulesOfUser(id,since,until);
		assertNotNull(usersListByScheduleGetResponse);
	    assertEquals("200", usersListByScheduleGetResponse.getStatusCode());
	}
		
}
