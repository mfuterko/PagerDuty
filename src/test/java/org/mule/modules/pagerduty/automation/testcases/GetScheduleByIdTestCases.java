package test.java.org.mule.modules.pagerduty.automation.testcases;

import src.test.java.org.mule.modules.pagerduty.automation.testcases.AbstractTestCase;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Category;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.FunctionalTestSuite;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Test;

public class GetScheduleByIdTestCases extends AbstractTestCase{
	
	public GetScheduleByIdTestCases()
	{
		super();
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
