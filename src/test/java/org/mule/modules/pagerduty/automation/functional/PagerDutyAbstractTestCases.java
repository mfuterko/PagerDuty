package org.mule.modules.pagerduty.automation.functional;


import org.junit.Before;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;
import org.mule.tools.devkit.ctf.mockup.ConnectorDispatcher;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

public class PagerDutyAbstractTestCases  extends AbstractTestCase<PagerDutyConnector>{
	
	private PagerDutyConnector connector;
	private ConnectorDispatcher<PagerDutyConnector> dispatcher;
	
	
	protected PagerDutyConnector getConnector() {
		return connector;
	}


	protected ConnectorDispatcher<PagerDutyConnector> getDispatcher() {
		return dispatcher;
	}

	
	@SuppressWarnings("deprecation")
	@Before
	  public void init() throws Exception {

	    // Initialization for single-test run
	    ConnectorTestContext.initialize(PagerDutyConnector.class, false);

	    // Context instance
		ConnectorTestContext<PagerDutyConnector> context = ConnectorTestContext
	      .getInstance(PagerDutyConnector.class);

	    // Connector dispatcher
	    dispatcher = context.getConnectorDispatcher();

	    connector = dispatcher.createMockup();

	  }
	
	public String getEscalationId()
	{
		return "";
	}
	
	public String getTeamId()
	{
		return "";
	}
	
	public String getId(){
		return "";
	}
	
	public String getUserId()
	{
		return "";
	}
	
	public String getnotificationRuleId()
	{
		return "";
	}
	public String getEscalationPolicyId()
	{
		return "";
	}
	public String getQuery()
	{
		return "";
	}
	
	public String getInclude()
	{
		return "";
	}
	
	public String getServiceId()
	{
		return "";
	}
	
	public String getEmailFilterId()
	{
		return "";
	}
	
	public String getSince()
	{
		return "";
	}
	public String getUntil()
	{
		return "";
	}
	public String getTimeZone()
	{
		return "";
	}
	
	public String getOverview()
	{
		return "";
	}
	public String getContactMethodId()
	{
		return "";
	}
	public String getNotificationRuleId(){
		return "";
	}
	public String getEscalationRuleId(){
		return "";
	}
	public String getRollup(){
		return "";
	}
	public String getIncidentId(){
		return "";
	}
	public String getDateRange(){
		return "";
	}
	public String getStatus(){
		return "";
	}
	public String getIncidentKey(){
		return "";
	}
	public String getService(){
		return "";
	}
	public String getTeams(){
		return "";
	}
	public String getAssignedToUser(){
		return "";
	}
	public String getFilter(){
		return "";
	}
	
	

}
