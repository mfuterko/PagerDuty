package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.bean.EscalationPolicyIdPutRequest;
import org.mule.modules.pagerduty.bean.EscaltionPolicyIdPutResponse;
import org.mule.tools.devkit.ctf.junit.RegressionTests;

public class UpdateEscaltionPolicyByIdTestCases  extends AbstractTestCase{
	
	public UpdateEscaltionPolicyByIdTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testUpdateEscaltionPolicyById() throws Exception {
		
		String id = getEscalationId();
		EscalationPolicyIdPutRequest escalationPolicyIdPutRequest = ("#[payload]") EscalationPolicyIdPutRequest();
		EscaltionPolicyIdPutResponse escaltionPolicyIdPutResponse = getConnector().updateEscaltionPolicyById(id, escalationPolicyIdPutRequest);
		assertNotNull(escaltionPolicyIdPutResponse);
	     assertEquals("200", escaltionPolicyIdPutResponse.getStatusCode() );
	}
	private String getEscalationId() {
		// TODO Auto-generated method stub
		return null;
	}

}
