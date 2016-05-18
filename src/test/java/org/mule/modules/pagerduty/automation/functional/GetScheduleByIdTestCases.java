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

// TODO: Auto-generated Javadoc
/**
 * The Class GetScheduleByIdTestCases.
 */
public class GetScheduleByIdTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the schedule by id test cases.
	 */
	public GetScheduleByIdTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test get schedule by id.
	 *
	 * @throws Exception the exception
	 */
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
