/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;

public class GreetTestCases extends PagerDutyAbstractTestCases {

    public GreetTestCases(Class<PagerDutyConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}

	@Test
    @Category({FunctionalTestSuite.class})
    public void testFlow() throws Exception {
    	
    //	assertEquals(getConnector().greet("Foo"), "Hello Foo. How are you?");
    }
}