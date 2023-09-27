$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Sample.feature");
formatter.feature({
  "name": "To validate the account creation of Amazon application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Faeature1"
    }
  ]
});
formatter.scenario({
  "name": "To create a new account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Faeature1"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginsample.to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch url of amazon application",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsample.to_launch_url_of_amazon_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsample.to_click_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the create new account",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsample.to_click_the_create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the firstname in the name textbox",
  "rows": [
    {
      "cells": [
        "vaishnavi",
        "vaishali",
        "reshu",
        "madhu"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Loginsample.to_pass_the_firstname_in_the_name_textbox(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the mobileno or email in the email textbox",
  "rows": [
    {
      "cells": [
        "sjvaishnavi05@gmail.com",
        "9361694473",
        "9715561456"
      ]
    },
    {
      "cells": [
        "8765431204",
        "vaishu@gmail.com",
        "9715562456"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Loginsample.to_pass_the_mobileno_or_email_in_the_email_textbox(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To create new password using new password textbox",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsample.to_create_new_password_using_new_password_textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the Chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsample.to_close_the_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
});