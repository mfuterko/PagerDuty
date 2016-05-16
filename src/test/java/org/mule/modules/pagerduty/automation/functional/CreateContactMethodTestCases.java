/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.ContactMethodPostRequest;
import org.mule.modules.pagerduty.bean.ContactMethodPostResponse;

public class CreateContactMethodTestCases extends PagerDutyAbstractTestCases{
	
	public CreateContactMethodTestCases()
	{
		super(PagerDutyConnector.class);
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testCreateContactMethod() throws Exception 
	{
		String userId = "PPSFHH7";
		ContactMethodPostRequest request = new ContactMethodPostRequest();
		request.setAddress("5551112222");
		request.setCountry_code(1);
		request.setLabel("Island Lair");
		request.setSend_short_email(true);
		request.setType("phone");
		ContactMethodPostResponse contactMethodPostResponse = getConnector().createContactMethod(userId,request);
		assertNotNull(contactMethodPostResponse);
	    assertEquals("200", contactMethodPostResponse.getStatusCode());
	}

}
