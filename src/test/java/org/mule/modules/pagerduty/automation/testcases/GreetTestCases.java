package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.*;

import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.tools.devkit.ctf.junit.RegressionTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class GreetTestCases extends AbstractTestCase {

    @Test
    @Category({RegressionTests.class})
    public void testFlow() throws Exception {
    	
    //	assertEquals(getConnector().greet("Foo"), "Hello Foo. How are you?");
    }
}