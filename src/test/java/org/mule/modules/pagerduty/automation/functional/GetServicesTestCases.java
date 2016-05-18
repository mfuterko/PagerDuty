package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyClient;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.Services;
import org.mule.modules.pagerduty.bean.ServicesListGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetServicesTestCases.
 */
public class GetServicesTestCases  extends PagerDutyAbstractTestCases {
	
	/** The Constant log. */
	private static final Logger log = Logger.getLogger(PagerDutyClient.class
		    .getName());
	
	/**
	 * Instantiates a new escalation rules by id test cases.
	 */
	public GetServicesTestCases()
	{
		super(PagerDutyConnector.class);
	}
    
	/**
	 * Test escalation rules by id.
	 *
	 * @throws Exception the exception
	 */
	@Test
    @Category({FunctionalTestSuite.class})
    public void testEscalationRulesById() throws Exception 
    {
        ServicesListGetResponse getServicesResponse = getConnector().getServicesList(null,null,null,null,null);
        log.info("The response code is : "+getServicesResponse.getStatusCode());
        log.info("The result is :"+getServicesResponse.toString());
        Services[] serv = getServicesResponse.getServices();
        for(Services s : serv){
        	System.out.println("Service ID: "+s.getId());
        	System.out.println("Name : "+s.getName());
        	System.out.println("Acknowledgement Timeout: "+s.getAcknowledgement_timeout());
        	System.out.println("Auto resolve timeout: "+s.getAuto_resolve_timeout());
        	System.out.println("Created at: "+s.getCreated_at());
        	System.out.println("Email Filter Mode: "+s.getEmail_filter_mode());
        	System.out.println("Email incident creation: "+s.getEmail_incident_creation());
        	System.out.println("Service Key : "+s.getService_key());
        	System.out.println("Service URL: "+s.getService_url());
        	System.out.println("Last incident timestamp : "+s.getLast_incident_timestamp());
        }
        assertNotNull(getServicesResponse);
	    assertEquals("200", getServicesResponse.getStatusCode() );
    }

}
