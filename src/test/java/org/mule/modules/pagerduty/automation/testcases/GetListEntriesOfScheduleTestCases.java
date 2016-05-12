package test.java.org.mule.modules.pagerduty.automation.testcases;

import src.test.java.org.mule.modules.pagerduty.automation.testcases.AbstractTestCase;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Category;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.FunctionalTestSuite;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Test;

public class GetListEntriesOfScheduleTestCases extends AbstractTestCase {
	
	public GetListEntriesOfScheduleTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetListEntriesOfSchedule() throws Exception 
	{
		String id = getId();
		String since = getSince();
		String until = getUntil();
		String overflow = getOverflow();
		String timeZone = getTimeZone();
		String userId = getUserId();
		
		ListEntriesOfScheduleGetResponse listEntriesOfScheduleGetResponse = getConnector().getListEntriesOfSchedule(id,since,until,overflow,timeZone,userId);
		assertNotNull(listEntriesOfScheduleGetResponse);
	    assertEquals("200", listEntriesOfScheduleGetResponse.getStatusCode());
		
	}

}
