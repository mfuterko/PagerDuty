
package org.mule.modules.pagerduty.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/pager-duty</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class PagerDutyNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(PagerDutyNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [pager-duty] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [pager-duty] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new PagerDutyConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-alerts", new GetAlertsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-alerts", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-escalation-policies", new GetEscalationPoliciesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-escalation-policies", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-escalation-policy-by-id", new GetEscalationPolicyByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-escalation-policy-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-escaltion-policy-by-id", new UpdateEscaltionPolicyByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-escaltion-policy-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-escalation-policy-by-id", new DeleteEscalationPolicyByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-escalation-policy-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-escalation-rules-by-id", new GetEscalationRulesByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-escalation-rules-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-escalation-rules-by-id", new PostEscalationRulesByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-escalation-rules-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-escalation-rues-by-id", new PutEscalationRuesByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-escalation-rues-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-esclation-rule-by-policy", new GetEsclationRuleByPolicyDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-esclation-rule-by-policy", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-escalation-rule-by-policy", new DeleteEscalationRuleByPolicyDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-escalation-rule-by-policy", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-on-call", new GetOnCallDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-on-call", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-incidents", new GetIncidentsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-incidents", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-incidents-by-id", new GetIncidentsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-incidents-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-incidents-count", new GetIncidentsCountDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-incidents-count", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-incidents", new PutIncidentsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-incidents", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("resolve-incident", new ResolveIncidentDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("resolve-incident", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("acknowledge-incident", new AcknowledgeIncidentDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("acknowledge-incident", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("reassign-incident", new ReassignIncidentDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("reassign-incident", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("snooze-incident", new SnoozeIncidentDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("snooze-incident", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-incidents-notes-by-id", new GetIncidentsNotesByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-incidents-notes-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-incidents-notes-by-id", new PostIncidentsNotesByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-incidents-notes-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-log-entries", new GetLogEntriesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-log-entries", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-user-log-entries", new GetUserLogEntriesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-user-log-entries", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-incident-log-entries", new GetIncidentLogEntriesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-incident-log-entries", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-log-entries-by-id", new GetLogEntriesByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-log-entries-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-maintenance-windows", new GetMaintenanceWindowsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-maintenance-windows", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-maintenance-windows-by-id", new GetMaintenanceWindowsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-maintenance-windows-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-maintenance-windows", new PostMaintenanceWindowsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-maintenance-windows", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-maintenance-window-by-id", new PutMaintenanceWindowByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-maintenance-window-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-maintenance-window", new DeleteMaintenanceWindowDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-maintenance-window", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-alerts-per-time", new GetAlertsPerTimeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-alerts-per-time", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-incidents-per-time", new GetIncidentsPerTimeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-incidents-per-time", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-schedule-by-id", new GetScheduleByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-schedule-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-list-of-schedules-of-user", new GetListOfSchedulesOfUserDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-list-of-schedules-of-user", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-schedule", new PostScheduleDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-schedule", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-schedule", new PutScheduleDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-schedule", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-preview-schedule", new PostPreviewScheduleDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-preview-schedule", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-schedule", new DeleteScheduleDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-schedule", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-list-entries-of-schedule", new GetListEntriesOfScheduleDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-list-entries-of-schedule", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-schedule-overriddes-by-id", new GetScheduleOverriddesByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-schedule-overriddes-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-schedule-overriddes-by-id", new PostScheduleOverriddesByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-schedule-overriddes-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-services-list", new GetServicesListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-services-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-service-details", new GetServiceDetailsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-service-details", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-service", new PostServiceDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-service", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-service", new PutServiceDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-service", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-service", new DeleteServiceDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-service", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("disable-service", new DisableServiceDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("disable-service", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("enable-service", new EnableServiceDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("enable-service", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-email-filter", new CreateEmailFilterDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-email-filter", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-email-filter", new UpdateEmailFilterDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-email-filter", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-email-filter", new DeleteEmailFilterDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-email-filter", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-users", new GetUsersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-users", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-user-details", new GetUserDetailsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-user-details", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-user-details-on-call", new GetUserDetailsOnCallDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-user-details-on-call", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-user", new CreateUserDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-user", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-user", new UpdateUserDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-user", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-user", new DeleteUserDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-user", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-user-contact-methods", new GetUserContactMethodsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-user-contact-methods", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-contact-method-details", new GetContactMethodDetailsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-contact-method-details", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-contact-method", new CreateContactMethodDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-contact-method", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-contact-method", new UpdateContactMethodDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-contact-method", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-contact-method", new DeleteContactMethodDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-contact-method", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-nofication-rules", new GetNoficationRulesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-nofication-rules", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-notification-rule-details", new GetNotificationRuleDetailsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-notification-rule-details", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-notification-rules", new CreateNotificationRulesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-notification-rules", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-notification-rule", new UpdateNotificationRuleDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-notification-rule", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-notification-rule", new DeleteNotificationRuleDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-notification-rule", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-users-on-call", new GetUsersOnCallDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-users-on-call", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-teams", new GetTeamsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-teams", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-team", new CreateTeamDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-team", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-team-information", new GetTeamInformationDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-team-information", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-team", new UpdateTeamDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-team", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-team", new DeleteTeamDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-team", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("add-entity", new AddEntityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("add-entity", "@Processor", ex);
        }
    }

}
