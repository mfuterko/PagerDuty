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
import org.mule.modules.pagerduty.automation.functional.CreateEmailFilterTestCases;
import org.mule.modules.pagerduty.automation.functional.CreateNotificationRulesTestCases;
import org.mule.modules.pagerduty.automation.functional.CreateTeamTestCases;
import org.mule.modules.pagerduty.automation.functional.DeleteTeamTestCases;
import org.mule.modules.pagerduty.automation.functional.GetAlertsPerTimeTestCases;
import org.mule.modules.pagerduty.automation.functional.GetEscalationPoliciesTestCases;
import org.mule.modules.pagerduty.automation.functional.GetIncidentsByIdTestCases;
import org.mule.modules.pagerduty.automation.functional.GetLogEntriesTestCases;
import org.mule.modules.pagerduty.automation.functional.GetServicesTestCases;
import org.mule.modules.pagerduty.automation.functional.GetTeamsTestCases;
import org.mule.modules.pagerduty.automation.functional.PostServiceTestCases;
import org.mule.modules.pagerduty.automation.functional.UpdateServiceByIdTestCases;
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
@SuiteClasses({ GetTeamsTestCases.class, GetServicesTestCases.class, CreateEmailFilterTestCases.class, CreateNotificationRulesTestCases.class,CreateTeamTestCases.class, GetAlertsPerTimeTestCases.class, DeleteTeamTestCases.class, PostServiceTestCases.class, UpdateServiceByIdTestCases.class,GetEscalationPoliciesTestCases.class, GetIncidentsByIdTestCases.class, GetLogEntriesTestCases.class})

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