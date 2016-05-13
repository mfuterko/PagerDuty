/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.EscalationPolicyIdPutRequest;
import org.mule.modules.pagerduty.bean.EscaltionPolicyIdPutResponse;

public class UpdateEscaltionPolicyByIdTestCases  extends AbstractTestCase{
	
	public UpdateEscaltionPolicyByIdTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testUpdateEscaltionPolicyById() throws Exception {
		
		String id = getEscalationId();
		EscalationPolicyIdPutRequest escalationPolicyIdPutRequest = new EscalationPolicyIdPutRequest();
		EscaltionPolicyIdPutResponse escaltionPolicyIdPutResponse = getConnector().updateEscaltionPolicyById(id, escalationPolicyIdPutRequest);
		assertNotNull(escaltionPolicyIdPutResponse);
	     assertEquals("200", escaltionPolicyIdPutResponse.getStatusCode() );
	}
	
}
