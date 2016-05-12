
package org.mule.modules.pagerduty.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.pagerduty.bean.holders.Final_scheduleExpressionHolder;
import org.mule.modules.pagerduty.bean.holders.Overrides_subscheduleExpressionHolder;
import org.mule.modules.pagerduty.bean.holders.ScheduleExpressionHolder;
import org.mule.modules.pagerduty.bean.holders.SchedulesPutRequestExpressionHolder;
import org.mule.modules.pagerduty.processors.PutScheduleMessageProcessor;
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
public class PutScheduleDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(PutScheduleDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(PutScheduleMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [put-schedule] within the connector [pager-duty] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [put-schedule] within the connector [pager-duty] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("putSchedule");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [put-schedule] within the connector [pager-duty] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "id", "id");
        if (!parseObjectRefWithDefault(element, builder, "request", "request", "#[payload]")) {
            BeanDefinitionBuilder requestBuilder = BeanDefinitionBuilder.rootBeanDefinition(SchedulesPutRequestExpressionHolder.class.getName());
            Element requestChildElement = DomUtils.getChildElementByTagName(element, "request");
            if (requestChildElement!= null) {
                parseProperty(requestBuilder, requestChildElement, "overflow", "overflow");
                if (!parseObjectRef(requestChildElement, requestBuilder, "schedule", "schedule")) {
                    BeanDefinitionBuilder _scheduleBuilder = BeanDefinitionBuilder.rootBeanDefinition(ScheduleExpressionHolder.class.getName());
                    Element _scheduleChildElement = DomUtils.getChildElementByTagName(requestChildElement, "schedule");
                    if (_scheduleChildElement!= null) {
                        parseProperty(_scheduleBuilder, _scheduleChildElement, "id", "id");
                        parseProperty(_scheduleBuilder, _scheduleChildElement, "time_zone", "time_zone");
                        if (hasAttribute(_scheduleChildElement, "escalation_policies-ref")) {
                            if (_scheduleChildElement.getAttribute("escalation_policies-ref").startsWith("#")) {
                                _scheduleBuilder.addPropertyValue("escalation_policies", _scheduleChildElement.getAttribute("escalation_policies-ref"));
                            } else {
                                _scheduleBuilder.addPropertyValue("escalation_policies", (("#[registry:"+ _scheduleChildElement.getAttribute("escalation_policies-ref"))+"]"));
                            }
                        }
                        if (!parseObjectRef(_scheduleChildElement, _scheduleBuilder, "final_schedule", "final_schedule")) {
                            BeanDefinitionBuilder __final_scheduleBuilder = BeanDefinitionBuilder.rootBeanDefinition(Final_scheduleExpressionHolder.class.getName());
                            Element __final_scheduleChildElement = DomUtils.getChildElementByTagName(_scheduleChildElement, "final_schedule");
                            if (__final_scheduleChildElement!= null) {
                                parseProperty(__final_scheduleBuilder, __final_scheduleChildElement, "rendered_coverage_percentage", "rendered_coverage_percentage");
                                parseProperty(__final_scheduleBuilder, __final_scheduleChildElement, "name", "name");
                                if (hasAttribute(__final_scheduleChildElement, "rendered_schedule_entries-ref")) {
                                    if (__final_scheduleChildElement.getAttribute("rendered_schedule_entries-ref").startsWith("#")) {
                                        __final_scheduleBuilder.addPropertyValue("rendered_schedule_entries", __final_scheduleChildElement.getAttribute("rendered_schedule_entries-ref"));
                                    } else {
                                        __final_scheduleBuilder.addPropertyValue("rendered_schedule_entries", (("#[registry:"+ __final_scheduleChildElement.getAttribute("rendered_schedule_entries-ref"))+"]"));
                                    }
                                }
                                _scheduleBuilder.addPropertyValue("final_schedule", __final_scheduleBuilder.getBeanDefinition());
                            }
                        }
                        parseProperty(_scheduleBuilder, _scheduleChildElement, "name", "name");
                        if (hasAttribute(_scheduleChildElement, "schedule_layers-ref")) {
                            if (_scheduleChildElement.getAttribute("schedule_layers-ref").startsWith("#")) {
                                _scheduleBuilder.addPropertyValue("schedule_layers", _scheduleChildElement.getAttribute("schedule_layers-ref"));
                            } else {
                                _scheduleBuilder.addPropertyValue("schedule_layers", (("#[registry:"+ _scheduleChildElement.getAttribute("schedule_layers-ref"))+"]"));
                            }
                        }
                        if (!parseObjectRef(_scheduleChildElement, _scheduleBuilder, "overrides_subschedule", "overrides_subschedule")) {
                            BeanDefinitionBuilder __overrides_subscheduleBuilder = BeanDefinitionBuilder.rootBeanDefinition(Overrides_subscheduleExpressionHolder.class.getName());
                            Element __overrides_subscheduleChildElement = DomUtils.getChildElementByTagName(_scheduleChildElement, "overrides_subschedule");
                            if (__overrides_subscheduleChildElement!= null) {
                                parseProperty(__overrides_subscheduleBuilder, __overrides_subscheduleChildElement, "name", "name");
                                if (hasAttribute(__overrides_subscheduleChildElement, "rendered_schedule_entries-ref")) {
                                    if (__overrides_subscheduleChildElement.getAttribute("rendered_schedule_entries-ref").startsWith("#")) {
                                        __overrides_subscheduleBuilder.addPropertyValue("rendered_schedule_entries", __overrides_subscheduleChildElement.getAttribute("rendered_schedule_entries-ref"));
                                    } else {
                                        __overrides_subscheduleBuilder.addPropertyValue("rendered_schedule_entries", (("#[registry:"+ __overrides_subscheduleChildElement.getAttribute("rendered_schedule_entries-ref"))+"]"));
                                    }
                                }
                                _scheduleBuilder.addPropertyValue("overrides_subschedule", __overrides_subscheduleBuilder.getBeanDefinition());
                            }
                        }
                        parseProperty(_scheduleBuilder, _scheduleChildElement, "today", "today");
                        requestBuilder.addPropertyValue("schedule", _scheduleBuilder.getBeanDefinition());
                    }
                }
                builder.addPropertyValue("request", requestBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
