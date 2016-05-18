/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Contexts.
 */
public class Contexts {
	
	/** The type. */
	private String type;

    /** The href. */
    private String href;

    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType ()
    {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType (String type)
    {
        this.type = type;
    }

    /**
     * Gets the href.
     *
     * @return the href
     */
    public String getHref ()
    {
        return href;
    }

    /**
     * Sets the href.
     *
     * @param href the new href
     */
    public void setHref (String href)
    {
        this.href = href;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [type = "+type+", href = "+href+"]";
    }

}
