
package org.mule.modules.pagerduty.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.pagerduty.bean.holders.EscalationRulesByIdPutRequestExpressionHolder;
import org.mule.modules.pagerduty.bean.holders.Escalation_rulesExpressionHolder;
import org.mule.modules.pagerduty.bean.holders.Rule_objectExpressionHolder;
import org.mule.modules.pagerduty.processors.PutEscalationRuesByIdMessageProcessor;
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
public class PutEscalationRuesByIdDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(PutEscalationRuesByIdDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(PutEscalationRuesByIdMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [put-escalation-rues-by-id] within the connector [pager-duty] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [put-escalation-rues-by-id] within the connector [pager-duty] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("putEscalationRuesById");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [put-escalation-rues-by-id] within the connector [pager-duty] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "escalationPolicyId", "escalationPolicyId");
        parseProperty(builder, element, "escalationRuleId", "escalationRuleId");
        if (!parseObjectRefWithDefault(element, builder, "escalation-rules-by-id-put-request", "escalationRulesByIdPutRequest", "#[payload]")) {
            BeanDefinitionBuilder escalationRulesByIdPutRequestBuilder = BeanDefinitionBuilder.rootBeanDefinition(EscalationRulesByIdPutRequestExpressionHolder.class.getName());
            Element escalationRulesByIdPutRequestChildElement = DomUtils.getChildElementByTagName(element, "escalation-rules-by-id-put-request");
            if (escalationRulesByIdPutRequestChildElement!= null) {
                if (!parseObjectRef(escalationRulesByIdPutRequestChildElement, escalationRulesByIdPutRequestBuilder, "escalation_rules", "escalation_rules")) {
                    BeanDefinitionBuilder _escalation_rulesBuilder = BeanDefinitionBuilder.rootBeanDefinition(Escalation_rulesExpressionHolder.class.getName());
                    Element _escalation_rulesChildElement = DomUtils.getChildElementByTagName(escalationRulesByIdPutRequestChildElement, "escalation_rules");
                    if (_escalation_rulesChildElement!= null) {
                        parseProperty(_escalation_rulesBuilder, _escalation_rulesChildElement, "id", "id");
                        parseProperty(_escalation_rulesBuilder, _escalation_rulesChildElement, "escalation_delay_in_minutes", "escalation_delay_in_minutes");
                        if (!parseObjectRef(_escalation_rulesChildElement, _escalation_rulesBuilder, "rule_object", "rule_object")) {
                            BeanDefinitionBuilder __rule_objectBuilder = BeanDefinitionBuilder.rootBeanDefinition(Rule_objectExpressionHolder.class.getName());
                            Element __rule_objectChildElement = DomUtils.getChildElementByTagName(_escalation_rulesChildElement, "rule_object");
                            if (__rule_objectChildElement!= null) {
                                parseProperty(__rule_objectBuilder, __rule_objectChildElement, "id", "id");
                                parseProperty(__rule_objectBuilder, __rule_objectChildElement, "time_zone", "time_zone");
                                parseProperty(__rule_objectBuilder, __rule_objectChildElement, "color", "color");
                                parseProperty(__rule_objectBuilder, __rule_objectChildElement, "email", "email");
                                parseProperty(__rule_objectBuilder, __rule_objectChildElement, "name", "name");
                                parseProperty(__rule_objectBuilder, __rule_objectChildElement, "type", "type");
                                _escalation_rulesBuilder.addPropertyValue("rule_object", __rule_objectBuilder.getBeanDefinition());
                            }
                        }
                        if (hasAttribute(_escalation_rulesChildElement, "targets-ref")) {
                            if (_escalation_rulesChildElement.getAttribute("targets-ref").startsWith("#")) {
                                _escalation_rulesBuilder.addPropertyValue("targets", _escalation_rulesChildElement.getAttribute("targets-ref"));
                            } else {
                                _escalation_rulesBuilder.addPropertyValue("targets", (("#[registry:"+ _escalation_rulesChildElement.getAttribute("targets-ref"))+"]"));
                            }
                        }
                        escalationRulesByIdPutRequestBuilder.addPropertyValue("escalation_rules", _escalation_rulesBuilder.getBeanDefinition());
                    }
                }
                builder.addPropertyValue("escalationRulesByIdPutRequest", escalationRulesByIdPutRequestBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
