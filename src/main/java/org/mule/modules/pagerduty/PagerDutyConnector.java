/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty;

import java.util.Map;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.MetaDataScope;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.lifecycle.Start;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.MetaDataKeyParam;
import org.mule.api.annotations.param.Optional;
import org.mule.modules.pagerduty.bean.AlertsResponse;
import org.mule.modules.pagerduty.bean.ContactMethodDetailsGetResponse;
import org.mule.modules.pagerduty.bean.ContactMethodPostRequest;
import org.mule.modules.pagerduty.bean.ContactMethodPostResponse;
import org.mule.modules.pagerduty.bean.ContactMethodPutRequest;
import org.mule.modules.pagerduty.bean.ContactMethodPutResponse;
import org.mule.modules.pagerduty.bean.EmailFilterPostRequest;
import org.mule.modules.pagerduty.bean.EmailFilterPutRequest;
import org.mule.modules.pagerduty.bean.EmailFilterPutResponse;
import org.mule.modules.pagerduty.bean.EmailFiltersPostResponse;
import org.mule.modules.pagerduty.bean.EscalationPoliciesGetResponse;
import org.mule.modules.pagerduty.bean.EscalationPolicyIdGetResponse;
import org.mule.modules.pagerduty.bean.EscalationPolicyIdPutRequest;
import org.mule.modules.pagerduty.bean.EscalationRuleByPolicyGetResponse;
import org.mule.modules.pagerduty.bean.EscalationRuleByPolicyPutRequest;
import org.mule.modules.pagerduty.bean.EscalationRuleByPolicyPutResponse;
import org.mule.modules.pagerduty.bean.EscalationRulesByIdGetResponse;
import org.mule.modules.pagerduty.bean.EscalationRulesByIdPostResponse;
import org.mule.modules.pagerduty.bean.EscalationRulesByIdPutRequest;
import org.mule.modules.pagerduty.bean.EscalationRulesByIdPutResponse;
import org.mule.modules.pagerduty.bean.EscaltionPolicyIdPutResponse;
import org.mule.modules.pagerduty.bean.IncidentByIdGetResponse;
import org.mule.modules.pagerduty.bean.IncidentCountResponse;
import org.mule.modules.pagerduty.bean.IncidentLogEntriesGetResponse;
import org.mule.modules.pagerduty.bean.IncidentNotesGetResponse;
import org.mule.modules.pagerduty.bean.IncidentNotesPostResponse;
import org.mule.modules.pagerduty.bean.IncidentsAcknowledgePutRequest;
import org.mule.modules.pagerduty.bean.IncidentsGetResponse;
import org.mule.modules.pagerduty.bean.IncidentsPutRequest;
import org.mule.modules.pagerduty.bean.IncidentsPutResponse;
import org.mule.modules.pagerduty.bean.IncidentsReassignPutRequest;
import org.mule.modules.pagerduty.bean.IncidentsResolvePutRequest;
import org.mule.modules.pagerduty.bean.IncidentsSnoozePutRequest;
import org.mule.modules.pagerduty.bean.ListEntriesOfScheduleGetResponse;
import org.mule.modules.pagerduty.bean.LogEntriesByIdGetResponse;
import org.mule.modules.pagerduty.bean.LogEntriesGetResponse;
import org.mule.modules.pagerduty.bean.MaintenanceWindowByIdGetResponse;
import org.mule.modules.pagerduty.bean.MaintenanceWindowPutRequest;
import org.mule.modules.pagerduty.bean.MaintenanceWindowPutResponse;
import org.mule.modules.pagerduty.bean.MaintenanceWindowsGetResponse;
import org.mule.modules.pagerduty.bean.MaintenanceWindowsPostRequest;
import org.mule.modules.pagerduty.bean.MaintenanceWindowsPostResponse;
import org.mule.modules.pagerduty.bean.Note;
import org.mule.modules.pagerduty.bean.NotifcationRulePostResponse;
import org.mule.modules.pagerduty.bean.NotificationRuleGetResponse;
import org.mule.modules.pagerduty.bean.NotificationRulePostRequest;
import org.mule.modules.pagerduty.bean.NotificationRulePutRequest;
import org.mule.modules.pagerduty.bean.NotificationRulePutResponse;
import org.mule.modules.pagerduty.bean.NotificationRulesGetResponse;
import org.mule.modules.pagerduty.bean.OnCallGetResponse;
import org.mule.modules.pagerduty.bean.ReportsAlertsPerTimeResponse;
import org.mule.modules.pagerduty.bean.ReportsIncidentsPerTimeResponse;
import org.mule.modules.pagerduty.bean.ScheduleByIdGetResponse;
import org.mule.modules.pagerduty.bean.ScheduleOverridesGetResponse;
import org.mule.modules.pagerduty.bean.ScheduleOverridesPostRequest;
import org.mule.modules.pagerduty.bean.ScheduleOverridesPostResponse;
import org.mule.modules.pagerduty.bean.SchedulePreviewPostRequest;
import org.mule.modules.pagerduty.bean.SchedulePreviewPostResponse;
import org.mule.modules.pagerduty.bean.SchedulesPostRequest;
import org.mule.modules.pagerduty.bean.SchedulesPostResponse;
import org.mule.modules.pagerduty.bean.SchedulesPutRequest;
import org.mule.modules.pagerduty.bean.SchedulesPutResponse;
import org.mule.modules.pagerduty.bean.ServiceDetailsResponse;
import org.mule.modules.pagerduty.bean.ServicePostRequest;
import org.mule.modules.pagerduty.bean.ServicePostResponse;
import org.mule.modules.pagerduty.bean.ServicePutRequest;
import org.mule.modules.pagerduty.bean.ServicePutResponse;
import org.mule.modules.pagerduty.bean.ServicesListGetResponse;
import org.mule.modules.pagerduty.bean.StatusResponse;
import org.mule.modules.pagerduty.bean.TeamGetResponse;
import org.mule.modules.pagerduty.bean.TeamPostRequest;
import org.mule.modules.pagerduty.bean.TeamPutRequest;
import org.mule.modules.pagerduty.bean.TeamPutResponse;
import org.mule.modules.pagerduty.bean.TeamsGetResponse;
import org.mule.modules.pagerduty.bean.TeamsPostResponse;
import org.mule.modules.pagerduty.bean.UserContactMethodsGetResponse;
import org.mule.modules.pagerduty.bean.UserDetailsGetResponse;
import org.mule.modules.pagerduty.bean.UserDetailsOnCallGetResponse;
import org.mule.modules.pagerduty.bean.UserLogEntriesGetResponse;
import org.mule.modules.pagerduty.bean.UserPostRequest;
import org.mule.modules.pagerduty.bean.UserPostResponse;
import org.mule.modules.pagerduty.bean.UserPutRequest;
import org.mule.modules.pagerduty.bean.UserPutResponse;
import org.mule.modules.pagerduty.bean.UsersGetResponse;
import org.mule.modules.pagerduty.bean.UsersListByScheduleGetResponse;
import org.mule.modules.pagerduty.bean.UsersOnCallGetResponse;
import org.mule.modules.pagerduty.config.ConnectorConfig;


