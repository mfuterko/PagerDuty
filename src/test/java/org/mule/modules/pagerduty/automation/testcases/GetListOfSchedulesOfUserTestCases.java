package test.java.org.mule.modules.pagerduty.automation.testcases;

import src.test.java.org.mule.modules.pagerduty.automation.testcases.AbstractTestCase;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Category;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.FunctionalTestSuite;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Test;

public class GetListOfSchedulesOfUserTestCases extends AbstractTestCase{

	public GetListOfSchedulesOfUserTestCases()
	{
		super();
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
		
}
