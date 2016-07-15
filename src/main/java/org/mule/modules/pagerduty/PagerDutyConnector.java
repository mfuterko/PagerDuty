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
import org.mule.modules.pagerduty.bean.IncidentByIdGetResponse;
import org.mule.modules.pagerduty.bean.IncidentsGetResponse;
import org.mule.modules.pagerduty.bean.LogEntriesGetResponse;
import org.mule.modules.pagerduty.bean.ServiceDetailsResponse;
import org.mule.modules.pagerduty.bean.ServicePostRequest;
import org.mule.modules.pagerduty.bean.ServicePostResponse;
import org.mule.modules.pagerduty.bean.ServicesListGetResponse;
import org.mule.modules.pagerduty.bean.UserDetailsGetResponse;
import org.mule.modules.pagerduty.bean.UsersGetResponse;
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
    public AlertsResponse getAlerts(String sinceDate,String untilDate,  @Optional String filterType,  @Optional String time_zone ) {
    	 return getClient().getAlerts(sinceDate, untilDate, filterType, time_zone);
    }
   
//Get methods for incidents
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