// TODO: Auto-generated Javadoc
/**
 * This is Pager Duty Connector Class.
 *
 * @author Surender
 */

@Connector(name="pager-duty", friendlyName="PagerDuty")
@MetaDataScope( DataSenseResolver.class )
public class PagerDutyConnector {

    /** The config. */
    @Config
    ConnectorConfig config;
    
    /** The client. */
    private PagerDutyClient client;

    /**
     * Inits the.
     */
  @Start
    public void init() {
      setClient(new PagerDutyClient(this));
    }
  

/**
 *  gets the alerts.
 *
 * @param sinceDate the since date
 * @param untilDate the until date
 * @param filterType the filter type
 * @param time_zone the time_zone
 * @return the alerts
 */
@Processor
    public AlertsResponse getAlerts(String sinceDate,
    	    String untilDate,  @Optional String filterType,  @Optional String time_zone ) {
    	 return getClient().getAlerts(sinceDate, untilDate, filterType, time_zone);
    }
   

/**
 * gets escalation policies.
 *
 * @param query the query
 * @param teams the teams
 * @param include the include
 * @return the escalation policies
 */
@Processor
   public EscalationPoliciesGetResponse getEscalationPolicies(@Optional String query,@Optional String teams,
		   @Optional String include){
	   return getClient().getEscalationPolicies(query, teams, include);
   }
   

/**
 * gets escalaltion policy by id.
 *
 * @param id the id
 * @return the escalation policy by id
 */
@Processor
   public EscalationPolicyIdGetResponse getEscalationPolicyById(@Optional String id){
	   return getClient().getEscalationPolicyById(id);
   }

