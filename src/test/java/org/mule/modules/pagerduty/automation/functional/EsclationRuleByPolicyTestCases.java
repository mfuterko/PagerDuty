/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;

// TODO: Auto-generated Javadoc
/**
 * The Class EsclationRuleByPolicyTestCases.
 */
public class EsclationRuleByPolicyTestCases extends PagerDutyAbstractTestCases {
	
	
    public EsclationRuleByPolicyTestCases(Class<PagerDutyConnector> connector) {
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
        assertNotNull(getConnector().addEntity("ENTITY_TYPE_1", new HashMap<String, Object>()));
    }

}
