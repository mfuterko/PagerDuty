
package org.mule.modules.pagerduty.bean.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class ContactMethodPutRequestExpressionHolder {

    protected Object address;
    protected String _addressType;
    protected Object countryDate;
    protected int _countryDateType;
    protected Object label;
    protected String _labelType;
    protected Object sendShortEmail;
    protected boolean _sendShortEmailType;

    /**
     * Sets address
     * 
     * @param value Value to set
     */
    public void setAddress(Object value) {
        this.address = value;
    }

    /**
     * Retrieves address
     * 
     */
    public Object getAddress() {
        return this.address;
    }

    /**
     * Sets countryDate
     * 
     * @param value Value to set
     */
    public void setCountryDate(Object value) {
        this.countryDate = value;
    }

    /**
     * Retrieves countryDate
     * 
     */
    public Object getCountryDate() {
        return this.countryDate;
    }

    /**
     * Sets label
     * 
     * @param value Value to set
     */
    public void setLabel(Object value) {
        this.label = value;
    }

    /**
     * Retrieves label
     * 
     */
    public Object getLabel() {
        return this.label;
    }

    /**
     * Sets sendShortEmail
     * 
     * @param value Value to set
     */
    public void setSendShortEmail(Object value) {
        this.sendShortEmail = value;
    }

    /**
     * Retrieves sendShortEmail
     * 
     */
    public Object getSendShortEmail() {
        return this.sendShortEmail;
    }

}
