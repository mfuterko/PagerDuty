
package org.mule.modules.pagerduty.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>PagerDutyConnectorProcessAdapter</code> is a wrapper around {@link PagerDutyConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class PagerDutyConnectorProcessAdapter
    extends PagerDutyConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<PagerDutyConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, PagerDutyConnectorCapabilitiesAdapter> getProcessTemplate() {
        final PagerDutyConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,PagerDutyConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, PagerDutyConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, PagerDutyConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
