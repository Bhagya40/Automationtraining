package StepDefinationFile;

import Hooks.BrowserDriver;
import PageObjects.TestCase1Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstSteps {
    TestCase1Page testCase1Page=new TestCase1Page(BrowserDriver.getDriver());
    @Given("Launch browser")
    public void launchBrowser() {
        System.out.println("Hellow");
    }

    @When("Navigate to url {string}")
    public void navigateToUrl(String arg0) {
testCase1Page.Navigate(arg0);
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
    }

    @When("Click on Signup or Login button")
    public void clickOnSignupOrLoginButton() {
    }

    @Then("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
    }

    @And("Enter {string} and {string}")
    public void enterAnd(String arg0, String arg1, String arg2, String arg3) {
    }

    @When("Click Signup button")
    public void clickSignupButton() {
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
    }

    @And("Fill details: {string},{string}")
    public void fillDetails(String arg0, String arg1, String arg2, String arg3) {
    }

    @And("Fill details: {string}")
    public void fillDetails(String arg0, String arg1) {
    }

    @And("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
    }

    @And("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
    }

    @And("Fill details: {string}, {string}, {string}, {string}, {string}, {string}, {string} {string}, {string}, {string}")
    public void fillDetails(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14, String arg15, String arg16, String arg17, String arg18, String arg19) {
    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {
    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
    }

    @And("Click Continue button")
    public void clickContinueButton() {
    }

    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
    }

    @When("Click Delete Account button")
    public void clickDeleteAccountButton() {
    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
    }
}
