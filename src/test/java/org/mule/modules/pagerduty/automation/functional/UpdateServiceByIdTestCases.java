package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.ServicePutRequest;
import org.mule.modules.pagerduty.bean.ServicePutResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class UpdateServiceByIdTestCases.
 */
public class UpdateServiceByIdTestCases   extends PagerDutyAbstractTestCases{
			
	/**
	 * Instantiates a new update service by id test cases.
	 */
	public UpdateServiceByIdTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test update escaltion policy by id.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testUpdateEscaltionPolicyById() throws Exception {
		
		String id = "P7N387X";
		ServicePutRequest request = new ServicePutRequest();
		request.setAcknowledgment_timeout(29);
		request.setDescription(null);
		request.setEscalation_policy_id(null);
		request.setName("test update service");
		request.setSeverity_filter(null);
		ServicePutResponse escaltionPolicyIdPutResponse = getConnector().putService(id, request);
		assertNotNull(escaltionPolicyIdPutResponse);
	    assertEquals("200", escaltionPolicyIdPutResponse.getStatusCode() );
	}
	



}
