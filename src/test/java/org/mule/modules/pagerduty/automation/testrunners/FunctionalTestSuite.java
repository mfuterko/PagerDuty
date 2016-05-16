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
import org.mule.modules.pagerduty.automation.functional.CreateContactMethodTestCases;
import org.mule.modules.pagerduty.automation.functional.CreateEmailFilterTestCases;
import org.mule.modules.pagerduty.automation.functional.CreateNotificationRulesTestCases;
import org.mule.modules.pagerduty.automation.functional.CreateTeamTestCases;
import org.mule.modules.pagerduty.automation.functional.CreateUserTestCases;
import org.mule.modules.pagerduty.automation.functional.DeleteContactMethodTestCases;
import org.mule.modules.pagerduty.automation.functional.DeleteEmailFilterTestCases;
import org.mule.modules.pagerduty.automation.functional.DeleteEscalationPolicyByIdTestCases;
import org.mule.modules.pagerduty.automation.functional.DeleteEscalationRuleByPolicyTestCases;
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
@SuiteClasses({ AddEntityTestCases.class, CreateContactMethodTestCases.class,CreateEmailFilterTestCases.class,
	CreateNotificationRulesTestCases.class,CreateTeamTestCases.class,CreateUserTestCases.class,
	DeleteContactMethodTestCases.class,DeleteEmailFilterTestCases.class,DeleteEscalationPolicyByIdTestCases.class,
	DeleteEscalationRuleByPolicyTestCases.class})

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