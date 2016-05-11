/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jackson.map.ObjectMapper;
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
import org.mule.modules.pagerduty.bean.EscalationPoliciesPostRequest;
import org.mule.modules.pagerduty.bean.EscalationPoliciesPostResponse;
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
import org.mule.modules.pagerduty.bean.IncidentsGetResponse;
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
import org.mule.modules.pagerduty.bean.Notes;
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
import org.mule.modules.pagerduty.bean.SchedulesGetResponse;
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

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.core.util.MultivaluedMapImpl;


public class PagerDutyClient {

  private Client client;
  private WebResource apiResource;
  private PagerDutyConnector connector;
  private static final Logger log = Logger.getLogger(PagerDutyClient.class
    .getName());

  public PagerDutyClient(PagerDutyConnector connector) {
    setConnector(connector);

    ClientConfig clientConfig = new DefaultClientConfig();
    clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,
      Boolean.TRUE);
    this.client = Client.create(clientConfig);
    this.apiResource = this.client.resource(getConnector().getConfig()
      .getUrl());
  }
  

  
  public AlertsResponse getAlerts(String sinceDate, String untilDate, String filterType, String time_zone ) {
    WebResource webResource = getApiResource().path("alerts");
    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
      queryParams.add("since", sinceDate);
      queryParams.add("until", untilDate);
    if (filterType != null) {
      queryParams.add("filter[type]", filterType);
    }
    if (time_zone  != null) {
      queryParams.add("time_zone", time_zone);
    }
    webResource = webResource.queryParams(queryParams);
    return (AlertsResponse) getData(webResource,AlertsResponse.class);
  }
  
  
  public EscalationPoliciesGetResponse getEscalationPolicies(String query, String teams, String include){
	  WebResource webResource = getApiResource().path("escalation_policies");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  	if (query != null) {
	      queryParams.add("query", query);
	    }
	    if (teams  != null) {
	      queryParams.add("teams", teams);
	    }
	    if (include != null) {
	        queryParams.add("include", include);
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (EscalationPoliciesGetResponse) getData(webResource, EscalationPoliciesGetResponse.class);
  }
  
  public EscalationPoliciesPostResponse postEscalationPolicies(EscalationPoliciesPostRequest escalationPoliciesRequest){
	  WebResource webResource = getApiResource().path("escalation_policies");
	  
	  return (EscalationPoliciesPostResponse) postData(escalationPoliciesRequest, webResource, EscalationPoliciesPostResponse.class);
  }
  
  public EscalationPolicyIdGetResponse getEscalationPolicyById(String id){
	  WebResource webResource = getApiResource().path("escalation_policies").path(id);
		    return (EscalationPolicyIdGetResponse) getData(webResource, EscalationPolicyIdGetResponse.class);
  }
  
  public EscaltionPolicyIdPutResponse updateEscaltionPolicyById(String id,
	  EscalationPolicyIdPutRequest escalationPolicyIdPutRequest){
	  WebResource webResource = getApiResource().path("escalation_policies").path(id);
	  return (EscaltionPolicyIdPutResponse) putData(escalationPolicyIdPutRequest, webResource, EscaltionPolicyIdPutResponse.class);
  }
  
  public StatusResponse deleteEscalationPolicyById(String id){
	  WebResource webResource = getApiResource().path("escalation_policies").path(id);
	  return (StatusResponse) deleteData(webResource);
  }
  /*
   * this method is for retrieving the EscalationRules by escalationPolicyId
   * 
   */

  public EscalationRulesByIdGetResponse getEscalationRulesById(String escalationPolicyId){
	  WebResource webResource = getApiResource().path("escalation_policies").path(escalationPolicyId).path("escalation_rules");
	  return (EscalationRulesByIdGetResponse) getData(webResource, EscalationRulesByIdGetResponse.class);
  }
  
  public EscalationRulesByIdPostResponse postEscalationRulesById(String escalationPolicyId){
	  WebResource webResource = getApiResource().path("escalation_policies").path(escalationPolicyId).path("escalation_rules");
	  return (EscalationRulesByIdPostResponse) postData(escalationPolicyId,webResource, EscalationRulesByIdPostResponse.class);
  }
  
  public EscalationRulesByIdPutResponse putEscalationRuesById(String escalationPolicyId,String escalationRuleId, EscalationRulesByIdPutRequest escalationRulesByIdPutRequest){
	  WebResource webResource = getApiResource().path("escalation_policies").path(escalationPolicyId).path("escalation_rules").path(escalationRuleId);
	  return (EscalationRulesByIdPutResponse) putData(escalationRulesByIdPutRequest, webResource, EscalationRulesByIdPutResponse.class);
	  
  }
  
  public EscalationRuleByPolicyGetResponse getEsclationRuleByPolicy(String escalation_policy_id, String id){
	  WebResource webResource = getApiResource().path("escalation_policies ").path(escalation_policy_id).path("escalation_rules").path(id);
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	      queryParams.add("escalation_policy_id", escalation_policy_id);
	      queryParams.add("id", id);
	    webResource = webResource.queryParams(queryParams);
	    return (EscalationRuleByPolicyGetResponse) getData(webResource, EscalationRuleByPolicyGetResponse.class);
  }
  
  public EscalationRuleByPolicyPutResponse updateEscalationRule(String escalationPolicyId, String escalationRuleId, EscalationRuleByPolicyPutRequest request){
	  WebResource webResource = getApiResource().path("escalation_policies").path(escalationPolicyId).path("escalation_rules").path(escalationRuleId);
	  return (EscalationRuleByPolicyPutResponse) putData(request, webResource, EscalationRuleByPolicyPutResponse.class);
  }
  
  
  public StatusResponse deleteEscalationRuleByPolicy(String escalation_policy_id, String id){
	  WebResource webResource = getApiResource().path("escalation_policies").path(escalation_policy_id).path("escalation_rules").path(id);
	  return (StatusResponse) deleteData(webResource);
  }
 
  public OnCallGetResponse getOnCall(String query){
	  WebResource webResource = getApiResource().path("escalation_policies ").path("on_call");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
      queryParams.add("query", query);
      webResource = webResource.queryParams(queryParams);
	  return (OnCallGetResponse) getData(webResource, OnCallGetResponse.class);
  }
  
  public IncidentsGetResponse getIncidents(String since, String until, String dateRange, String fields,
		  String status, String incidentKey, String service, String teams, String assignedToUser, 
		  String urgency, String timeZone, String sortBy){
	  WebResource webResource = getApiResource().path("incidents");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  	if (since != null) {
	      queryParams.add("since", since);
	    }
	    if (until  != null) {
	      queryParams.add("until", until);
	    }
	    if (dateRange != null) {
	        queryParams.add("date_range", dateRange);
	    }
	    if (fields != null) {
		     queryParams.add("fields", fields);
		}
		if (status  != null) {
		   queryParams.add("status", status);
		}
		if (incidentKey != null) {
		    queryParams.add("incident_key", incidentKey);
		}
		if (service != null) {
		     queryParams.add("fields", service);
		}
		if (teams  != null) {
		   queryParams.add("status", teams);
		}
		if (assignedToUser != null) {
		    queryParams.add("assinged_to_user", assignedToUser);
		}
		if (urgency != null) {
		     queryParams.add("urgency", urgency);
		}
		if (timeZone  != null) {
		   queryParams.add("time_zone", timeZone);
		}
		if (sortBy != null) {
		    queryParams.add("sort_by", sortBy);
		}
		webResource = webResource.queryParams(queryParams);
		return (IncidentsGetResponse) getData(webResource, IncidentsGetResponse.class);
  }
  
  public IncidentByIdGetResponse getIncidentById(String id){
	  WebResource webResource = getApiResource().path("incidents").path(id);
	  
	  return (IncidentByIdGetResponse) getData(webResource, IncidentByIdGetResponse.class);
  }
  
  public IncidentCountResponse getIncidentsCount(String since, String until, String dateRange, String status, 
		  String incidentKey, String service, String teams, String assignedToUser){
	  
	  WebResource webResource = getApiResource().path("incidents").path("count");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  	if (since != null) {
	      queryParams.add("since", since);
	    }
	    if (until  != null) {
	      queryParams.add("untill", until);
	    }
	    if (dateRange != null) {
	        queryParams.add("date_range", dateRange);
	    }
	   	if (status  != null) {
		   queryParams.add("status", status);
		}
		if (incidentKey != null) {
		    queryParams.add("incident_key", incidentKey);
		}
		if (service != null) {
		     queryParams.add("fields", service);
		}
		if (teams  != null) {
		   queryParams.add("status", teams);
		}
		if (assignedToUser != null) {
		    queryParams.add("assinged_to_user", assignedToUser);
		}
		webResource = webResource.queryParams(queryParams);
	  return (IncidentCountResponse) getData(webResource, IncidentCountResponse.class);
  }
  
  public IncidentNotesGetResponse getIncidentsNotesById(String id){
	  WebResource webResource = getApiResource().path("incidents").path(id).path("notes");
	  return (IncidentNotesGetResponse) getData(webResource, IncidentNotesGetResponse.class);
  }
  
  public IncidentNotesPostResponse postIncidentsNotesById(String incidentId, Note notes, String requesterId){
	  WebResource webResource = getApiResource().path("incidents").path(incidentId).path("notes");
	  return (IncidentNotesPostResponse) postData(incidentId,webResource, IncidentNotesPostResponse.class);
  }
  
  
  
  public LogEntriesGetResponse getLogEntries( String timeZone, String since, String until,String isOverview,
		  String include){
	  WebResource webResource = getApiResource().path("log_entries");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  	if (timeZone != null) {
	      queryParams.add("time_zone", timeZone);
	    }
	    if (since != null) {
	      queryParams.add("since", since);
	    }
	    if (until != null) {
	        queryParams.add("until", until);
	    }
	   	
		   queryParams.add("is_overview", isOverview);
		
	    if (include != null) {
	        queryParams.add("include", include);
	    }
	    webResource = webResource.queryParams(queryParams);
	  
	  return (LogEntriesGetResponse) getData(webResource, LogEntriesGetResponse.class);
  }
  
  public UserLogEntriesGetResponse getUserLogEntries(String id,String timeZone, String since, String until,
		  String isOverview, String include){
	  WebResource webResource = getApiResource().path("users").path(id).path("log_entries");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  if (timeZone != null) {
	      queryParams.add("time_zone", timeZone);
	    }
	    if (since != null) {
	      queryParams.add("since", since);
	    }
	    if (until != null) {
	        queryParams.add("until", until);
	    }

		   queryParams.add("is_overview", isOverview);
		
	    if (include != null) {
	        queryParams.add("include", include);
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (UserLogEntriesGetResponse) getData(webResource, UserLogEntriesGetResponse.class);
  }
  
  public IncidentLogEntriesGetResponse getIncidentLogEntries(String incidentId, String timeZone, String since, 
		  String until, String isOverview, String include){
	  WebResource webResource = getApiResource().path("incidents").path(incidentId).path("log_entries");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  if (timeZone != null) {
	      queryParams.add("time_zone", timeZone);
	    }
	    if (since != null) {
	      queryParams.add("since", since);
	    }
	    if (until != null) {
	        queryParams.add("until", until);
	    }

		   queryParams.add("is_overview", isOverview);
		
	    if (include != null) {
	        queryParams.add("include", include);
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (IncidentLogEntriesGetResponse) getData(webResource, IncidentLogEntriesGetResponse.class);
  
  }
  
  public LogEntriesByIdGetResponse getLogEntriesById(String id, String timeZone, String include){
	  WebResource webResource = getApiResource().path("incidents").path(id).path("log_entries");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  if (timeZone != null) {
	      queryParams.add("time_zone", timeZone);
	    }
	    if (include != null) {
	      queryParams.add("include", include);
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (LogEntriesByIdGetResponse) getData(webResource, LogEntriesByIdGetResponse.class);
	  
  }
  
  public MaintenanceWindowsGetResponse getMaintenanceWindows(String query, String serviceIds, 
		  String teams, String filter, String include){
	  WebResource webResource = getApiResource().path("maintenance_windows");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  if (query != null) {
	      queryParams.add("query", query);
	    }
	    if (serviceIds != null) {
	      queryParams.add("service_ids", serviceIds);
	    }
	    if (teams != null) {
		      queryParams.add("teams", teams);
		}
	    if(filter != null){
	    	queryParams.add("filter", filter);
	    }
	    
		if(include != null){
		  	queryParams.add("include", include);
		}
		    
	    webResource = webResource.queryParams(queryParams);
	    return (MaintenanceWindowsGetResponse) getData(webResource, MaintenanceWindowsGetResponse.class);
  }
  
  public MaintenanceWindowByIdGetResponse getMaintenanceWindowsById(String id){
	  WebResource webResource = getApiResource().path("maintenance_windows").path(id);
  	  return (MaintenanceWindowByIdGetResponse) getData(webResource, MaintenanceWindowByIdGetResponse.class);
  }
  
  public MaintenanceWindowsPostResponse postMaintenanceWindows(MaintenanceWindowsPostRequest request){
	  WebResource webResource = getApiResource().path("maintenance_windows");
	  return (MaintenanceWindowsPostResponse) postData(request, webResource,MaintenanceWindowsPostResponse.class);
  }
  
  public MaintenanceWindowPutResponse putMaintenanceWindowById(String id, MaintenanceWindowPutRequest request){
	  WebResource webResource = getApiResource().path("maintenance_windows").path(id);
	  return (MaintenanceWindowPutResponse) putData(request, webResource, MaintenanceWindowPutResponse.class);
  }
  
  public StatusResponse deleteMaintenanceWindow(String id){
	  WebResource webResource = getApiResource().path("maintenance_windows").path(id);
	  return (StatusResponse) deleteData(webResource);
  }
  
  public ReportsAlertsPerTimeResponse getAlertsPerTime(String since, String until, String rollup){
	  WebResource webResource = getApiResource().path("reports").path("alerts_per_time");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	 
	      queryParams.add("since", since);
	      queryParams.add("until", until);
	    if (rollup != null) {
		      queryParams.add("teams", rollup);
		}
	    webResource = webResource.queryParams(queryParams);
	  return (ReportsAlertsPerTimeResponse) getData(webResource, ReportsAlertsPerTimeResponse.class);
  }
  
  public ReportsIncidentsPerTimeResponse getIncidentsPerTime(String since, String until, String rollup){
	  WebResource webResource = getApiResource().path("reports").path("incidents_per_time");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	 
	      queryParams.add("since", since);
	      queryParams.add("until", until);
	    if (rollup != null) {
		      queryParams.add("teams", rollup);
		}
	    webResource = webResource.queryParams(queryParams);
	  return (ReportsIncidentsPerTimeResponse) getData(webResource, ReportsIncidentsPerTimeResponse.class);
  }
  
  public SchedulesGetResponse getSchedules(String query, String requesterId){
	  WebResource webResource = getApiResource().path("schedules");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	 
	    if (query != null) {
		      queryParams.add("query", query);
		}
	    if(requesterId != null){
	    	queryParams.add("requesterId", requesterId);
	    }
	    webResource = webResource.queryParams(queryParams);
	  return (SchedulesGetResponse) getData(webResource, SchedulesGetResponse.class);
  }
  
  public ScheduleByIdGetResponse getScheduleById(String since, String until, String timeZone){
	  WebResource webResource = getApiResource().path("schedules");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	 
	    if (since != null) {
		      queryParams.add("since", since);
		}
	    if(until != null){
	    	queryParams.add("until", until);
	    }
	    if(timeZone != null){
	    	queryParams.add("time_zone", timeZone);
	    }
	    webResource = webResource.queryParams(queryParams);
	  return (ScheduleByIdGetResponse) getData(webResource, ScheduleByIdGetResponse.class);
  }
  
  public UsersListByScheduleGetResponse getListOfSchedulesOfUser(String id, String since, String until){
	  
	  WebResource webResource = getApiResource().path("schedules").path(id).path("users");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	 
	    if (since != null) {
		      queryParams.add("since", since);
		}
	    if(until != null){
	    	queryParams.add("until", until);
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (UsersListByScheduleGetResponse) getData(webResource, UsersListByScheduleGetResponse.class);
  }
  
  public SchedulesPostResponse postSchedule(SchedulesPostRequest request){
	  WebResource webResource = getApiResource().path("schedules");
	  return (SchedulesPostResponse) postData(request, webResource, SchedulesPostResponse.class );
  }
  
  public SchedulesPutResponse putSchedule(String id, SchedulesPutRequest request){
	  WebResource webResource = getApiResource().path("schedules").path(id);
	  return (SchedulesPutResponse) putData(request, webResource, SchedulesPutResponse.class);
  }
  
  public SchedulePreviewPostResponse postPreviewSchedule(SchedulePreviewPostRequest request){
	  WebResource webResource = getApiResource().path("schedules").path("preview");
	  return (SchedulePreviewPostResponse) postData(request, webResource, SchedulePreviewPostResponse.class );
  }
  
  public StatusResponse deleteSchedule(String id){
	  WebResource webResource = getApiResource().path("schedules").path(id);
	  return (StatusResponse) deleteData(webResource);
  }
  
  public ListEntriesOfScheduleGetResponse getListEntriesOfSchedule(String id, String since, 
		  String until, String overflow, String timeZone, String userId ){
	  WebResource webResource = getApiResource().path("schedules").path(id).path("entries");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  queryParams.add("since", since);
	  queryParams.add("until", until);
	    if(timeZone != null){
	    	queryParams.add("time_zone", timeZone);
	    }
	    if(overflow != null){
	    	queryParams.add("overflow", overflow);
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (ListEntriesOfScheduleGetResponse) getData(webResource, ListEntriesOfScheduleGetResponse.class);
  }
  
  public ScheduleOverridesGetResponse getScheduleOverriddesById(String scheduleId, String since, 
		  String until, boolean editable, boolean overflow){
	  WebResource webResource = getApiResource().path("schedules").path(scheduleId).path("overrides");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  queryParams.add("since", since);
	  queryParams.add("until", until);
	  if(Boolean.toString(editable) != null){
		  queryParams.add("editable", Boolean.toString(editable));
	  }
	  if(Boolean.toString(overflow) != null){
		  queryParams.add("overflow", Boolean.toString(overflow));
	  }
	  webResource = webResource.queryParams(queryParams);
	  return (ScheduleOverridesGetResponse) getData(webResource, ScheduleOverridesGetResponse.class);
  }
  
  public ScheduleOverridesPostResponse postScheduleOverriddesById(String scheduleId, 
		  ScheduleOverridesPostRequest request){
	  WebResource webResource = getApiResource().path("schedules").path(scheduleId).path("overrides");
	  return (ScheduleOverridesPostResponse) postData(request, webResource, ScheduleOverridesPostResponse.class);
  }
  
  public StatusResponse deleteScheduledOverride(String scheduleId, String overridesId){
	  WebResource webResource = getApiResource().path("schedules").path(scheduleId).path("overrides").path(overridesId);
	  return (StatusResponse) deleteData(webResource);
  }
  
  public ServicesListGetResponse getServicesList(String teams, String include, String timeZone, 
		  String query, String sortBy){
	  WebResource webResource = getApiResource().path("services");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  if(teams != null){
		  queryParams.add("teams", teams);
	  }
	  if(timeZone != null){
		  queryParams.add("time_zone", timeZone);
	  }
	  if(query != null){
		  queryParams.add("query", query);
	  }
	  if(sortBy != null){
		  queryParams.add("sort_by", sortBy);
	  }
	  webResource = webResource.queryParams(queryParams);
	  return (ServicesListGetResponse) getData(webResource, ServicesListGetResponse.class);
  }
  
  public ServiceDetailsResponse getServiceDetails(String id, String include){
	  WebResource webResource = getApiResource().path("services");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  if(include != null){
		  queryParams.add("include", include);
	  }
	  webResource = webResource.queryParams(queryParams);
	  return (ServiceDetailsResponse) getData(webResource, ServiceDetailsResponse.class);
  }
  
  public ServicePostResponse postService(ServicePostRequest request){
	  WebResource webResource = getApiResource().path("services");
	    return (ServicePostResponse) postData(request, webResource, ServicePostResponse.class);
  }
  
  public ServicePutResponse putService(String id, ServicePutRequest request){
	  WebResource webResource = getApiResource().path("services").path(id);
	  return (ServicePutResponse) putData(request, webResource, ServicePutResponse.class);
  }
  
  public StatusResponse deleteService(String id){
	  WebResource webResource = getApiResource().path("services").path(id);
	  return (StatusResponse) deleteData(webResource);
  }
  
  public StatusResponse disableService(String id, String requesterId){
	  WebResource webResource = getApiResource().path("services").path(id).path("disable");
	  return (StatusResponse) putData(requesterId, webResource, StatusResponse.class);
  }
  
  public StatusResponse enableService(String id, String requesterId){
	  WebResource webResource = getApiResource().path("services").path(id).path("enable");
	  return (StatusResponse) putData(requesterId, webResource, StatusResponse.class);
  }
  
  public StatusResponse regenerateServiceKey(String id){
	  WebResource webResource = getApiResource().path("services").path(id).path("regenerate_key");
	  return (StatusResponse) postData(id, webResource, StatusResponse.class);
  }
  
  public EmailFiltersPostResponse createEmailFilter(String serviceId, EmailFilterPostRequest request){
	  WebResource webResource = getApiResource().path("services").path(serviceId).path("email_filters");
	  return (EmailFiltersPostResponse) postData(request, webResource, EmailFiltersPostResponse.class);
  }
  
  
  public EmailFilterPutResponse updateEmailFilter(String serviceId, String emailFilterId, EmailFilterPutRequest request){
	  WebResource webResource = getApiResource().path("services").path(serviceId).path("email_filters").path(emailFilterId);
	  return (EmailFilterPutResponse) putData(request, webResource, EmailFilterPutResponse.class);
  }
  
  public StatusResponse deleteEmailFilter(String serviceId, String emailFilterId){
	  WebResource webResource = getApiResource().path("services").path(serviceId).path("email_filters").path(emailFilterId);
	  return (StatusResponse) deleteData(webResource);
  }
  
  public UsersGetResponse getUsers(String query, String include){
	  WebResource webResource = getApiResource().path("users");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  
	  if(query != null){
		  queryParams.add("query", query);
	  }
	  if(include != null){
		  queryParams.add("include", include);
	  }
	  webResource = webResource.queryParams(queryParams);
	  return (UsersGetResponse) getData(webResource, UsersGetResponse.class);
  }
  
  public UserDetailsGetResponse getUserDetails(String id, String include){
	  WebResource webResource = getApiResource().path("users").path(id);
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  if(include != null){
		  queryParams.add("include", include);
	  }
	  webResource = webResource.queryParams(queryParams);
	  return (UserDetailsGetResponse) getData(webResource, UserDetailsGetResponse.class);
  }
  public UserDetailsOnCallGetResponse getUserDetailsOnCall(String id, String include){
	  WebResource webResource = getApiResource().path("users").path(id).path("on_call");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  if(include != null){
		  queryParams.add("include", include);
	  }
	  webResource = webResource.queryParams(queryParams);
	  return (UserDetailsOnCallGetResponse) getData(webResource, UserDetailsOnCallGetResponse.class);
  }
  
  public UserPostResponse createUser(UserPostRequest request){
	  WebResource webResource = getApiResource().path("users");
	  return (UserPostResponse) postData(request, webResource, UserPostResponse.class);
	  
  }
  
  public UserPutResponse updateUser(String id,UserPutRequest request){
	  WebResource webResource = getApiResource().path("users").path(id);
	  return (UserPutResponse) putData(request, webResource, UserPutResponse.class);
	  
  }
  
  public StatusResponse deleteUser(String id){
	  WebResource webResource = getApiResource().path("users").path(id);
	  return (StatusResponse) deleteData(webResource);
	  
  }
  
  public UserContactMethodsGetResponse getUserContactMethods(String id){
	  WebResource webResource = getApiResource().path("users").path(id).path("contact_methods");
	  return (UserContactMethodsGetResponse) getData(webResource, UserContactMethodsGetResponse.class);
  }
  
  public ContactMethodDetailsGetResponse getContactMethodDetails(String userId, String contactMethodId){
	  WebResource webResource = getApiResource().path("users").path(userId).path("contact_methods").path(contactMethodId);
	  return (ContactMethodDetailsGetResponse) getData(webResource, ContactMethodDetailsGetResponse.class);
  }
  
  public ContactMethodPostResponse createContactMethod(String userId, ContactMethodPostRequest request){
	  WebResource webResource = getApiResource().path("users").path(userId).path("contact_methods");
	  return (ContactMethodPostResponse) postData(request, webResource, ContactMethodPostResponse.class);
  }
  
  public ContactMethodPutResponse updateContactMethod(String userId, String contactMethodId, ContactMethodPutRequest request){
	  WebResource webResource = getApiResource().path("users").path(userId).path("contact_methods").path(contactMethodId);
	  return (ContactMethodPutResponse) putData(request, webResource, ContactMethodPutResponse.class);
  }
  
  public StatusResponse deleteContactMethod(String userId, String contactMethodId){
	  WebResource webResource = getApiResource().path("users").path(userId).path("contact_methods").path(contactMethodId);
	  return (StatusResponse) deleteData(webResource);
  }
  
  public NotificationRulesGetResponse getNoficationRules(String userId){
	  WebResource webResource = getApiResource().path("users").path(userId).path("notification_rules");
	  return (NotificationRulesGetResponse) getData(webResource, NotificationRulesGetResponse.class);
  }
  
  public NotificationRuleGetResponse getNotificationRuleDetails(String userId, String notificationRuleId){
	  WebResource webResource = getApiResource().path("users").path(userId).path("notification_rules");
	  return (NotificationRuleGetResponse) getData(webResource, NotificationRuleGetResponse.class);
  }
  
  public NotifcationRulePostResponse createNotificationRules(String userId, NotificationRulePostRequest request){
	  WebResource webResource = getApiResource().path("users").path(userId).path("notification_rules");
	  return (NotifcationRulePostResponse) postData(request, webResource, NotifcationRulePostResponse.class);
  }
  
  public NotificationRulePutResponse updateNotificationRule(String userId, String notificationRuleId, NotificationRulePutRequest request){
	  WebResource webResource = getApiResource().path("users").path(userId).path("notification_rules").path(notificationRuleId);
	  return (NotificationRulePutResponse) putData(request, webResource, NotificationRulePutResponse.class);
  }
  
  public StatusResponse deleteNotificationRule(String userId, String notificationRuleId){
	  WebResource webResource = getApiResource().path("users").path(userId).path("notification_rules").path(notificationRuleId);
	  return (StatusResponse) deleteData(webResource);
  }
  
  public UsersOnCallGetResponse getUsersOnCall(String query, String include){
	  WebResource webResource = getApiResource().path("users").path("on_call");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  if(query != null){
		  queryParams.add("query", query);
	  }
	  if(include != null){
		  queryParams.add("include", include);
	  }
	  webResource = webResource.queryParams(queryParams);
	  return (UsersOnCallGetResponse) getData(webResource, UsersOnCallGetResponse.class);
  }
  
  public TeamsGetResponse getTeams(String query){
	  WebResource webResource = getApiResource().path("teams");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  if(query != null){
		  queryParams.add("query", query);
	  }
	  webResource = webResource.queryParams(queryParams);
	  return (TeamsGetResponse) getData(webResource, TeamsGetResponse.class);
	  
  }
  
  public TeamsPostResponse createTeam(TeamPostRequest request){
	  WebResource webResource = getApiResource().path("teams");
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  
	  webResource = webResource.queryParams(queryParams);
	  return (TeamsPostResponse) postData(request, webResource, TeamsPostResponse.class);
  }
  
  public TeamGetResponse getTeamInformation(String teamId){
	  WebResource webResource = getApiResource().path("teams").path(teamId);
	  return (TeamGetResponse) getData(webResource, TeamGetResponse.class);
  }
  
  public TeamPutResponse updateTeam(String teamId, TeamPutRequest request){
	  WebResource webResource = getApiResource().path("teams").path(teamId);
	  return (TeamPutResponse) putData(request, webResource, TeamPutResponse.class);
  }
  
  public StatusResponse deleteTeam(String teamId){
	  WebResource webResource = getApiResource().path("teams").path(teamId);
	  return (StatusResponse) deleteData(webResource);
  }

  
  
  
  
  private Object getData(WebResource webResource, Class<?> returnClass) {

	  WebResource.Builder builder = addHeader(webResource);

	  ClientResponse clientResponse = builder.get(ClientResponse.class);
	  return buildResponseObject(returnClass, clientResponse);
  }
  
  private Object postData(Object request, WebResource webResource, Class<?> returnClass) {
    WebResource.Builder builder = addHeader(webResource);
    builder.type(MediaType.APPLICATION_JSON);
    ObjectMapper mapper = new ObjectMapper();
    String input = convertObjectToString(request, mapper);
    ClientResponse clientResponse = builder.post(ClientResponse.class, input);
    return buildResponseObject(returnClass, clientResponse);
  }

  private Object putData(Object request, WebResource webResource,
    Class<?> returnClass) {
    WebResource.Builder builder = addHeader(webResource);
    builder.type(MediaType.APPLICATION_JSON);
    ObjectMapper mapper = new ObjectMapper();
    String input = convertObjectToString(request, mapper);

    ClientResponse clientResponse = builder
      .put(ClientResponse.class, input);

    return buildResponseObject(returnClass, clientResponse);
  }

  private Object deleteData(WebResource webResource) {
    WebResource.Builder builder = addHeader(webResource);
    ClientResponse clientResponse = builder.delete(ClientResponse.class);
    return buildDeleteResponseObject(clientResponse);
  }

  private WebResource.Builder addHeader(WebResource webResource) {
    WebResource.Builder builder = webResource
      .accept(MediaType.APPLICATION_JSON);

    builder.header("Authorization", connector.getConfig()
      .getAuthorization());
    return builder;
  }

  private Object buildDeleteResponseObject(ClientResponse clientResponse) {
    StatusResponse statusResponse = new StatusResponse();
    statusResponse
      .setStatusCode(String.valueOf(clientResponse.getStatus()));
    return statusResponse;
  }

  private Object buildResponseObject(Class<?> returnClass,
    ClientResponse clientResponse) {
    StatusResponse statusResponse = null;
    if (clientResponse.getStatus() == 200) {
      statusResponse = (StatusResponse) clientResponse
        .getEntity(returnClass);
      statusResponse.setStatusCode("200");
    } else {
     
      String strResponse = clientResponse.getEntity(String.class);
      try {
        Constructor<?> ctor = returnClass.getConstructor();
        statusResponse = (StatusResponse) ctor.newInstance();
        statusResponse.setStatusCode(String.valueOf(clientResponse
          .getStatus()));
        statusResponse.setStatusMessage(strResponse);
      } catch (Exception ex) {
        log.log(Level.SEVERE, "Error", ex);
      }
    }

    return statusResponse;

  }

  private String convertObjectToString(Object request, ObjectMapper mapper) {
    String input = "";

    try {
      input = mapper.writeValueAsString(request);

    } catch (Exception ex) {
      log.log(Level.SEVERE, "Error", ex);
    }
    log.info("Input String = " + input);
    return input;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public WebResource getApiResource() {
    return apiResource;
  }

  public void setApiResource(WebResource apiResource) {
    this.apiResource = apiResource;
  }

  public PagerDutyConnector getConnector() {
    return connector;
  }

  public void setConnector(PagerDutyConnector connector) {
    this.connector = connector;
  }

}
