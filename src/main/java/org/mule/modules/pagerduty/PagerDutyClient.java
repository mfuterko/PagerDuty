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
import org.mule.modules.pagerduty.bean.IncidentByIdGetResponse;
import org.mule.modules.pagerduty.bean.IncidentsGetResponse;
import org.mule.modules.pagerduty.bean.LogEntriesGetResponse;
import org.mule.modules.pagerduty.bean.ServiceDetailsResponse;
import org.mule.modules.pagerduty.bean.ServicePostRequest;
import org.mule.modules.pagerduty.bean.ServicePostResponse;
import org.mule.modules.pagerduty.bean.ServicesListGetResponse;
import org.mule.modules.pagerduty.bean.StatusResponse;
import org.mule.modules.pagerduty.bean.UserDetailsGetResponse;
import org.mule.modules.pagerduty.bean.UsersGetResponse;

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

  /**
   * Instantiates a new pager duty client.
   *
   * @param connector the connector
   */
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
      queryParams.add("filter", filterType);
    }
    if (time_zone  != null) {
      queryParams.add("time_zone", time_zone);
    }
    webResource = webResource.queryParams(queryParams);
    log.info("Hitting... "+webResource.toString());
    return (AlertsResponse) getData(webResource,AlertsResponse.class);
  }
  
  
  public IncidentsGetResponse getIncidents(String since, String until, String dateRange, String fields,
		  String status, String incidentKey, String service, String teams, String assignedToUser, 
		  String urgency, String timeZone, String sortBy){
	  WebResource webResource = getApiResource().path("incidents");
	  log.info("The requested URL/Service is : "+webResource.toString());
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
		log.info("The requested URL/Service is : "+webResource.toString());
		return (IncidentsGetResponse) getData(webResource, IncidentsGetResponse.class);
  }
  
  public IncidentByIdGetResponse getIncidentById(String id){
	  WebResource webResource = getApiResource().path("incidents").path(id);
	  log.info("Hitting... "+webResource.toString());
	  return (IncidentByIdGetResponse) getData(webResource, IncidentByIdGetResponse.class);
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
	  log.info("Hitting... "+webResource.toString());
	  return (ServicesListGetResponse) getData(webResource, ServicesListGetResponse.class);
  }
  
  public ServiceDetailsResponse getServiceDetails(String id, String include){
	  WebResource webResource = getApiResource().path("services").path(id);
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  if(include != null){
		  queryParams.add("include", include);
	  }
	  webResource = webResource.queryParams(queryParams);
	  log.info("Hitting... "+webResource.toString());
	  return (ServiceDetailsResponse) getData(webResource, ServiceDetailsResponse.class);
  }
  
  public ServicePostResponse postService(ServicePostRequest request){
	  WebResource webResource = getApiResource().path("services");
	  log.info("Hitting... "+webResource.toString());
	    return (ServicePostResponse) postData(request, webResource, ServicePostResponse.class);
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
	  log.info("Hitting... "+webResource.toString());
	  return (UsersGetResponse) getData(webResource, UsersGetResponse.class);
  }
  
  public UserDetailsGetResponse getUserDetails(String id, String include){
	  WebResource webResource = getApiResource().path("users").path(id);
	  MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	  if(include != null){
		  queryParams.add("include", include);
	  }
	  webResource = webResource.queryParams(queryParams);
	  log.info("Hitting... "+webResource.toString());
	  return (UserDetailsGetResponse) getData(webResource, UserDetailsGetResponse.class);
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
	    if (until != null) {
		   queryParams.add("is_overview", isOverview);
	    }
	    if (include != null) {
	        queryParams.add("include", include);
	    }
	    webResource = webResource.queryParams(queryParams);
	    log.info("Hitting... "+webResource.toString());
	  return (LogEntriesGetResponse) getData(webResource, LogEntriesGetResponse.class);
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
    
    builder.header("Authorization", connector.getConfig().getAuthorization());
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
