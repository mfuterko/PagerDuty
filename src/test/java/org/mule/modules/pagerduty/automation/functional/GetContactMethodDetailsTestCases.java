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
import org.mule.modules.pagerduty.bean.ContactMethodDetailsGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetContactMethodDetailsTestCases.
 */
public class GetContactMethodDetailsTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the contact method details test cases.
	 */
	public GetContactMethodDetailsTestCases()
	{
		super(PagerDutyConnector.class);
	}
	
	/**
	 * Test get contact method details.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetContactMethodDetails() throws Exception 
	{
		String userId = getUserId();
		String contactMethodId = getContactMethodId();
		
		ContactMethodDetailsGetResponse contactMethodDetailsGetResponse = getConnector().getContactMethodDetails(userId,contactMethodId);
		assertNotNull(contactMethodDetailsGetResponse);
	    assertEquals("200", contactMethodDetailsGetResponse.getStatusCode());
	}

}
