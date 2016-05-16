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

public class GetListOfSchedulesOfUserTestCases extends PagerDutyAbstractTestCases{

	public GetListOfSchedulesOfUserTestCases()
	{
		super(PagerDutyConnector.class);
	}
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
