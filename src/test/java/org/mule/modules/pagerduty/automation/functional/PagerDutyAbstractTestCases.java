/**
 * Copyright ï¿½ 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;


import org.junit.Before;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;
import org.mule.tools.devkit.ctf.mockup.ConnectorDispatcher;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

// TODO: Auto-generated Javadoc
/**
 * The Class PagerDutyAbstractTestCases.
 */
public abstract class PagerDutyAbstractTestCases  extends AbstractTestCase<PagerDutyConnector>{
		
	/** The connector. */
	private PagerDutyConnector connector;
	
	/** The dispatcher. */
	private ConnectorDispatcher<PagerDutyConnector> dispatcher;
	
	/**
	 * Instantiates a new pager duty abstract test cases.
	 *
	 * @param connector the connector
	 */
	public PagerDutyAbstractTestCases(Class<PagerDutyConnector> connector){
		super(connector);
	}
		
		
	/* (non-Javadoc)
	 * @see org.mule.tools.devkit.ctf.junit.AbstractTestCase#getConnector()
	 */
	protected PagerDutyConnector getConnector() {
		return connector;
	}


	/* (non-Javadoc)
	 * @see org.mule.tools.devkit.ctf.junit.AbstractTestCase#getDispatcher()
	 */
	protected ConnectorDispatcher<PagerDutyConnector> getDispatcher() {
		return dispatcher;
	}
	
	

	
	/* (non-Javadoc)
	 * @see org.mule.tools.devkit.ctf.junit.AbstractTestCase#init()
	 */
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
	
	/**
	 * Gets the escalation id.
	 *
	 * @return the escalation id
	 */
	public String getEscalationId()
	{
		return null;
	}
	
	/**
	 * Gets the team id.
	 *
	 * @return the team id
	 */
	public String getTeamId()
	{
		return null;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId(){
		return null;
	}
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUserId()
	{
		return null;
	}
	
	/**
	 * Gets the notification rule id.
	 *
	 * @return the notification rule id
	 */
	public String getnotificationRuleId()
	{
		return null;
	}
	
	/**
	 * Gets the escalation policy id.
	 *
	 * @return the escalation policy id
	 */
	public String getEscalationPolicyId()
	{
		return null;
	}
	
	/**
	 * Gets the query.
	 *
	 * @return the query
	 */
	public String getQuery()
	{
		return null;
	}
	
	/**
	 * Gets the include.
	 *
	 * @return the include
	 */
	public String getInclude()
	{
		return null;
	}
	
	/**
	 * Gets the service id.
	 *
	 * @return the service id
	 */
	public String getServiceId()
	{
		return null;
	}
	
	/**
	 * Gets the email filter id.
	 *
	 * @return the email filter id
	 */
	public String getEmailFilterId()
	{
		return null;
	}
	
	/**
	 * Gets the since.
	 *
	 * @return the since
	 */
	public String getSince()
	{
		return null;
	}
	
	/**
	 * Gets the until.
	 *
	 * @return the until
	 */
	public String getUntil()
	{
		return null;
	}
	
	/**
	 * Gets the time zone.
	 *
	 * @return the time zone
	 */
	public String getTimeZone()
	{
		return null;
	}
	
	/**
	 * Gets the overview.
	 *
	 * @return the overview
	 */
	public String getOverview()
	{
		return null;
	}
	
	/**
	 * Gets the contact method id.
	 *
	 * @return the contact method id
	 */
	public String getContactMethodId()
	{
		return null;
	}
	
	/**
	 * Gets the notification rule id.
	 *
	 * @return the notification rule id
	 */
	public String getNotificationRuleId(){
		return null;
	}
	
	/**
	 * Gets the escalation rule id.
	 *
	 * @return the escalation rule id
	 */
	public String getEscalationRuleId(){
		return null;
	}
	
	/**
	 * Gets the rollup.
	 *
	 * @return the rollup
	 */
	public String getRollup(){
		return null;
	}
	
	/**
	 * Gets the incident id.
	 *
	 * @return the incident id
	 */
	public String getIncidentId(){
		return null;
	}
	
	/**
	 * Gets the date range.
	 *
	 * @return the date range
	 */
	public String getDateRange(){
		return null;
	}
	
	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus(){
		return null;
	}
	
	/**
	 * Gets the incident key.
	 *
	 * @return the incident key
	 */
	public String getIncidentKey(){
		return null;
	}
	
	/**
	 * Gets the service.
	 *
	 * @return the service
	 */
	public String getService(){
		return null;
	}
	
	/**
	 * Gets the teams.
	 *
	 * @return the teams
	 */
	public String getTeams(){
		return null;
	}
	
	/**
	 * Gets the assigned to user.
	 *
	 * @return the assigned to user
	 */
	public String getAssignedToUser(){
		return null;
	}
	
	/**
	 * Gets the filter.
	 *
	 * @return the filter
	 */
	public String getFilter(){
		return null;
	}


}
