
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
import org.mule.modules.pagerduty.bean.IncidentsReassignPutRequest;
import org.mule.modules.pagerduty.bean.holders.IncidentsReassignPutRequestExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class IncidentsReassignPutRequestExpressionHolderTransformer
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
        return (aClass == IncidentsReassignPutRequestExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == IncidentsReassignPutRequestExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {IncidentsReassignPutRequestExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(IncidentsReassignPutRequestExpressionHolder.class)});
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
        return IncidentsReassignPutRequest.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(IncidentsReassignPutRequest.class);
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
        IncidentsReassignPutRequestExpressionHolder holder = ((IncidentsReassignPutRequestExpressionHolder) src);
        IncidentsReassignPutRequest result = new IncidentsReassignPutRequest();
        try {
            final String _transformedRequester_id = ((String) evaluateAndTransform(this.muleContext, event, IncidentsReassignPutRequestExpressionHolder.class.getDeclaredField("_requester_idType").getGenericType(), null, holder.getRequester_id()));
            result.setRequester_id(_transformedRequester_id);
            final String _transformedEscalation_policy = ((String) evaluateAndTransform(this.muleContext, event, IncidentsReassignPutRequestExpressionHolder.class.getDeclaredField("_escalation_policyType").getGenericType(), null, holder.getEscalation_policy()));
            result.setEscalation_policy(_transformedEscalation_policy);
            final Integer _transformedEscalation_level = ((Integer) evaluateAndTransform(this.muleContext, event, IncidentsReassignPutRequestExpressionHolder.class.getDeclaredField("_escalation_levelType").getGenericType(), null, holder.getEscalation_level()));
            result.setEscalation_level(_transformedEscalation_level);
            final String _transformedAssigned_to_user = ((String) evaluateAndTransform(this.muleContext, event, IncidentsReassignPutRequestExpressionHolder.class.getDeclaredField("_assigned_to_userType").getGenericType(), null, holder.getAssigned_to_user()));
            result.setAssigned_to_user(_transformedAssigned_to_user);
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
