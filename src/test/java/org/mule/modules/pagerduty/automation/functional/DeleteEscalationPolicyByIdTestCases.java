package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.StatusResponse;

public class DeleteEscalationPolicyByIdTestCases extends PagerDutyAbstractTestCases{
	
	public DeleteEscalationPolicyByIdTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testDeleteEscalationPolicyById() throws Exception {
		
		String id = getEscalationId();
		StatusResponse statusResponse = getConnector().deleteEscalationPolicyById(id);
		assertNotNull(statusResponse);
	     assertEquals("200", statusResponse.getStatusCode() );
	}

}