   /**
    * Update escaltion policy by id.
    *
    * @param id the id
    * @param escalationPolicyIdPutRequest the escalation policy id put request
    * @return the escaltion policy id put response
    */
@Processor
   public EscaltionPolicyIdPutResponse updateEscaltionPolicyById(String id,
			  @Default("#[payload]") EscalationPolicyIdPutRequest escalationPolicyIdPutRequest){
	   return getClient().updateEscaltionPolicyById(id, escalationPolicyIdPutRequest);
   }
 
   /**
    * Delete escalation policy by id.
    *
    * @param id the id
    * @return the status response
    */
@Processor
   public StatusResponse deleteEscalationPolicyById(String id){
	   return getClient().deleteEscalationPolicyById(id);
   }
   
 
   /**
    * Gets the escalation rules by id.
    *
    * @param id the id
    * @return the escalation rules by id
    */
@Processor
   public EscalationRulesByIdGetResponse getEscalationRulesById(String id){
	   return getClient().getEscalationRulesById(id);
   }
   
   /**
    * Post escalation rules by id.
    *
    * @param id the id
    * @return the escalation rules by id post response
    */
   @Processor
   public EscalationRulesByIdPostResponse postEscalationRulesById(String id){
	   return getClient().postEscalationRulesById(id);
   }
   
   /**
    * Put escalation rues by id.
    *
    * @param escalationPolicyId the escalation policy id
    * @param escalationRuleId the escalation rule id
    * @param escalationRulesByIdPutRequest the escalation rules by id put request
    * @return the escalation rules by id put response
    */
   @Processor
   public EscalationRulesByIdPutResponse putEscalationRuesById(String escalationPolicyId, String escalationRuleId, 
		   @Default("#[payload]") EscalationRulesByIdPutRequest escalationRulesByIdPutRequest){
	   return getClient().putEscalationRuesById(escalationPolicyId,escalationRuleId, escalationRulesByIdPutRequest);
   
   }
   
   /**
    * Gets the esclation rule by policy.
    *
    * @param escalation_policy_id the escalation_policy_id
    * @param id the id
    * @return the esclation rule by policy
    */
   @Processor
   public EscalationRuleByPolicyGetResponse getEsclationRuleByPolicy(String escalation_policy_id, String id){
	   return getClient().getEsclationRuleByPolicy(escalation_policy_id, id);
   }
   
   /**
    * Update escalation rule.
    *
    * @param escalationPolicyId the escalation policy id
    * @param escalationRuleId the escalation rule id
    * @param request the request
    * @return the escalation rule by policy put response
    */
   public EscalationRuleByPolicyPutResponse updateEscalationRule(String escalationPolicyId, String escalationRuleId, 
		   @Default("#[payload]") EscalationRuleByPolicyPutRequest request){
	   return getClient().updateEscalationRule(escalationPolicyId, escalationRuleId, request);
   }
   
   /**
    * Delete escalation rule by policy.
    *
    * @param escalation_policy_id the escalation_policy_id
    * @param id the id
    * @return the status response
    */
   @Processor
   public StatusResponse deleteEscalationRuleByPolicy(String escalation_policy_id, String id){
	   return getClient().deleteEscalationRuleByPolicy(escalation_policy_id, id);
   }
   
   /**
    * Gets the on call.
    *
    * @param query the query
    * @return the on call
    */
   @Processor
   public OnCallGetResponse getOnCall(String query){
	   return getClient().getOnCall(query);
   }
   
   /**
    * Gets the incidents.
    *
    * @param since the since
    * @param untill the untill
    * @param dateRange the date range
    * @param fields the fields
    * @param status the status
    * @param incidentKey the incident key
    * @param service the service
    * @param teams the teams
    * @param assignedToUser the assigned to user
    * @param urgency the urgency
    * @param timeZone the time zone
    * @param sortBy the sort by
    * @return the incidents
    */
   @Processor
   public IncidentsGetResponse getIncidents(@Optional String since,@Optional String untill,@Optional String date_range,@Optional String fields,
		   @Optional String status, @Optional String incident_key ,@Optional String service,@Optional String teams,@Optional String assigned_to_user, 
		   @Optional  String urgency,@Optional String time_zone, @Optional String sort_by){
	   return getClient().getIncidents(since, untill, date_range, fields, status, incident_key , service, teams, assigned_to_user, urgency, time_zone, sort_by);
   }
   
