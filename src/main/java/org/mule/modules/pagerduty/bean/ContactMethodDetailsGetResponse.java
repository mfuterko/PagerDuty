package org.mule.modules.pagerduty.bean;

public class ContactMethodDetailsGetResponse extends StatusResponse {
	
	

	/*
     * This contact_method : For contact_method 
     */
	private Contact_method contact_method;

	
	/*
     * TO get the Contact_method
     */
    public Contact_method getContact_method ()
    {
        return contact_method;
    }

    
    /*
     * TO set the Contact_method
     */
    public void setContact_method (Contact_method contact_method)
    {
        this.contact_method = contact_method;
    }

    
    
    /*
     * This Is Override For Abstract Method String
     */
    @Override
    public String toString()
    {
        return "ClassPojo [contact_method = "+contact_method+"]";
    }

}
