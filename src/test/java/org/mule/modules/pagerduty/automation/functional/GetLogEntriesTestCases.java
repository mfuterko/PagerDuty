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
import org.mule.modules.pagerduty.bean.LogEntriesGetResponse;

import java.util.logging.Logger;
// TODO: Auto-generated Javadoc

/**
 * The Class GetLogEntriesTestCases.
 */
public class GetLogEntriesTestCases extends PagerDutyAbstractTestCases{
	
	/** The Constant log. */
	private static final Logger log = Logger.getLogger(GetLogEntriesTestCases.class
			.getName());
	
	/**
	 * Instantiates a new gets the log entries test cases.
	 */
	public GetLogEntriesTestCases()
	{
		super(PagerDutyConnector.class);
	}
    
    /**
     * Test get log entries.
     *
     * @throws Exception the exception
     */
    @Test
    @Category({FunctionalTestSuite.class})
    public void testGetLogEntries() throws Exception 
    {
    	String timeZone =  getTimeZone();
    	String since = getSince();
    	String until =  getUntil();
    	String isOverview = getOverview();
    	String include = getInclude();
    	LogEntriesGetResponse logEntriesGetResponse = getConnector().getLogEntries(null,null,null, null, null);
    	assertNotNull(logEntriesGetResponse);
    	if(logEntriesGetResponse != null)
    		log.info("Output : "+logEntriesGetResponse);
	    assertEquals("200", logEntriesGetResponse.getStatusCode() );
    }

}