   /**
    * Gets the incidents by id.
    *
    * @param id the id
    * @return the incidents by id
    */
   @Processor
   public IncidentByIdGetResponse getIncidentsById(String id){
	   return getClient().getIncidentById(id);
   }
   
   /**
    * Gets the incidents count.
    *
    * @param since the since
    * @param until the until
    * @param dateRange the date range
    * @param status the status
    * @param incidentKey the incident key
    * @param service the service
    * @param teams the teams
    * @param assignedToUser the assigned to user
    * @return the incidents count
    */
   @Processor
   public IncidentCountResponse getIncidentsCount(@Optional String since, @Optional String until, @Optional String dateRange, @Optional String status,
		   @Optional String incidentKey, @Optional String service, @Optional String teams, @Optional String assignedToUser){
	   return getClient().getIncidentsCount(since, until, dateRange, status, incidentKey, service, teams, assignedToUser);
   }
   
   /**
    * Put incidents.
    *
    * @param request the request
    * @return the incidents put response
    */
   @Processor
   public IncidentsPutResponse putIncidents(IncidentsPutRequest request){
	   return getClient().putIncidents(request);
   }
   
   /**
    * Resolve incident.
    *
    * @param incidentId the incident id
    * @param request the request
    * @return the status response
    */
   @Processor
   public StatusResponse resolveIncident(String incidentId, @Default("#[payload]") IncidentsResolvePutRequest request ){
	   return getClient().resolveIncident(incidentId, request);
   }
   
   /**
    * Acknowledge incident.
    *
    * @param incidentId the incident id
    * @param request the request
    * @return the status response
    */
   @Processor
   public StatusResponse acknowledgeIncident(String incidentId, @Default("#[payload]") IncidentsAcknowledgePutRequest request ){
	   return getClient().acknowledgeIncident(incidentId, request);
   }
   
   /**
    * Reassign incident.
    *
    * @param incidentId the incident id
    * @param request the request
    * @return the status response
    */
   @Processor
   public StatusResponse reassignIncident(String incidentId, @Default("#[payload]") IncidentsReassignPutRequest request ){
	  return getClient().reassignIncident(incidentId, request);
   }
   
   /**
    * Snooze incident.
    *
    * @param incidentId the incident id
    * @param request the request
    * @return the status response
    */
   @Processor
   public StatusResponse snoozeIncident(String incidentId, @Default("#[payload]") IncidentsSnoozePutRequest request ){
	   return getClient().snoozeIncident(incidentId, request);
   }
	  
	  
   /**
    * Gets the incidents notes by id.
    *
    * @param id the id
    * @return the incidents notes by id
    */
   @Processor
   public IncidentNotesGetResponse getIncidentsNotesById(String id){
	   return getClient().getIncidentsNotesById(id);
   }
   
   /**
    * Post incidents notes by id.
    *
    * @param id the id
    * @param notes the notes
    * @param registerId the register id
    * @return the incident notes post response
    */
   @Processor
   public IncidentNotesPostResponse postIncidentsNotesById( String id, Note notes, String registerId){
	   return getClient().postIncidentsNotesById(id, notes, registerId);
   }
  
   /**
    * Gets the log entries.
    *
    * @param timeZone the time zone
    * @param since the since
    * @param until the until
    * @param isOverview the is overview
    * @param include the include
    * @return the log entries
    */
   @Processor
   public LogEntriesGetResponse getLogEntries(
		   @Optional String timeZone, @Optional String since,
		   @Optional String until, @Optional String isOverview, @Optional String include){
	   return getClient().getLogEntries(timeZone, since, until, isOverview, include);
   }
   
   /**
    * Gets the user log entries.
    *
    * @param id the id
    * @param timeZone the time zone
    * @param since the since
    * @param until the until
    * @param isOverview the is overview
    * @param include the include
    * @return the user log entries
    */
   @Processor
   public UserLogEntriesGetResponse getUserLogEntries(String id, @Optional String timeZone, @Optional String since, @Optional String until, 
		   @Optional String isOverview, @Optional String include){
	   return getClient().getUserLogEntries(id, timeZone, since, until, isOverview, include);
   }


