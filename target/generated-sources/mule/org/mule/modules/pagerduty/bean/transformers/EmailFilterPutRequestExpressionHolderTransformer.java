
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
import org.mule.modules.pagerduty.bean.EmailFilterPutRequest;
import org.mule.modules.pagerduty.bean.holders.EmailFilterPutRequestExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class EmailFilterPutRequestExpressionHolderTransformer
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
        return (aClass == EmailFilterPutRequestExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == EmailFilterPutRequestExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {EmailFilterPutRequestExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(EmailFilterPutRequestExpressionHolder.class)});
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
        return EmailFilterPutRequest.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(EmailFilterPutRequest.class);
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
        EmailFilterPutRequestExpressionHolder holder = ((EmailFilterPutRequestExpressionHolder) src);
        EmailFilterPutRequest result = new EmailFilterPutRequest();
        try {
            final String _transformedSubjectMode = ((String) evaluateAndTransform(this.muleContext, event, EmailFilterPutRequestExpressionHolder.class.getDeclaredField("_subjectModeType").getGenericType(), null, holder.getSubjectMode()));
            result.setSubjectMode(_transformedSubjectMode);
            final String _transformedSubjectRegex = ((String) evaluateAndTransform(this.muleContext, event, EmailFilterPutRequestExpressionHolder.class.getDeclaredField("_subjectRegexType").getGenericType(), null, holder.getSubjectRegex()));
            result.setSubjectRegex(_transformedSubjectRegex);
            final String _transformedBodyMode = ((String) evaluateAndTransform(this.muleContext, event, EmailFilterPutRequestExpressionHolder.class.getDeclaredField("_bodyModeType").getGenericType(), null, holder.getBodyMode()));
            result.setBodyMode(_transformedBodyMode);
            final String _transformedBodyRegex = ((String) evaluateAndTransform(this.muleContext, event, EmailFilterPutRequestExpressionHolder.class.getDeclaredField("_bodyRegexType").getGenericType(), null, holder.getBodyRegex()));
            result.setBodyRegex(_transformedBodyRegex);
            final String _transformedFromEmailMode = ((String) evaluateAndTransform(this.muleContext, event, EmailFilterPutRequestExpressionHolder.class.getDeclaredField("_fromEmailModeType").getGenericType(), null, holder.getFromEmailMode()));
            result.setFromEmailMode(_transformedFromEmailMode);
            final String _transformedFromEmailRegex = ((String) evaluateAndTransform(this.muleContext, event, EmailFilterPutRequestExpressionHolder.class.getDeclaredField("_fromEmailRegexType").getGenericType(), null, holder.getFromEmailRegex()));
            result.setFromEmailRegex(_transformedFromEmailRegex);
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
