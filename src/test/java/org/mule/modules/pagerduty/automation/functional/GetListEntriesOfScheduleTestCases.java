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
import org.mule.modules.pagerduty.bean.ListEntriesOfScheduleGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetListEntriesOfScheduleTestCases.
 */
public class GetListEntriesOfScheduleTestCases extends PagerDutyAbstractTestCases {
	
	/**
	 * Instantiates a new gets the list entries of schedule test cases.
	 */
	public GetListEntriesOfScheduleTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test get list entries of schedule.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetListEntriesOfSchedule() throws Exception 
	{
		String id = getId();
		String since = getSince();
		String until = getUntil();
		String overflow = getOverview();
		String timeZone = getTimeZone();
		String userId = getUserId();
		
		ListEntriesOfScheduleGetResponse listEntriesOfScheduleGetResponse = getConnector().getListEntriesOfSchedule(id,since,until,overflow,timeZone,userId);
		assertNotNull(listEntriesOfScheduleGetResponse);
	    assertEquals("200", listEntriesOfScheduleGetResponse.getStatusCode());
		
	}

}
