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
import org.mule.modules.pagerduty.bean.IncidentByIdGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetIncidentsByIdTestCases.
 */
public class GetIncidentsByIdTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the incidents by id test cases.
	 */
	public GetIncidentsByIdTestCases()
	{
		super(PagerDutyConnector.class);
	}
    
    /**
     * Test get incidents by id.
     *
     * @throws Exception the exception
     */
    @Test
    @Category({FunctionalTestSuite.class})
    public void testGetIncidentsById() throws Exception 
    {
    	String id = "1";// "200470a147564f088f3eeefa99f6d3bb";
    	IncidentByIdGetResponse incidentByIdGetResponse = getConnector().getIncidentsById(id);
    	assertNotNull(incidentByIdGetResponse);
	     assertEquals("200", incidentByIdGetResponse.getStatusCode() );
    }

}
