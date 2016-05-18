/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;

// TODO: Auto-generated Javadoc
/**
 * The Class GreetTestCases.
 */
public class GreetTestCases extends PagerDutyAbstractTestCases {

    /**
     * Instantiates a new greet test cases.
     *
     * @param connector the connector
     */
    public GreetTestCases(Class<PagerDutyConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Test flow.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testFlow() throws Exception {
    	
    //	assertEquals(getConnector().greet("Foo"), "Hello Foo. How are you?");
    }
}