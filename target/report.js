$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Instagram.feature");
formatter.feature({
  "name": "Verify Instagram login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verify login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\" and click on login Button",
  "keyword": "When "
});
formatter.step({
  "name": "User verify login success message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "7418851444",
        "Instagram@123"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on Instagram login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_is_on_Instagram_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters \"7418851444\" and \"Instagram@123\" and click on login Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_enters_and_and_click_on_login_Button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify login success message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_verify_login_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verify login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\" and click on login Button",
  "keyword": "When "
});
formatter.step({
  "name": "User verify login error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "7418851444",
        "Password@123"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on Instagram login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_is_on_Instagram_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters \"7418851444\" and \"Password@123\" and click on login Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_enters_and_and_click_on_login_Button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify login error message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_verify_login_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on Instagram login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_is_on_Instagram_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters userName and password and press enter key",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "7418851444",
        "Instagram@123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_enters_userName_and_password_and_press_enter_key(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify login success message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_verify_login_success_message()"
});
formatter.result({
  "status": "passed"
});
});