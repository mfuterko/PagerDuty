package test.java.org.mule.modules.pagerduty.automation.testcases;

import src.test.java.org.mule.modules.pagerduty.automation.testcases.AbstractTestCase;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Category;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.FunctionalTestSuite;
import src.test.java.org.mule.modules.pagerduty.automation.testcases.Test;

public class GetUserDetailsOnCallTestCases extends AbstractTestCase {
	
	public GetUserDetailsOnCallTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetUserDetailsOnCall() throws Exception 
	{
		String id = getId();
		String include = getInclude();
		UserDetailsOnCallGetResponse userDetailsOnCallGetResponse = getConector().GetUserDetailsOnCall(id,include);
		assertNotNull(userDetailsOnCallGetResponse);
	    assertEquals("200", userDetailsOnCallGetResponse.getStatusCode());
	}

}
