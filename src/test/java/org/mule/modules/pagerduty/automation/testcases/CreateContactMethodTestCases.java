/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.ContactMethodPostRequest;
import org.mule.modules.pagerduty.bean.ContactMethodPostResponse;

public class CreateContactMethodTestCases extends AbstractTestCase{
	
	public CreateContactMethodTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testCreateContactMethod() throws Exception 
	{
		String userId = getUserId();
		ContactMethodPostRequest request = new ContactMethodPostRequest();
		
		ContactMethodPostResponse contactMethodPostResponse = getConnector().createContactMethod(userId,request);
		assertNotNull(contactMethodPostResponse);
	    assertEquals("200", contactMethodPostResponse.getStatusCode());
	}

}