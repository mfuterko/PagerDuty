
package org.mule.modules.pagerduty.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.pagerduty.bean.holders.NoteExpressionHolder;
import org.mule.modules.pagerduty.bean.holders.UserExpressionHolder;
import org.mule.modules.pagerduty.processors.PostIncidentsNotesByIdMessageProcessor;
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
public class PostIncidentsNotesByIdDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(PostIncidentsNotesByIdDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(PostIncidentsNotesByIdMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [post-incidents-notes-by-id] within the connector [pager-duty] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [post-incidents-notes-by-id] within the connector [pager-duty] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("postIncidentsNotesById");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [post-incidents-notes-by-id] within the connector [pager-duty] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "id", "id");
        if (!parseObjectRef(element, builder, "notes", "notes")) {
            BeanDefinitionBuilder notesBuilder = BeanDefinitionBuilder.rootBeanDefinition(NoteExpressionHolder.class.getName());
            Element notesChildElement = DomUtils.getChildElementByTagName(element, "notes");
            if (notesChildElement!= null) {
                parseProperty(notesBuilder, notesChildElement, "content", "content");
                parseProperty(notesBuilder, notesChildElement, "id", "id");
                parseProperty(notesBuilder, notesChildElement, "created_at", "created_at");
                if (!parseObjectRef(notesChildElement, notesBuilder, "user", "user")) {
                    BeanDefinitionBuilder _userBuilder = BeanDefinitionBuilder.rootBeanDefinition(UserExpressionHolder.class.getName());
                    Element _userChildElement = DomUtils.getChildElementByTagName(notesChildElement, "user");
                    if (_userChildElement!= null) {
                        parseProperty(_userBuilder, _userChildElement, "member_order", "member_order");
                        notesBuilder.addPropertyValue("user", _userBuilder.getBeanDefinition());
                    }
                }
                builder.addPropertyValue("notes", notesBuilder.getBeanDefinition());
            }
        }
        parseProperty(builder, element, "registerId", "registerId");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