   /**
    * Gets the incident log entries.
    *
    * @param incidentId the incident id
    * @param timeZone the time zone
    * @param since the since
    * @param until the until
    * @param isOverview the is overview
    * @param include the include
    * @return the incident log entries
    */
   @Processor
   public IncidentLogEntriesGetResponse getIncidentLogEntries(String incidentId, @Optional String timeZone, @Optional String since, 
		   @Optional String until, @Optional String isOverview, @Optional String include){
	   return getClient().getIncidentLogEntries(incidentId, timeZone, since, until, isOverview, include);
   }
   
   /**
    * Gets the log entries by id.
    *
    * @param id the id
    * @param timeZone the time zone
    * @param include the include
    * @return the log entries by id
    */
   @Processor
   public LogEntriesByIdGetResponse getLogEntriesById(String id, String timeZone, String include){
	   return getClient().getLogEntriesById(id, timeZone, include);
   }
   
   /**
    * Gets the maintenance windows.
    *
    * @param query the query
    * @param serviceIds the service ids
    * @param teams the teams
    * @param filter the filter
    * @param include the include
    * @return the maintenance windows
    */
   @Processor
   public MaintenanceWindowsGetResponse getMaintenanceWindows(@Optional String query, @Optional String serviceIds, @Optional String teams, 
		   @Optional String filter, @Optional String include){
	   return getClient().getMaintenanceWindows(query, serviceIds, teams, filter, include);
   }
   
   /**
    * Gets the maintenance windows by id.
    *
    * @param id the id
    * @return the maintenance windows by id
    */
   @Processor
   public MaintenanceWindowByIdGetResponse getMaintenanceWindowsById(String id){
	   return getClient().getMaintenanceWindowsById(id);
   }
   
   /**
    * Post maintenance windows.
    *
    * @param request the request
    * @return the maintenance windows post response
    */
   @Processor
   public MaintenanceWindowsPostResponse postMaintenanceWindows(MaintenanceWindowsPostRequest request){
	   return getClient().postMaintenanceWindows(request);
   }
   
   /**
    * Put maintenance window by id.
    *
    * @param id the id
    * @param request the request
    * @return the maintenance window put response
    */
   @Processor
   public MaintenanceWindowPutResponse putMaintenanceWindowById(String id, @Default("#[payload]") MaintenanceWindowPutRequest request){
	   return getClient().putMaintenanceWindowById(id, request);
   }
   
   /**
    * Delete maintenance window.
    *
    * @param id the id
    * @return the status response
    */
   @Processor
   public StatusResponse deleteMaintenanceWindow(String id){
	   return getClient().deleteMaintenanceWindow(id);
   }
   
   /**
    * Gets the alerts per time.
    *
    * @param since the since
    * @param until the until
    * @param rollup the rollup
    * @return the alerts per time
    */
   @Processor
   public ReportsAlertsPerTimeResponse getAlertsPerTime(String since, String until, @Optional String rollup){
	   return getClient().getAlertsPerTime(since, until, rollup); 
   }
   
   /**
    * Gets the incidents per time.
    *
    * @param since the since
    * @param until the until
    * @param rollup the rollup
    * @return the incidents per time
    */
   @Processor
   public ReportsIncidentsPerTimeResponse getIncidentsPerTime(String since, String until, @Optional String rollup){
	   return getClient().getIncidentsPerTime(since, until, rollup); 
   }
   
   /**
    * Gets the schedule by id.
    *
    * @param since the since
    * @param until the until
    * @param timeZone the time zone
    * @return the schedule by id
    */
   @Processor
   public ScheduleByIdGetResponse getScheduleById(@Optional String since, @Optional String until, @Optional String timeZone){
		  return getClient().getScheduleById(since, until, timeZone);
   }
   
   /**
    * Gets the list of schedules of user.
    *
    * @param id the id
    * @param since the since
    * @param until the until
    * @return the list of schedules of user
    */
   @Processor
   public UsersListByScheduleGetResponse getListOfSchedulesOfUser(String id, String since, String until){
	   return getClient().getListOfSchedulesOfUser(id, since, until);
   }
   
