package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiPage;

public class ApiStep {

    ApiPage apiPage;

    public ApiStep() {
        this.apiPage = new ApiPage();
    }

    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
        apiPage.prepareUrlFor(url);
        
    }

    @And("hit api get user by ID")
    public void hitApiGetUserByID() {
       apiPage.hitApiGetUserByID();
        
    }

    @Then("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int status_code) {
        apiPage.validationStatusCodeIsEquals(status_code);
    }

    @Then("validation response body get user by ID")
    public void validationResponseBodyGetUserByID() {
        apiPage.validationResponseBodyGetUserByID();
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String arg0) {
        apiPage.validationResponseJsonWithJSONSchema();
    }
}
