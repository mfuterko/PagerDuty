
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
import org.mule.modules.pagerduty.bean.ListEntriesOfScheduleGetResponse;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * GetListEntriesOfScheduleMessageProcessor invokes the {@link org.mule.modules.pagerduty.PagerDutyConnector#getListEntriesOfSchedule(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link PagerDutyConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class GetListEntriesOfScheduleMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object id;
    protected String _idType;
    protected Object since;
    protected String _sinceType;
    protected Object until;
    protected String _untilType;
    protected Object overflow;
    protected String _overflowType;
    protected Object timeZone;
    protected String _timeZoneType;
    protected Object userId;
    protected String _userIdType;

    public GetListEntriesOfScheduleMessageProcessor(String operationName) {
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
     * Sets id
     * 
     * @param value Value to set
     */
    public void setId(Object value) {
        this.id = value;
    }

    /**
     * Sets userId
     * 
     * @param value Value to set
     */
    public void setUserId(Object value) {
        this.userId = value;
    }

    /**
     * Sets overflow
     * 
     * @param value Value to set
     */
    public void setOverflow(Object value) {
        this.overflow = value;
    }

    /**
     * Sets timeZone
     * 
     * @param value Value to set
     */
    public void setTimeZone(Object value) {
        this.timeZone = value;
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
            final String _transformedId = ((String) evaluateAndTransform(getMuleContext(), event, GetListEntriesOfScheduleMessageProcessor.class.getDeclaredField("_idType").getGenericType(), null, id));
            final String _transformedSince = ((String) evaluateAndTransform(getMuleContext(), event, GetListEntriesOfScheduleMessageProcessor.class.getDeclaredField("_sinceType").getGenericType(), null, since));
            final String _transformedUntil = ((String) evaluateAndTransform(getMuleContext(), event, GetListEntriesOfScheduleMessageProcessor.class.getDeclaredField("_untilType").getGenericType(), null, until));
            final String _transformedOverflow = ((String) evaluateAndTransform(getMuleContext(), event, GetListEntriesOfScheduleMessageProcessor.class.getDeclaredField("_overflowType").getGenericType(), null, overflow));
            final String _transformedTimeZone = ((String) evaluateAndTransform(getMuleContext(), event, GetListEntriesOfScheduleMessageProcessor.class.getDeclaredField("_timeZoneType").getGenericType(), null, timeZone));
            final String _transformedUserId = ((String) evaluateAndTransform(getMuleContext(), event, GetListEntriesOfScheduleMessageProcessor.class.getDeclaredField("_userIdType").getGenericType(), null, userId));
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
                    return ((PagerDutyConnector) object).getListEntriesOfSchedule(_transformedId, _transformedSince, _transformedUntil, _transformedOverflow, _transformedTimeZone, _transformedUserId);
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
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(ListEntriesOfScheduleGetResponse.class)));
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at PagerDutyConnector at getListEntriesOfSchedule retrieving was successful but result is null");
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
