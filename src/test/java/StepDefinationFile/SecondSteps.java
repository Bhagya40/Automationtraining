package StepDefinationFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondSteps {
    @When("Click on {string} button")
    public void clickOnSignupLoginButton() {
    }

    @Then("Verify {string} is visible")
    public void verifyLoginToYourAccountIsVisible() {
    }

    @When("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {
    }

    @And("Click {string} button")
    public void clickLoginButton() {
    }

    @Then("Verify that {string} is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
    }
}
