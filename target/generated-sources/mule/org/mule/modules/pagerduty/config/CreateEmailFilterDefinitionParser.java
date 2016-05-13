
package org.mule.modules.pagerduty.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.pagerduty.bean.holders.EmailFilterPostRequestExpressionHolder;
import org.mule.modules.pagerduty.processors.CreateEmailFilterMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class CreateEmailFilterDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(CreateEmailFilterDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(CreateEmailFilterMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [create-email-filter] within the connector [pager-duty] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [create-email-filter] within the connector [pager-duty] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("createEmailFilter");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [create-email-filter] within the connector [pager-duty] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "serviceId", "serviceId");
        if (!parseObjectRef(element, builder, "request", "request")) {
            BeanDefinitionBuilder requestBuilder = BeanDefinitionBuilder.rootBeanDefinition(EmailFilterPostRequestExpressionHolder.class.getName());
            Element requestChildElement = DomUtils.getChildElementByTagName(element, "request");
            if (requestChildElement!= null) {
                parseProperty(requestBuilder, requestChildElement, "subjectMode", "subjectMode");
                parseProperty(requestBuilder, requestChildElement, "subjectRegex", "subjectRegex");
                parseProperty(requestBuilder, requestChildElement, "bodyMode", "bodyMode");
                parseProperty(requestBuilder, requestChildElement, "bodyRegex", "bodyRegex");
                parseProperty(requestBuilder, requestChildElement, "fromEmailMode", "fromEmailMode");
                parseProperty(requestBuilder, requestChildElement, "fromEmailRegex", "fromEmailRegex");
                builder.addPropertyValue("request", requestBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}