   /**
    * Post schedule.
    *
    * @param request the request
    * @return the schedules post response
    */
   @Processor
   public SchedulesPostResponse postSchedule(SchedulesPostRequest request){
	   return getClient().postSchedule(request);
   }
   
   /**
    * Put schedule.
    *
    * @param id the id
    * @param request the request
    * @return the schedules put response
    */
   @Processor
   public SchedulesPutResponse putSchedule(String id, @Default("#[payload]") SchedulesPutRequest request){
	   return getClient().putSchedule(id, request);
   }
   
   /**
    * Post preview schedule.
    *
    * @param request the request
    * @return the schedule preview post response
    */
   @Processor
   public SchedulePreviewPostResponse postPreviewSchedule(SchedulePreviewPostRequest request){
	   return getClient().postPreviewSchedule(request);
   }
   
   /**
    * Delete schedule.
    *
    * @param id the id
    * @return the status response
    */
   @Processor
   public StatusResponse deleteSchedule(String id){
		 return getClient().deleteSchedule(id);
   }
   
   /**
    * Gets the list entries of schedule.
    *
    * @param id the id
    * @param since the since
    * @param until the until
    * @param overflow the overflow
    * @param timeZone the time zone
    * @param userId the user id
    * @return the list entries of schedule
    */
   @Processor
   public ListEntriesOfScheduleGetResponse getListEntriesOfSchedule(String id, String since, String until, @Optional String overflow, @Optional String timeZone, @Optional String userId ){
	   return getClient().getListEntriesOfSchedule(id, since, until, overflow, timeZone, userId);
   }
   
   /**
    * Gets the schedule overriddes by id.
    *
    * @param scheduleId the schedule id
    * @param since the since
    * @param until the until
    * @param editable the editable
    * @param overflow the overflow
    * @return the schedule overriddes by id
    */
   @Processor
   public ScheduleOverridesGetResponse getScheduleOverriddesById(String scheduleId, String since, String until, boolean editable, boolean overflow){
	   return getClient().getScheduleOverriddesById(scheduleId, since, until, editable, overflow);
   }
   
   /**
    * Post schedule overriddes by id.
    *
    * @param scheduleId the schedule id
    * @param request the request
    * @return the schedule overrides post response
    */
   @Processor
   public ScheduleOverridesPostResponse postScheduleOverriddesById(String scheduleId, ScheduleOverridesPostRequest request){
	   return getClient().postScheduleOverriddesById(scheduleId, request);
   }
   
   /**
    * Gets the services list.
    *
    * @param teams the teams
    * @param include the include
    * @param timeZone the time zone
    * @param query the query
    * @param sortBy the sort by
    * @return the services list
    */
   @Processor
   public ServicesListGetResponse getServicesList(@Optional String teams, @Optional String include, @Optional String timeZone, @Optional String query, @Optional String sortBy){
	   return getClient().getServicesList(teams, include, timeZone, query, sortBy);
   }
   
   /**
    * Gets the service details.
    *
    * @param id the id
    * @param include the include
    * @return the service details
    */
   @Processor
   public ServiceDetailsResponse getServiceDetails(String id, @Optional String include){
	   return getClient().getServiceDetails(id, include);
   }
   
   /**
    * Post service.
    *
    * @param request the request
    * @return the service post response
    */
   @Processor
   public ServicePostResponse postService(ServicePostRequest request){
	   return getClient().postService(request);
   }
   
   /**
    * Put service.
    *
    * @param id the id
    * @param request the request
    * @return the service put response
    */
   @Processor
   public ServicePutResponse putService(String id, @Default("#[payload]") ServicePutRequest request){
	   return getClient().putService(id, request);
   }
   
   /**
    * Delete service.
    *
    * @param id the id
    * @return the status response
    */
   @Processor
   public StatusResponse deleteService(String id){
	   return getClient().deleteService(id);
   }
   
   /**
    * Disable service.
    *
    * @param id the id
    * @param requesterId the requester id
    * @return the status response
    */
   @Processor
   public StatusResponse disableService(String id, @Optional String requesterId){
	   return getClient().disableService(id, requesterId);
   }
   
