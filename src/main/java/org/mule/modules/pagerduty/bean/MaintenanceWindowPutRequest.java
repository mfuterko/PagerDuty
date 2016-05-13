package org.mule.modules.pagerduty.bean;



public class MaintenanceWindowPutRequest {
	
	private String start_time;
	
	private String end_time;
	
	private String description;
	
	private String service_ids;
	
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getService_ids() {
		return service_ids;
	}
	public void setService_ids(String service_ids) {
		this.service_ids = service_ids;
	}
	
}
