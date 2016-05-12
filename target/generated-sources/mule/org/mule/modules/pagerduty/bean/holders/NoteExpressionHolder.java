
package org.mule.modules.pagerduty.bean.holders;

import javax.annotation.Generated;
import org.mule.modules.pagerduty.bean.User;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class NoteExpressionHolder {

    protected Object content;
    protected String _contentType;
    protected Object id;
    protected String _idType;
    protected Object created_at;
    protected String _created_atType;
    protected Object user;
    protected User _userType;

    /**
     * Sets content
     * 
     * @param value Value to set
     */
    public void setContent(Object value) {
        this.content = value;
    }

    /**
     * Retrieves content
     * 
     */
    public Object getContent() {
        return this.content;
    }

    /**
     * Sets id
     * 
     * @param value Value to set
     */
    public void setId(Object value) {
        this.id = value;
    }

    /**
     * Retrieves id
     * 
     */
    public Object getId() {
        return this.id;
    }

    /**
     * Sets created_at
     * 
     * @param value Value to set
     */
    public void setCreated_at(Object value) {
        this.created_at = value;
    }

    /**
     * Retrieves created_at
     * 
     */
    public Object getCreated_at() {
        return this.created_at;
    }

    /**
     * Sets user
     * 
     * @param value Value to set
     */
    public void setUser(Object value) {
        this.user = value;
    }

    /**
     * Retrieves user
     * 
     */
    public Object getUser() {
        return this.user;
    }

}
