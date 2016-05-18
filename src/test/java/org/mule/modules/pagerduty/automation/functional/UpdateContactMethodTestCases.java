/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.ContactMethodPutRequest;
import org.mule.modules.pagerduty.bean.ContactMethodPutResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class UpdateContactMethodTestCases.
 */
public class UpdateContactMethodTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new update contact method test cases.
	 */
	public UpdateContactMethodTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test update contact method.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testUpdateContactMethod() throws Exception 
	{
		String userId = getUserId();
		String contactMethodId = getContactMethodId();
		ContactMethodPutRequest request = new ContactMethodPutRequest();
		
		ContactMethodPutResponse contactMethodPutResponse = getConnector().updateContactMethod(userId,contactMethodId,request);
		assertNotNull(contactMethodPutResponse);
	    assertEquals("200", contactMethodPutResponse.getStatusCode());
	}

}
