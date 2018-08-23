package com.apiAutomation.api.step;

import com.apiAutomation.SetupStep;
import com.apiAutomation.api.serviceObject.FakeApiUserService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;


public class FakeApiUserStep extends SetupStep {

    @Autowired
    private FakeApiUserService fakeApiUserService;

    @Given("^valid request$")
    public void validRequest() throws Throwable {
        fakeApiUserService.createRequest();
    }


    @When("^search a valid user$")
    public void searchValidUser() throws Throwable {
        fakeApiUserService.getValidUser();
    }


    @Then("^user is found$")
    public void validateUser() throws Throwable {
        fakeApiUserService.verifyUserResponse();
    }
}
