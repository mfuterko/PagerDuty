package org.mule.modules.pagerduty.bean;

public class Contact_method {
	
	private String id;

    private String phone_number;

    private String address;

    private String user_id;

    private String label;

    private String type;

    private String blacklisted;

    private String country_code;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getPhone_number ()
    {
        return phone_number;
    }

    public void setPhone_number (String phone_number)
    {
        this.phone_number = phone_number;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getUser_id ()
    {
        return user_id;
    }

    public void setUser_id (String user_id)
    {
        this.user_id = user_id;
    }

    public String getLabel ()
    {
        return label;
    }

    public void setLabel (String label)
    {
        this.label = label;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getBlacklisted ()
    {
        return blacklisted;
    }

    public void setBlacklisted (String blacklisted)
    {
        this.blacklisted = blacklisted;
    }

    public String getCountry_code ()
    {
        return country_code;
    }

    public void setCountry_code (String country_code)
    {
        this.country_code = country_code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", phone_number = "+phone_number+", address = "+address+", user_id = "+user_id+", label = "+label+", type = "+type+", blacklisted = "+blacklisted+", country_code = "+country_code+"]";
    }

}
