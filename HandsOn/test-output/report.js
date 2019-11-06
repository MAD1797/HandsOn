$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/UserLogin.feature");
formatter.feature({
  "name": "Login Action",
  "description": "  Test Login Functionality",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "navigate to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.UserLogin.navigate_to_home_page() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/HandsOn/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.UserLogin.user_enters_username_and_password() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/HandsOn/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.UserLogin.message_login_successfully() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/HandsOn/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
});