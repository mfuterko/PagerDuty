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
import org.mule.modules.pagerduty.bean.ScheduleByIdGetResponse;

public class GetScheduleByIdTestCases extends PagerDutyAbstractTestCases{
	
	public GetScheduleByIdTestCases()
	{
		super(PagerDutyConnector.class);
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetScheduleById() throws Exception 
	{
		String since = getSince();
		String until = getUntil();
		String timeZone = getTimeZone();
		
		ScheduleByIdGetResponse scheduleByIdGetResponse = getConnector().getScheduleById(since,until,timeZone);
		assertNotNull(scheduleByIdGetResponse);
	    assertEquals("200", scheduleByIdGetResponse.getStatusCode());
	}

}
