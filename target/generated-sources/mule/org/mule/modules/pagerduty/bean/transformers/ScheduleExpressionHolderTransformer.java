
package org.mule.modules.pagerduty.bean.transformers;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.endpoint.ImmutableEndpoint;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.transformer.DataType;
import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.MessageTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transformer.TransformerMessagingException;
import org.mule.config.i18n.CoreMessages;
import org.mule.devkit.processor.ExpressionEvaluatorSupport;
import org.mule.modules.pagerduty.bean.Final_schedule;
import org.mule.modules.pagerduty.bean.Overrides_subschedule;
import org.mule.modules.pagerduty.bean.Schedule;
import org.mule.modules.pagerduty.bean.Schedule_layers;
import org.mule.modules.pagerduty.bean.holders.ScheduleExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class ScheduleExpressionHolderTransformer
    extends ExpressionEvaluatorSupport
    implements DiscoverableTransformer, MessageTransformer
{

    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING;
    private ImmutableEndpoint endpoint;
    private MuleContext muleContext;
    private String name;

    public int getPriorityWeighting() {
        return weighting;
    }

    public void setPriorityWeighting(int weighting) {
        this.weighting = weighting;
    }

    public boolean isSourceTypeSupported(Class<?> aClass) {
        return (aClass == ScheduleExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == ScheduleExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {ScheduleExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(ScheduleExpressionHolder.class)});
    }

    public boolean isAcceptNull() {
        return false;
    }

    public boolean isIgnoreBadInput() {
        return false;
    }

    public Object transform(Object src)
        throws TransformerException
    {
        throw new UnsupportedOperationException();
    }

    public Object transform(Object src, String encoding)
        throws TransformerException
    {
        throw new UnsupportedOperationException();
    }

    public void setReturnClass(Class<?> theClass) {
        throw new UnsupportedOperationException();
    }

    public Class<?> getReturnClass() {
        return Schedule.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(Schedule.class);
    }

    public void setEndpoint(ImmutableEndpoint ep) {
        endpoint = ep;
    }

    public ImmutableEndpoint getEndpoint() {
        return endpoint;
    }

    public void dispose() {
    }

    public void initialise()
        throws InitialisationException
    {
    }

    public void setMuleContext(MuleContext context) {
        muleContext = context;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public Object transform(Object src, MuleEvent event)
        throws TransformerMessagingException
    {
        return transform(src, null, event);
    }

    public Object transform(Object src, String encoding, MuleEvent event)
        throws TransformerMessagingException
    {
        if (src == null) {
            return null;
        }
        ScheduleExpressionHolder holder = ((ScheduleExpressionHolder) src);
        Schedule result = new Schedule();
        try {
            final String _transformedId = ((String) evaluateAndTransform(this.muleContext, event, ScheduleExpressionHolder.class.getDeclaredField("_idType").getGenericType(), null, holder.getId()));
            result.setId(_transformedId);
            final String _transformedTime_zone = ((String) evaluateAndTransform(this.muleContext, event, ScheduleExpressionHolder.class.getDeclaredField("_time_zoneType").getGenericType(), null, holder.getTime_zone()));
            result.setTime_zone(_transformedTime_zone);
            final String[] _transformedEscalation_policies = ((String[]) evaluateAndTransform(this.muleContext, event, ScheduleExpressionHolder.class.getDeclaredField("_escalation_policiesType").getGenericType(), null, holder.getEscalation_policies()));
            result.setEscalation_policies(_transformedEscalation_policies);
            final Final_schedule _transformedFinal_schedule = ((Final_schedule) evaluateAndTransform(this.muleContext, event, ScheduleExpressionHolder.class.getDeclaredField("_final_scheduleType").getGenericType(), null, holder.getFinal_schedule()));
            result.setFinal_schedule(_transformedFinal_schedule);
            final String _transformedName = ((String) evaluateAndTransform(this.muleContext, event, ScheduleExpressionHolder.class.getDeclaredField("_nameType").getGenericType(), null, holder.getName()));
            result.setName(_transformedName);
            final Schedule_layers[] _transformedSchedule_layers = ((Schedule_layers[]) evaluateAndTransform(this.muleContext, event, ScheduleExpressionHolder.class.getDeclaredField("_schedule_layersType").getGenericType(), null, holder.getSchedule_layers()));
            result.setSchedule_layers(_transformedSchedule_layers);
            final Overrides_subschedule _transformedOverrides_subschedule = ((Overrides_subschedule) evaluateAndTransform(this.muleContext, event, ScheduleExpressionHolder.class.getDeclaredField("_overrides_subscheduleType").getGenericType(), null, holder.getOverrides_subschedule()));
            result.setOverrides_subschedule(_transformedOverrides_subschedule);
            final String _transformedToday = ((String) evaluateAndTransform(this.muleContext, event, ScheduleExpressionHolder.class.getDeclaredField("_todayType").getGenericType(), null, holder.getToday()));
            result.setToday(_transformedToday);
        } catch (NoSuchFieldException e) {
            throw new TransformerMessagingException(CoreMessages.createStaticMessage("internal error"), event, this, e);
        } catch (TransformerException e) {
            throw new TransformerMessagingException(e.getI18nMessage(), event, this, e);
        }
        return result;
    }

    public MuleEvent process(MuleEvent event) {
        return null;
    }

    public String getMimeType() {
        return null;
    }

    public String getEncoding() {
        return null;
    }

    public MuleContext getMuleContext() {
        return muleContext;
    }

}
