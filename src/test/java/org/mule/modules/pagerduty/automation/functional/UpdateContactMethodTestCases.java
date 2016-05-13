/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.ContactMethodPutRequest;
import org.mule.modules.pagerduty.bean.ContactMethodPutResponse;

public class UpdateContactMethodTestCases extends PagerDutyAbstractTestCases{
	
	public UpdateContactMethodTestCases()
	{
		super();
	}
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
