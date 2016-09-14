package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.ServiceDetailsResponse;

public class GetServiceDetailsByIdTestCase extends PagerDutyAbstractTestCases {

	public GetServiceDetailsByIdTestCase() {
		super(PagerDutyConnector.class);
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetServiceDetailsById() throws Exception 
    {
    	String id = "P7U45RI";
    	ServiceDetailsResponse response = getConnector().getServiceDetails(id,null);
    	assertNotNull(response);
	    assertEquals("200", response.getStatusCode() );
    }

}
