package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.IncidentByIdGetResponse;

public class GetIncidentsByIdTestCases extends AbstractTestCase{
	
	public GetIncidentsByIdTestCases()
	{
		super();
	}
    @Test
    @Category({FunctionalTestSuite.class})
    public void testGetIncidentsById() throws Exception 
    {
    	String id = getEscalationId();
    	IncidentByIdGetResponse incidentByIdGetResponse = getConnector().getIncidentsById(id);
    	assertNotNull(incidentByIdGetResponse);
	     assertEquals("200", incidentByIdGetResponse.getStatusCode() );
    }

}
