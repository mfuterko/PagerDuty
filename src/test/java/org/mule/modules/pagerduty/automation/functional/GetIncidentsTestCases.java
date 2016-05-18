package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.IncidentsGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetIncidentsTestCases.
 */
public class GetIncidentsTestCases extends PagerDutyAbstractTestCases {
	
	/**
	 * Copyright � 1992-2016 Cisco, Inc.
	 */
	
		public GetIncidentsTestCases()
		{
			super(PagerDutyConnector.class);
		}
	    
    	/**
    	 * Test get incidents.
    	 *
    	 * @throws Exception the exception
    	 */
    	@Test
	    @Category({FunctionalTestSuite.class})
	    public void testGetIncidents() throws Exception 
	    {
	    	
	    	IncidentsGetResponse incidentsGetResponse = getConnector().getIncidents(null, null, null, null, null, null, null, null, null, null, null, null);
			assertNotNull(incidentsGetResponse);
		    assertEquals("200", incidentsGetResponse.getStatusCode() );
	    }

	    


}
