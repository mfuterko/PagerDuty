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

// TODO: Auto-generated Javadoc
/**
 * The Class CreateContactMethodTestCases.
 */
public class CreateContactMethodTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new creates the contact method test cases.
	 */
	public CreateContactMethodTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test create contact method.
	 *
	 * @throws Exception the exception
	 */
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
	    assertEquals("201", contactMethodPostResponse.getStatusCode());
	}

}
