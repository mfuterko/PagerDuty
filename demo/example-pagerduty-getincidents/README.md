## PagerDuty Anypoint™ Connector


[PagerDuty Connector to connect to PagerDuty]

## Author
: 
Eidiko Systems Integrators.

## Supported Mule runtime versions
:
Mule 3.7.0

## PagerDuty supported versions
:
PagerDuty Version 1.0 and above.

## Service or application supported modules
Example: PagerDuty 

## Running the Demo

The Demo is used to get all the incidents in PagerDuty. The PagerDuty connector gets all incidents for the user whose authorization token is used to connect to it.

To get the incidents, in connector properties select 'Get incidents' operation. 

To run the demo open a browser and type http://localhost:8081/. It will trigger the flow. And you will see the below reply in the browser

{
    "incidents": [
        {
            "id": "PRZPTLB",
            "incident_number": 1,
            "created_on": "2016-09-06T12:26:36Z",
            "status": "triggered",
            "pending_actions": [
                {
                    "type": "resolve",
                    "at": "2016-09-06T16:26:36Z"
                }
            ],
            "html_url": "https://mysite145.pagerduty.com/incidents/PRZPTLB",
            "incident_key": "a7488906a96a4d43887d20fe2fe21694",
            "service": {
                "id": "P5PY7V2",
                "name": "Test Service",
                "html_url": "https://mysite145.pagerduty.com/services/P5PY7V2",
                "deleted_at": null,
                "description": ""
            },
            "escalation_policy": {
                "id": "P9UR6YX",
                "name": "Default",
                "deleted_at": null
            },
            "assigned_to_user": {
                "id": "P8SDL04",
                "name": "vikas",
                "email": "testcopy.vikash@gmail.com",
                "html_url": "https://mysite145.pagerduty.com/users/P8SDL04"
            },
            "trigger_summary_data": {
                "subject": "Issues in JIRA"
            },
            "trigger_details_html_url": "https://mysite145.pagerduty.com/incidents/PRZPTLB/log_entries/Q0VI8MD0YLX203",
            "trigger_type": "web_trigger",
            "last_status_change_on": "2016-09-06T12:26:37Z",
            "last_status_change_by": null,
            "number_of_escalations": 0,
            "assigned_to": [
                {
                    "at": "2016-09-06T12:26:36Z",
                    "object": {
                        "id": "P8SDL04",
                        "name": "vikas",
                        "email": "testcopy.vikash@gmail.com",
                        "html_url": "https://mysite145.pagerduty.com/users/P8SDL04",
                        "type": "user"
                    }
                }
            ],
            "urgency": "high"
        }
    ],
    "limit": 100,
    "offset": 0,
    "total": 1
}
