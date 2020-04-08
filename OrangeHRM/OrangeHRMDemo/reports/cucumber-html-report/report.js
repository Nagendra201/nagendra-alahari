$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/OrangeHRMdemo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "OrangeHRM Website",
  "description": "",
  "id": "orangehrm-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@OrangeHRM"
    }
  ]
});
formatter.scenarioOutline({
  "line": 47,
  "name": "TC01_03Login in the OrangeHRM Website",
  "description": "",
  "id": "orangehrm-website;tc01-03login-in-the-orangehrm-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 46,
      "name": "@TC01_03"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "TC01_03the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "TC01_03the user open the OrangeHRM Home page",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "TC01_03the user login using \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "TC01_03click on the login button user nagivate to the next page",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "TC01_03Using actions move to leave types from leaves then move to next page",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "TC01_03click on Add",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "TC01_03wrote the leave type",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "TC01_03click on save the user moves to next page",
  "keyword": "Then "
});
formatter.examples({
  "line": 56,
  "name": "",
  "description": "",
  "id": "orangehrm-website;tc01-03login-in-the-orangehrm-website;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "status"
      ],
      "line": 57,
      "id": "orangehrm-website;tc01-03login-in-the-orangehrm-website;;1"
    },
    {
      "cells": [
        "name1",
        "5",
        "success"
      ],
      "line": 58,
      "id": "orangehrm-website;tc01-03login-in-the-orangehrm-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 58,
  "name": "TC01_03Login in the OrangeHRM Website",
  "description": "",
  "id": "orangehrm-website;tc01-03login-in-the-orangehrm-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 46,
      "name": "@TC01_03"
    },
    {
      "line": 19,
      "name": "@OrangeHRM"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "TC01_03the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "TC01_03the user open the OrangeHRM Home page",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "TC01_03the user login using name1 and 5",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "TC01_03click on the login button user nagivate to the next page",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "TC01_03Using actions move to leave types from leaves then move to next page",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "TC01_03click on Add",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "TC01_03wrote the leave type",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "TC01_03click on save the user moves to next page",
  "keyword": "Then "
});
formatter.match({
  "location": "SDLeavesPage.tc0103the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 20224249400,
  "status": "passed"
});
formatter.match({
  "location": "SDLeavesPage.tc0103the_user_open_the_orangehrm_home_page()"
});
formatter.result({
  "duration": 815641300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name1",
      "offset": 28
    },
    {
      "val": "5",
      "offset": 38
    }
  ],
  "location": "SDLeavesPage.tc0103the_user_login_using_and(String,String)"
});
formatter.result({
  "duration": 4104474700,
  "status": "passed"
});
formatter.match({
  "location": "SDLeavesPage.tc0103click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 5996228600,
  "status": "passed"
});
formatter.match({
  "location": "SDLeavesPage.tc0103using_actions_move_to_leave_types_from_leaves_then_move_to_next_page()"
});
formatter.result({
  "duration": 2405241400,
  "status": "passed"
});
formatter.match({
  "location": "SDLeavesPage.tc0103click_on_add()"
});
formatter.result({
  "duration": 1402999600,
  "status": "passed"
});
formatter.match({
  "location": "SDLeavesPage.tc0103wrote_the_leave_type()"
});
formatter.result({
  "duration": 1392767500,
  "status": "passed"
});
formatter.match({
  "location": "SDLeavesPage.tc0103click_on_save_the_user_moves_to_next_page()"
});
formatter.result({
  "duration": 3232979300,
  "status": "passed"
});
});