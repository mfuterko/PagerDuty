/**
 * Copyright � 1992-2016 Cisco, Inc.
 */

package org.mule.modules.pagerduty.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.mule.api.annotations.rest.RestHeaderParam;

// TODO: Auto-generated Javadoc
/**
 * The Class ConnectorConfig.
 */
@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

  /** The url. */
  @Configurable
	@Optional
	@Default("https://eidiko.pagerduty.com/api/v1")
	private String url = "https://eidiko.pagerduty.com/api/v1";

  /** The authorization. */
  @Configurable
	@Optional
	@RestHeaderParam("Authorization")
	private String authorization = "Token token=R75KMmhVMdJy3zyi12tV";

  /**
   * Gets the url.
   *
   * @return the url
   */
  public String getUrl() {
		return url;
	}

  /**
   * Sets the url.
   *
   * @param url the new url
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Gets the authorization.
   *
   * @return the authorization
   */
  public String getAuthorization() {
    return authorization;
  }

  /**
   * Sets the authorization.
   *
   * @param authorization the new authorization
   */
  public void setAuthorization(String authorization) {
    this.authorization = authorization;
  }

}