   /**
    * Enable service.
    *
    * @param id the id
    * @param requesterId the requester id
    * @return the status response
    */
   @Processor
   public StatusResponse enableService(String id, @Optional String requesterId){
	   return getClient().enableService(id, requesterId);
   }
   
   /**
    * Creates the email filter.
    *
    * @param serviceId the service id
    * @param request the request
    * @return the email filters post response
    */
   @Processor
   public EmailFiltersPostResponse createEmailFilter(String serviceId, EmailFilterPostRequest request){
	  return getClient().createEmailFilter(serviceId, request);
   }
   
   /**
    * Update email filter.
    *
    * @param serviceId the service id
    * @param emailFilterId the email filter id
    * @param request the request
    * @return the email filter put response
    */
   @Processor
   public EmailFilterPutResponse updateEmailFilter(String serviceId, String emailFilterId, @Default("#[payload]") EmailFilterPutRequest request){
	  return getClient().updateEmailFilter(serviceId, emailFilterId, request);
   }
   
   /**
    * Delete email filter.
    *
    * @param serviceId the service id
    * @param emailFilterId the email filter id
    * @return the status response
    */
   @Processor
   public StatusResponse deleteEmailFilter(String serviceId, String emailFilterId){
	  return getClient().deleteEmailFilter(serviceId, emailFilterId);
   }
   
   /**
    * Gets the users.
    *
    * @param query the query
    * @param include the include
    * @return the users
    */
   @Processor
   public UsersGetResponse getUsers(@Optional String query, @Optional String include){
	   return getClient().getUsers(query, include);
   }
   
   /**
    * Gets the user details.
    *
    * @param id the id
    * @param include the include
    * @return the user details
    */
   @Processor
   public UserDetailsGetResponse getUserDetails(String id, @Optional String include){
	   return getClient().getUserDetails(id, include);
   }
   
   /**
    * Gets the user details on call.
    *
    * @param id the id
    * @param include the include
    * @return the user details on call
    */
   @Processor
   public UserDetailsOnCallGetResponse getUserDetailsOnCall(String id, @Optional String include){
	   return getClient().getUserDetailsOnCall(id,include);
   }
   
   /**
    * Creates the user.
    *
    * @param request the request
    * @return the user post response
    */
   @Processor
   public UserPostResponse createUser(UserPostRequest request){
	   return getClient().createUser(request);
   }
   
   /**
    * Update user.
    *
    * @param id the id
    * @param request the request
    * @return the user put response
    */
   @Processor
   public UserPutResponse updateUser(String id, @Default("#[payload]") UserPutRequest request){
	   return getClient().updateUser(id, request);
   }
   
   /**
    * Delete user.
    *
    * @param id the id
    * @return the status response
    */
   @Processor
   public StatusResponse deleteUser(String id){
	   return getClient().deleteUser(id);
   }
   
   /**
    * Gets the user contact methods.
    *
    * @param id the id
    * @return the user contact methods
    */
   @Processor
   public UserContactMethodsGetResponse getUserContactMethods(String id){
	   return getClient().getUserContactMethods(id);
   }
   
   /**
    * Gets the contact method details.
    *
    * @param userId the user id
    * @param contactMethodId the contact method id
    * @return the contact method details
    */
   @Processor
   public ContactMethodDetailsGetResponse getContactMethodDetails(String userId, String contactMethodId){
	   return getClient().getContactMethodDetails(userId, contactMethodId);
   }
   
   /**
    * Creates the contact method.
    *
    * @param userId the user id
    * @param request the request
    * @return the contact method post response
    */
   @Processor
   public ContactMethodPostResponse createContactMethod(String userId,ContactMethodPostRequest request){
	   return getClient().createContactMethod(userId, request);
   }
   
   /**
    * Update contact method.
    *
    * @param userId the user id
    * @param contactMethodId the contact method id
    * @param request the request
    * @return the contact method put response
    */
   @Processor
   public ContactMethodPutResponse updateContactMethod(String userId, String contactMethodId, @Default("#[payload]") ContactMethodPutRequest request){
	   return getClient().updateContactMethod(userId, contactMethodId, request);
   }
   
   /**
    * Delete contact method.
    *
    * @param userId the user id
    * @param contactMethodId the contact method id
    * @return the status response
    */
   @Processor
   public StatusResponse deleteContactMethod(String userId, String contactMethodId){
	   return getClient().deleteContactMethod(userId, contactMethodId);
   }
   
