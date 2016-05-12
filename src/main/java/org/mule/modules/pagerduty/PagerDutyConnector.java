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

import com.sun.jersey.api.client.WebResource;

/**
 * This is Cisco Spark Connector Class
 * @author Surender
 *
 * 
 */

@Connector(name="pager-duty", friendlyName="PagerDuty")
@MetaDataScope( DataSenseResolver.class )
public class PagerDutyConnector {

    @Config
    ConnectorConfig config;
    
    private PagerDutyClient client;

    /**
     * 
     */
  @Start
    public void init() {
      setClient(new PagerDutyClient(this));
    }


  /**
   * This method gets the Alerts using sinceDate , untilDate ,filterType, timeZone
   * {@sample.xml ../../../doc/cisco-spark-connector.xml.sample CiscoSpark:get-memberships}
   * 
   * @param sinceDate , The since Date.<BR>
   * @param untilDate , The until Daet.<BR>
   * @param filterType , The Person Email.<BR>
   * @param timeZone , The time zone.<BR>
   * @return AlertsResponse object
   */
   @Processor
    public AlertsResponse getAlerts(String sinceDate,
    	    String untilDate,  @Optional String filterType,  @Optional String time_zone ) {
    	 return getClient().getAlerts(sinceDate, untilDate, filterType, time_zone);
    }
   
   /**
    * This method gets the EscalationPolicies using query, teams, include
    * {@sample.xml ../../../doc/cisco-spark-connector.xml.sample CiscoSpark:get-memberships}
    * 
    * @param query , The since query.<BR>
    * @param teams , The until teams.<BR>
    * @param include , The Person include.<BR>
    * @return EscalationPoliciesGetResponse object
    */
   @Processor
   public EscalationPoliciesGetResponse getEscalationPolicies(@Optional String query,@Optional String teams,
		   @Optional String include){
	   return getClient().getEscalationPolicies(query, teams, include);
   }
   
   /**
    * This method gets the EscalationPolicies using ID of the escalationpolicy
    * {@sample.xml ../../../doc/cisco-spark-connector.xml.sample CiscoSpark:get-memberships}
    * 
    * @param id, The ID.<BR>
    * @return EscalationPolicyIdGetResponse object
    */
   @Processor
   public EscalationPolicyIdGetResponse getEscalationPolicyById(@Optional String id){
	   return getClient().getEscalationPolicyById(id);
   }
   
   /**
    * This method updates the EscalationPolicy using ID and the EscalationPolicyIdPutRequest of the escalationpolicy
    * 
    * 
    * @param id, The ID.<BR>
    * @return EscaltionPolicyIdPutResponse object
    */
   @Processor
   public EscaltionPolicyIdPutResponse updateEscaltionPolicyById(String id,
			  @Default("#[payload]") EscalationPolicyIdPutRequest escalationPolicyIdPutRequest){
	   return getClient().updateEscaltionPolicyById(id, escalationPolicyIdPutRequest);
   }
   
   /**
    * This method deletes the EscalationPolicy of the provided ID
    * 
    * 
    * @param id, The ID.<BR>
    * @return StatusResponse object
    */
   @Processor
   public StatusResponse deleteEscalationPolicyById(String id){
	   return getClient().deleteEscalationPolicyById(id);
   }
   
   /**
    * This method deletes the EscalationPolicy of the provided ID
    * 
    * 
    * @param id, The ID.<BR>
    * @return StatusResponse object
    */
   @Processor
   public EscalationRulesByIdGetResponse getEscalationRulesById(String id){
	   return getClient().getEscalationRulesById(id);
   }
   
   @Processor
   public EscalationRulesByIdPostResponse postEscalationRulesById(String id){
	   return getClient().postEscalationRulesById(id);
   }
   
   @Processor
   public EscalationRulesByIdPutResponse putEscalationRuesById(String escalationPolicyId, String escalationRuleId, 
		   @Default("#[payload]") EscalationRulesByIdPutRequest escalationRulesByIdPutRequest){
	   return getClient().putEscalationRuesById(escalationPolicyId,escalationRuleId, escalationRulesByIdPutRequest);
   
   }
   
