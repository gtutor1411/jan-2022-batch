$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features\\Tag.feature");
formatter.feature({
  "name": "Tag features",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "This is a login test",
  "keyword": "Given "
});
formatter.match({
  "location": "TagSteps.this_is_a_login_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Shopping Cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "This is a shopping cart test",
  "keyword": "Given "
});
formatter.match({
  "location": "TagSteps.this_is_a_shopping_cart_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});