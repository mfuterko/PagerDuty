package org.mule.modules.pagerduty.bean;

public class UsersListByScheduleGetResponse extends StatusResponse {
	
	private Users[] users;

    public Users[] getUsers ()
    {
        return users;
    }

    public void setUsers (Users[] users)
    {
        this.users = users;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [users = "+users+"]";
    }

}