   @Processor
   public EscalationRuleByPolicyGetResponse getEsclationRuleByPolicy(String escalation_policy_id, String id){
	   return getClient().getEsclationRuleByPolicy(escalation_policy_id, id);
   }
   public EscalationRuleByPolicyPutResponse updateEscalationRule(String escalationPolicyId, String escalationRuleId, 
		   @Default("#[payload]") EscalationRuleByPolicyPutRequest request){
	   return getClient().updateEscalationRule(escalationPolicyId, escalationRuleId, request);
   }
   @Processor
   public StatusResponse deleteEscalationRuleByPolicy(String escalation_policy_id, String id){
	   return getClient().deleteEscalationRuleByPolicy(escalation_policy_id, id);
   }
   
   @Processor
   public OnCallGetResponse getOnCall(String query){
	   return getClient().getOnCall(query);
   }
   
   @Processor
   public IncidentsGetResponse getIncidents(@Optional String since,@Optional String untill,@Optional String dateRange,@Optional String fields,
		   @Optional String status, @Optional String incidentKey,@Optional String service,@Optional String teams,@Optional String assignedToUser, 
		   @Optional  String urgency,@Optional String timeZone, @Optional String sortBy){
	   return getClient().getIncidents(since, untill, dateRange, fields, status, incidentKey, service, teams, assignedToUser, urgency, timeZone, sortBy);
   }
   
   @Processor
   public IncidentByIdGetResponse getIncidentsById(String id){
	   return getClient().getIncidentById(id);
   }
   
   @Processor
   public IncidentCountResponse getIncidentsCount(@Optional String since, @Optional String until, @Optional String dateRange, @Optional String status,
		   @Optional String incidentKey, @Optional String service, @Optional String teams, @Optional String assignedToUser){
	   return getClient().getIncidentsCount(since, until, dateRange, status, incidentKey, service, teams, assignedToUser);
   }
   
   @Processor
   public IncidentsPutResponse putIncidents(IncidentsPutRequest request){
	   return getClient().putIncidents(request);
   }
   @Processor
   public StatusResponse resolveIncident(String incidentId, @Default("#[payload]") IncidentsResolvePutRequest request ){
	   return getClient().resolveIncident(incidentId, request);
   }
   @Processor
   public StatusResponse acknowledgeIncident(String incidentId, @Default("#[payload]") IncidentsAcknowledgePutRequest request ){
	   return getClient().acknowledgeIncident(incidentId, request);
   }
   @Processor
   public StatusResponse reassignIncident(String incidentId, @Default("#[payload]") IncidentsReassignPutRequest request ){
	  return getClient().reassignIncident(incidentId, request);
   }
   @Processor
   public StatusResponse snoozeIncident(String incidentId, @Default("#[payload]") IncidentsSnoozePutRequest request ){
	   return getClient().snoozeIncident(incidentId, request);
   }
	  
	  
   @Processor
   public IncidentNotesGetResponse getIncidentsNotesById(String id){
	   return getClient().getIncidentsNotesById(id);
   }
   
   @Processor
   public IncidentNotesPostResponse postIncidentsNotesById( String id, Note notes, String registerId){
	   return getClient().postIncidentsNotesById(id, notes, registerId);
   }
   @Processor
   public LogEntriesGetResponse getLogEntries(@Optional String timeZone, @Optional String since, @Optional String until, @Optional String isOverview,
		   @Optional String include){
	   return getClient().getLogEntries(timeZone, since, until, isOverview, include);
   }
   @Processor
   public UserLogEntriesGetResponse getUserLogEntries(String id, @Optional String timeZone, @Optional String since, @Optional String until, 
		   @Optional String isOverview, @Optional String include){
	   return getClient().getUserLogEntries(id, timeZone, since, until, isOverview, include);
   }
   @Processor
   public IncidentLogEntriesGetResponse getIncidentLogEntries(String incidentId, @Optional String timeZone, @Optional String since, 
		   @Optional String until, @Optional String isOverview, @Optional String include){
	   return getClient().getIncidentLogEntries(incidentId, timeZone, since, until, isOverview, include);
   }
   
   @Processor
   public LogEntriesByIdGetResponse getLogEntriesById(String id, String timeZone, String include){
	   return getClient().getLogEntriesById(id, timeZone, include);
   }
   
