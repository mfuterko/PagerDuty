/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EscalationPoliciesGetResponse extends StatusResponse {
	private String total;

    private String limit;

    private Escalation_policies[] escalation_policies;

    private String offset;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getLimit ()
    {
        return limit;
    }

    public void setLimit (String limit)
    {
        this.limit = limit;
    }

    public Escalation_policies[] getEscalation_policies ()
    {
        return escalation_policies;
    }

    public void setEscalation_policies (Escalation_policies[] escalation_policies)
    {
        this.escalation_policies = escalation_policies;
    }

    public String getOffset ()
    {
        return offset;
    }

    public void setOffset (String offset)
    {
        this.offset = offset;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", limit = "+limit+", escalation_policies = "+escalation_policies+", offset = "+offset+"]";
    }

}
