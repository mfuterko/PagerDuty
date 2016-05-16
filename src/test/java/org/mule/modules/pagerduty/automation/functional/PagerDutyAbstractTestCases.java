/**
 * Copyright ï¿½ 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;


import org.junit.Before;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;
import org.mule.tools.devkit.ctf.mockup.ConnectorDispatcher;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

public abstract class PagerDutyAbstractTestCases  extends AbstractTestCase<PagerDutyConnector>{
		
	private PagerDutyConnector connector;
	private ConnectorDispatcher<PagerDutyConnector> dispatcher;
	
	public PagerDutyAbstractTestCases(Class<PagerDutyConnector> connector){
		super(connector);
	}
		
		
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
		return null;
	}
	
	public String getTeamId()
	{
		return null;
	}
	
	public String getId(){
		return null;
	}
	
	public String getUserId()
	{
		return null;
	}
	
	public String getnotificationRuleId()
	{
		return null;
	}
	public String getEscalationPolicyId()
	{
		return null;
	}
	public String getQuery()
	{
		return null;
	}
	
	public String getInclude()
	{
		return null;
	}
	
	public String getServiceId()
	{
		return null;
	}
	
	public String getEmailFilterId()
	{
		return null;
	}
	
	public String getSince()
	{
		return null;
	}
	public String getUntil()
	{
		return null;
	}
	public String getTimeZone()
	{
		return null;
	}
	
	public String getOverview()
	{
		return null;
	}
	public String getContactMethodId()
	{
		return null;
	}
	public String getNotificationRuleId(){
		return null;
	}
	public String getEscalationRuleId(){
		return null;
	}
	public String getRollup(){
		return null;
	}
	public String getIncidentId(){
		return null;
	}
	public String getDateRange(){
		return null;
	}
	public String getStatus(){
		return null;
	}
	public String getIncidentKey(){
		return null;
	}
	public String getService(){
		return null;
	}
	public String getTeams(){
		return null;
	}
	public String getAssignedToUser(){
		return null;
	}
	public String getFilter(){
		return null;
	}


}
