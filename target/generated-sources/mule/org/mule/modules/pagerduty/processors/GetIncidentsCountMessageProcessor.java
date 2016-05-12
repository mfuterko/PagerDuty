
package org.mule.modules.pagerduty.processors;

import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.config.ConfigurationException;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.registry.RegistrationException;
import org.mule.common.DefaultResult;
import org.mule.common.FailureType;
import org.mule.common.Result;
import org.mule.common.metadata.ConnectorMetaDataEnabled;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.devkit.processor.DevkitBasedMessageProcessor;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.bean.IncidentCountResponse;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * GetIncidentsCountMessageProcessor invokes the {@link org.mule.modules.pagerduty.PagerDutyConnector#getIncidentsCount(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link PagerDutyConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class GetIncidentsCountMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object since;
    protected String _sinceType;
    protected Object until;
    protected String _untilType;
    protected Object dateRange;
    protected String _dateRangeType;
    protected Object status;
    protected String _statusType;
    protected Object incidentKey;
    protected String _incidentKeyType;
    protected Object service;
    protected String _serviceType;
    protected Object teams;
    protected String _teamsType;
    protected Object assignedToUser;
    protected String _assignedToUserType;

    public GetIncidentsCountMessageProcessor(String operationName) {
        super(operationName);
    }

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    @Override
    public void start()
        throws MuleException
    {
        super.start();
    }

    @Override
    public void stop()
        throws MuleException
    {
        super.stop();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    /**
     * Sets teams
     * 
     * @param value Value to set
     */
    public void setTeams(Object value) {
        this.teams = value;
    }

    /**
     * Sets dateRange
     * 
     * @param value Value to set
     */
    public void setDateRange(Object value) {
        this.dateRange = value;
    }

    /**
     * Sets status
     * 
     * @param value Value to set
     */
    public void setStatus(Object value) {
        this.status = value;
    }

    /**
     * Sets service
     * 
     * @param value Value to set
     */
    public void setService(Object value) {
        this.service = value;
    }

    /**
     * Sets incidentKey
     * 
     * @param value Value to set
     */
    public void setIncidentKey(Object value) {
        this.incidentKey = value;
    }

    /**
     * Sets since
     * 
     * @param value Value to set
     */
    public void setSince(Object value) {
        this.since = value;
    }

    /**
     * Sets assignedToUser
     * 
     * @param value Value to set
     */
    public void setAssignedToUser(Object value) {
        this.assignedToUser = value;
    }

    /**
     * Sets until
     * 
     * @param value Value to set
     */
    public void setUntil(Object value) {
        this.until = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws Exception
     */
    public MuleEvent doProcess(final MuleEvent event)
        throws Exception
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(null, false, event);
            final String _transformedSince = ((String) evaluateAndTransform(getMuleContext(), event, GetIncidentsCountMessageProcessor.class.getDeclaredField("_sinceType").getGenericType(), null, since));
            final String _transformedUntil = ((String) evaluateAndTransform(getMuleContext(), event, GetIncidentsCountMessageProcessor.class.getDeclaredField("_untilType").getGenericType(), null, until));
            final String _transformedDateRange = ((String) evaluateAndTransform(getMuleContext(), event, GetIncidentsCountMessageProcessor.class.getDeclaredField("_dateRangeType").getGenericType(), null, dateRange));
            final String _transformedStatus = ((String) evaluateAndTransform(getMuleContext(), event, GetIncidentsCountMessageProcessor.class.getDeclaredField("_statusType").getGenericType(), null, status));
            final String _transformedIncidentKey = ((String) evaluateAndTransform(getMuleContext(), event, GetIncidentsCountMessageProcessor.class.getDeclaredField("_incidentKeyType").getGenericType(), null, incidentKey));
            final String _transformedService = ((String) evaluateAndTransform(getMuleContext(), event, GetIncidentsCountMessageProcessor.class.getDeclaredField("_serviceType").getGenericType(), null, service));
            final String _transformedTeams = ((String) evaluateAndTransform(getMuleContext(), event, GetIncidentsCountMessageProcessor.class.getDeclaredField("_teamsType").getGenericType(), null, teams));
            final String _transformedAssignedToUser = ((String) evaluateAndTransform(getMuleContext(), event, GetIncidentsCountMessageProcessor.class.getDeclaredField("_assignedToUserType").getGenericType(), null, assignedToUser));
            Object resultPayload;
            final ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class<? extends Exception>> getManagedExceptions() {
                    return null;
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((PagerDutyConnector) object).getIncidentsCount(_transformedSince, _transformedUntil, _transformedDateRange, _transformedStatus, _transformedIncidentKey, _transformedService, _transformedTeams, _transformedAssignedToUser);
                }

            }
            , this, event);
            event.getMessage().setPayload(resultPayload);
            return event;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(IncidentCountResponse.class)));
    }

    private MetaDataModel getPojoOrSimpleModel(Class clazz) {
        DataType dataType = DataTypeFactory.getInstance().getDataType(clazz);
        if (DataType.POJO.equals(dataType)) {
            return new DefaultPojoMetaDataModel(clazz);
        } else {
            return new DefaultSimpleMetaDataModel(dataType);
        }
    }

    public Result<MetaData> getGenericMetaData(MetaDataKey metaDataKey) {
        ConnectorMetaDataEnabled connector;
        try {
            connector = ((ConnectorMetaDataEnabled) findOrCreate(null, false, null));
            try {
                Result<MetaData> metadata = connector.getMetaData(metaDataKey);
                if ((Result.Status.FAILURE).equals(metadata.getStatus())) {
                    return metadata;
                }
                if (metadata.get() == null) {
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at PagerDutyConnector at getIncidentsCount retrieving was successful but result is null");
                }
                return metadata;
            } catch (Exception e) {
                return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
            }
        } catch (ClassCastException cast) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error getting metadata, there was no connection manager available. Maybe you're trying to use metadata from an Oauth connector");
        } catch (ConfigurationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (RegistrationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (IllegalAccessException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (InstantiationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (Exception e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        }
    }

}