   @Processor
   public MaintenanceWindowsGetResponse getMaintenanceWindows(@Optional String query, @Optional String serviceIds, @Optional String teams, 
		   @Optional String filter, @Optional String include){
	   return getClient().getMaintenanceWindows(query, serviceIds, teams, filter, include);
   }
   
   @Processor
   public MaintenanceWindowByIdGetResponse getMaintenanceWindowsById(String id){
	   return getClient().getMaintenanceWindowsById(id);
   }
   
   @Processor
   public MaintenanceWindowsPostResponse postMaintenanceWindows(MaintenanceWindowsPostRequest request){
	   return getClient().postMaintenanceWindows(request);
   }
   
   @Processor
   public MaintenanceWindowPutResponse putMaintenanceWindowById(String id, @Default("#[payload]") MaintenanceWindowPutRequest request){
	   return getClient().putMaintenanceWindowById(id, request);
   }
   @Processor
   public StatusResponse deleteMaintenanceWindow(String id){
	   return getClient().deleteMaintenanceWindow(id);
   }
   @Processor
   public ReportsAlertsPerTimeResponse getAlertsPerTime(String since, String until, @Optional String rollup){
	   return getClient().getAlertsPerTime(since, until, rollup); 
   }
   @Processor
   public ReportsIncidentsPerTimeResponse getIncidentsPerTime(String since, String until, @Optional String rollup){
	   return getClient().getIncidentsPerTime(since, until, rollup); 
   }
   @Processor
   public ScheduleByIdGetResponse getScheduleById(@Optional String since, @Optional String until, @Optional String timeZone){
		  return getClient().getScheduleById(since, until, timeZone);
   }
   @Processor
   public UsersListByScheduleGetResponse getListOfSchedulesOfUser(String id, String since, String until){
	   return getClient().getListOfSchedulesOfUser(id, since, until);
   }
   @Processor
   public SchedulesPostResponse postSchedule(SchedulesPostRequest request){
	   return getClient().postSchedule(request);
   }
   @Processor
   public SchedulesPutResponse putSchedule(String id, @Default("#[payload]") SchedulesPutRequest request){
	   return getClient().putSchedule(id, request);
   }
   @Processor
   public SchedulePreviewPostResponse postPreviewSchedule(SchedulePreviewPostRequest request){
	   return getClient().postPreviewSchedule(request);
   }
   
   @Processor
   public StatusResponse deleteSchedule(String id){
		 return getClient().deleteSchedule(id);
   }
   @Processor
   public ListEntriesOfScheduleGetResponse getListEntriesOfSchedule(String id, String since, String until, @Optional String overflow, @Optional String timeZone, @Optional String userId ){
	   return getClient().getListEntriesOfSchedule(id, since, until, overflow, timeZone, userId);
   }
   @Processor
   public ScheduleOverridesGetResponse getScheduleOverriddesById(String scheduleId, String since, String until, boolean editable, boolean overflow){
	   return getClient().getScheduleOverriddesById(scheduleId, since, until, editable, overflow);
   }
   @Processor
   public ScheduleOverridesPostResponse postScheduleOverriddesById(String scheduleId, ScheduleOverridesPostRequest request){
	   return getClient().postScheduleOverriddesById(scheduleId, request);
   }
   
   @Processor
   public ServicesListGetResponse getServicesList(@Optional String teams, @Optional String include, @Optional String timeZone, @Optional String query, @Optional String sortBy){
	   return getClient().getServicesList(teams, include, timeZone, query, sortBy);
   }
   @Processor
   public ServiceDetailsResponse getServiceDetails(String id, @Optional String include){
	   return getClient().getServiceDetails(id, include);
   }
   @Processor
   public ServicePostResponse postService(ServicePostRequest request){
	   return getClient().postService(request);
   }
   @Processor
   public ServicePutResponse putService(String id, @Default("#[payload]") ServicePutRequest request){
	   return getClient().putService(id, request);
   }
   @Processor
   public StatusResponse deleteService(String id){
	   return getClient().deleteService(id);
   }
   @Processor
   public StatusResponse disableService(String id, @Optional String requesterId){
	   return getClient().disableService(id, requesterId);
   }
   @Processor
   public StatusResponse enableService(String id, @Optional String requesterId){
	   return getClient().enableService(id, requesterId);
   }
   @Processor
   public EmailFiltersPostResponse createEmailFilter(String serviceId, EmailFilterPostRequest request){
	  return getClient().createEmailFilter(serviceId, request);
   }
   @Processor
   public EmailFilterPutResponse updateEmailFilter(String serviceId, String emailFilterId, @Default("#[payload]") EmailFilterPutRequest request){
	  return getClient().updateEmailFilter(serviceId, emailFilterId, request);
   }
   
