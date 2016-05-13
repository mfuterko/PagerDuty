/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;

public class EsclationRuleByPolicyTestCases extends PagerDutyAbstractTestCases {
	
	
    @Test
    @Category({FunctionalTestSuite.class})
    public void testFlow() throws Exception {
        assertNotNull(getConnector().addEntity("ENTITY_TYPE_1", new HashMap<String, Object>()));
    }

}
