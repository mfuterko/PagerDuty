package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Notification.
 */
public class Notification {
	 
 	/** The status. */
 	private String status;

	    /** The address. */
    	private String address;

	    /** The type. */
    	private String type;

		/**
		 * Gets the status.
		 *
		 * @return the status
		 */
		public String getStatus() {
			return status;
		}

		/**
		 * Sets the status.
		 *
		 * @param status the new status
		 */
		public void setStatus(String status) {
			this.status = status;
		}

		/**
		 * Gets the address.
		 *
		 * @return the address
		 */
		public String getAddress() {
			return address;
		}

		/**
		 * Sets the address.
		 *
		 * @param address the new address
		 */
		public void setAddress(String address) {
			this.address = address;
		}

		/**
		 * Gets the type.
		 *
		 * @return the type
		 */
		public String getType() {
			return type;
		}

		/**
		 * Sets the type.
		 *
		 * @param type the new type
		 */
		public void setType(String type) {
			this.type = type;
		}
}