   @Processor
   public StatusResponse deleteEmailFilter(String serviceId, String emailFilterId){
	  return getClient().deleteEmailFilter(serviceId, emailFilterId);
   }
   
   @Processor
   public UsersGetResponse getUsers(@Optional String query, @Optional String include){
	   return getClient().getUsers(query, include);
   }
   
   @Processor
   public UserDetailsGetResponse getUserDetails(String id, @Optional String include){
	   return getClient().getUserDetails(id, include);
   }
   
   @Processor
   public UserDetailsOnCallGetResponse getUserDetailsOnCall(String id, @Optional String include){
	   return getClient().getUserDetailsOnCall(id,include);
   }
   
   @Processor
   public UserPostResponse createUser(UserPostRequest request){
	   return getClient().createUser(request);
   }
   @Processor
   public UserPutResponse updateUser(String id, @Default("#[payload]") UserPutRequest request){
	   return getClient().updateUser(id, request);
   }
   @Processor
   public StatusResponse deleteUser(String id){
	   return getClient().deleteUser(id);
   }
   
   @Processor
   public UserContactMethodsGetResponse getUserContactMethods(String id){
	   return getClient().getUserContactMethods(id);
   }
   
   @Processor
   public ContactMethodDetailsGetResponse getContactMethodDetails(String userId, String contactMethodId){
	   return getClient().getContactMethodDetails(userId, contactMethodId);
   }
   
   @Processor
   public ContactMethodPostResponse createContactMethod(String userId,ContactMethodPostRequest request){
	   return getClient().createContactMethod(userId, request);
   }
   
   @Processor
   public ContactMethodPutResponse updateContactMethod(String userId, String contactMethodId, @Default("#[payload]") ContactMethodPutRequest request){
	   return getClient().updateContactMethod(userId, contactMethodId, request);
   }
   
   @Processor
   public StatusResponse deleteContactMethod(String userId, String contactMethodId){
	   return getClient().deleteContactMethod(userId, contactMethodId);
   }
   
   @Processor
   public NotificationRulesGetResponse getNoficationRules(String userId){
	   return getClient().getNoficationRules(userId);
   }
   
   @Processor
   public NotificationRuleGetResponse getNotificationRuleDetails(String userId, String notificationRuleId){
	   return getClient().getNotificationRuleDetails(userId, notificationRuleId);
   }
   
   @Processor
   public NotifcationRulePostResponse createNotificationRules(String userId, NotificationRulePostRequest request){
	   return getClient().createNotificationRules(userId, request);
   }
   
   @Processor
   public NotificationRulePutResponse updateNotificationRule(String userId, String notificationRuleId, @Default("#[payload]") NotificationRulePutRequest request){
	   return getClient().updateNotificationRule(userId, notificationRuleId, request);
   }
   
   @Processor
   public StatusResponse deleteNotificationRule(String userId, String notificationRuleId){
	   return getClient().deleteNotificationRule(userId, notificationRuleId);
   }
   
   @Processor
   public UsersOnCallGetResponse getUsersOnCall(@Optional String query, @Optional String include){
	   return getClient().getUsersOnCall(query, include);
   }
   
   @Processor
   public TeamsGetResponse getTeams(String query){
	   return getClient().getTeams(query);
   }
   
   @Processor
   public TeamsPostResponse createTeam(TeamPostRequest request){
	   return getClient().createTeam(request);
   }
   
   @Processor
   public TeamGetResponse getTeamInformation(String teamId){
	   return getClient().getTeamInformation(teamId);
   }
   
   @Processor
   public TeamPutResponse updateTeam(String teamId, @Default("#[payload]") TeamPutRequest request){
	   return getClient().updateTeam(teamId, request);
   }
   
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


    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }


	public PagerDutyClient getClient() {
		return client;
	}


	public void setClient(PagerDutyClient client) {
		this.client = client;
	}

}