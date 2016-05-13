/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.IncidentByIdGetResponse;

public class GetIncidentsByIdTestCases extends PagerDutyAbstractTestCases{
	
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
