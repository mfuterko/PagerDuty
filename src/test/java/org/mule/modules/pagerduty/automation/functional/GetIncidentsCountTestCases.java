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
import org.mule.modules.pagerduty.bean.IncidentCountResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetIncidentsCountTestCases.
 */
public class GetIncidentsCountTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the incidents count test cases.
	 */
	public GetIncidentsCountTestCases()
	{
		super(PagerDutyConnector.class);
	}
    
    /**
     * Test get incidents count.
     *
     * @throws Exception the exception
     */
    @Test
    @Category({FunctionalTestSuite.class})
    public void testGetIncidentsCount() throws Exception 
    {
    	String since = getSince();
    	String until = getUntil();
    	String dateRange = getDateRange();
    	String status = getStatus();
    	String incidentKey = getIncidentKey();
    	String service = getService();
    	String teams = getTeams();
    	String assignedToUser = getAssignedToUser();
    	IncidentCountResponse incidentCountResponse = getConnector().getIncidentsCount(since, until, dateRange, status, incidentKey, service, teams, assignedToUser);
        assertNotNull(incidentCountResponse);
	    assertEquals("200", incidentCountResponse.getStatusCode());
    }

}