   /**
    * Gets the nofication rules.
    *
    * @param userId the user id
    * @return the nofication rules
    */
   @Processor
   public NotificationRulesGetResponse getNoficationRules(String userId){
	   return getClient().getNoficationRules(userId);
   }
   
   /**
    * Gets the notification rule details.
    *
    * @param userId the user id
    * @param notificationRuleId the notification rule id
    * @return the notification rule details
    */
   @Processor
   public NotificationRuleGetResponse getNotificationRuleDetails(String userId, String notificationRuleId){
	   return getClient().getNotificationRuleDetails(userId, notificationRuleId);
   }
   
   /**
    * Creates the notification rules.
    *
    * @param userId the user id
    * @param request the request
    * @return the notifcation rule post response
    */
   @Processor
   public NotifcationRulePostResponse createNotificationRules(String userId, NotificationRulePostRequest request){
	   return getClient().createNotificationRules(userId, request);
   }
   
   /**
    * Update notification rule.
    *
    * @param userId the user id
    * @param notificationRuleId the notification rule id
    * @param request the request
    * @return the notification rule put response
    */
   @Processor
   public NotificationRulePutResponse updateNotificationRule(String userId, String notificationRuleId, @Default("#[payload]") NotificationRulePutRequest request){
	   return getClient().updateNotificationRule(userId, notificationRuleId, request);
   }
   
   /**
    * Delete notification rule.
    *
    * @param userId the user id
    * @param notificationRuleId the notification rule id
    * @return the status response
    */
   @Processor
   public StatusResponse deleteNotificationRule(String userId, String notificationRuleId){
	   return getClient().deleteNotificationRule(userId, notificationRuleId);
   }
   
   /**
    * Gets the users on call.
    *
    * @param query the query
    * @param include the include
    * @return the users on call
    */
   @Processor
   public UsersOnCallGetResponse getUsersOnCall(@Optional String query, @Optional String include){
	   return getClient().getUsersOnCall(query, include);
   }
   
   /**
    * Gets the teams.
    *
    * @param query the query
    * @return the teams
    */
   @Processor
   public TeamsGetResponse getTeams(String query){
	   return getClient().getTeams(query);
   }
   
   /**
    * Creates the team.
    *
    * @param request the request
    * @return the teams post response
    */
   @Processor
   public TeamsPostResponse createTeam(TeamPostRequest request){
	   return getClient().createTeam(request);
   }
   
   /**
    * Gets the team information.
    *
    * @param teamId the team id
    * @return the team information
    */
   @Processor
   public TeamGetResponse getTeamInformation(String teamId){
	   return getClient().getTeamInformation(teamId);
   }
   
   /**
    * Update team.
    *
    * @param teamId the team id
    * @param request the request
    * @return the team put response
    */
   @Processor
   public TeamPutResponse updateTeam(String teamId, @Default("#[payload]") TeamPutRequest request){
	   return getClient().updateTeam(teamId, request);
   }
   
   /**
    * Delete team.
    *
    * @param teamId the team id
    * @return the status response
    */
   @Processor
   public StatusResponse deleteTeam(String teamId){
	   return getClient().deleteTeam(teamId);
   }

	   
   
    /**
     * DataSense processor
     *
     * {@sample.xml ../../../doc/pager-duty-connector.xml.sample pager-duty:add-entity}

     * @param key Key to be used to populate the entity
     * @param entity Map that represents the entity
     * @return Some string
     */
    @Processor
    public Map<String,Object> addEntity( @MetaDataKeyParam String key, @Default("#[payload]") Map<String,Object> entity) {
        /*
         * USE THE KEY AND THE MAP TO DO SOMETHING
         */
        return entity;
    }


    /**
     * Gets the config.
     *
     * @return the config
     */
    public ConnectorConfig getConfig() {
        return config;
    }

    /**
     * Sets the config.
     *
     * @param config the new config
     */
    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }


	/**
	 * Gets the client.
	 *
	 * @return the client
	 */
	public PagerDutyClient getClient() {
		return client;
	}


	/**
	 * Sets the client.
	 *
	 * @param client the new client
	 */
	public void setClient(PagerDutyClient client) {
		this.client = client;
	}

}