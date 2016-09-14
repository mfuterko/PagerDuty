/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.testrunners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.functional.AddEntityTestCases;
import org.mule.modules.pagerduty.automation.functional.FetchMetaDataKeyTestCases;
import org.mule.modules.pagerduty.automation.functional.FetchMetaDataTestCases;
import org.mule.modules.pagerduty.automation.functional.GetIncidentsByIdTestCases;
import org.mule.modules.pagerduty.automation.functional.GetIncidentsTestCases;
import org.mule.modules.pagerduty.automation.functional.GetLogEntriesTestCases;
import org.mule.modules.pagerduty.automation.functional.GetServiceDetailsByIdTestCase;
import org.mule.modules.pagerduty.automation.functional.GetServicesTestCases;
import org.mule.modules.pagerduty.automation.functional.GetUserDetailsTestCases;
import org.mule.modules.pagerduty.automation.functional.GetUsersTestCases;
import org.mule.modules.pagerduty.automation.functional.PostServiceTestCases;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

//@RunWith(Categories.class)
//@IncludeCategory(RegressionTests.class)
//
//@SuiteClasses({
//	GreetTestCases.class
//	,AddEntityTestCases.class
//	
//})

@RunWith(Suite.class)
@SuiteClasses({ AddEntityTestCases.class,
	GetIncidentsByIdTestCases.class,
	GetIncidentsTestCases.class,
	GetLogEntriesTestCases.class,
	GetServiceDetailsByIdTestCase.class,
	GetServicesTestCases.class,
	GetUserDetailsTestCases.class,
	GetUsersTestCases.class,FetchMetaDataKeyTestCases.class,FetchMetaDataTestCases.class,
	PostServiceTestCases.class})

public class FunctionalTestSuite {
	
	@BeforeClass
	public static void initialiseSuite() {

		ConnectorTestContext.initialize(PagerDutyConnector.class);

	}

	@AfterClass
	public static void shutdownSuite() {

		ConnectorTestContext.shutDown();

	}
	
}