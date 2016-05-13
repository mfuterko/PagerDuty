package org.mule.modules.pagerduty.automation.functional;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;

public class GreetTestCases extends PagerDutyAbstractTestCases {

    @Test
    @Category({FunctionalTestSuite.class})
    public void testFlow() throws Exception {
    	
    //	assertEquals(getConnector().greet("Foo"), "Hello Foo. How are you?");
    }
}