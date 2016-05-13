/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.EscalationRulesByIdGetResponse;
import org.mule.tools.devkit.ctf.junit.RegressionTests;

public class EscalationRulesByIdTestCases extends AbstractTestCase {
	
	
		public EscalationRulesByIdTestCases()
		{
			super();
		}
	    @Test
	    @Category({FunctionalTestSuite.class})
	    public void testEscalationRulesById() throws Exception 
	    {
	        String id = getEscalationId();
	        EscalationRulesByIdGetResponse escalationRulesByIdGetResponse = getConnector().getEscalationRulesById(id);
	        assertNotNull(escalationRulesByIdGetResponse);
		    assertEquals("200", escalationRulesByIdGetResponse.getStatusCode() );
	    }

}
