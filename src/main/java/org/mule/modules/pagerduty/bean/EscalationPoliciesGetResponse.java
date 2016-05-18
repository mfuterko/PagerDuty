/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class EscalationPoliciesGetResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EscalationPoliciesGetResponse extends StatusResponse {
	
	/** The total. */
	private String total;

    /** The limit. */
    private String limit;

    /** The escalation_policies. */
    private Escalation_policies[] escalation_policies;

    /** The offset. */
    private String offset;

    /**
     * Gets the total.
     *
     * @return the total
     */
    public String getTotal ()
    {
        return total;
    }

    /**
     * Sets the total.
     *
     * @param total the new total
     */
    public void setTotal (String total)
    {
        this.total = total;
    }

    /**
     * Gets the limit.
     *
     * @return the limit
     */
    public String getLimit ()
    {
        return limit;
    }

    /**
     * Sets the limit.
     *
     * @param limit the new limit
     */
    public void setLimit (String limit)
    {
        this.limit = limit;
    }

    /**
     * Gets the escalation_policies.
     *
     * @return the escalation_policies
     */
    public Escalation_policies[] getEscalation_policies ()
    {
        return escalation_policies;
    }

    /**
     * Sets the escalation_policies.
     *
     * @param escalation_policies the new escalation_policies
     */
    public void setEscalation_policies (Escalation_policies[] escalation_policies)
    {
        this.escalation_policies = escalation_policies;
    }

    /**
     * Gets the offset.
     *
     * @return the offset
     */
    public String getOffset ()
    {
        return offset;
    }

    /**
     * Sets the offset.
     *
     * @param offset the new offset
     */
    public void setOffset (String offset)
    {
        this.offset = offset;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", limit = "+limit+", escalation_policies = "+escalation_policies+", offset = "+offset+"]";
    }

}
