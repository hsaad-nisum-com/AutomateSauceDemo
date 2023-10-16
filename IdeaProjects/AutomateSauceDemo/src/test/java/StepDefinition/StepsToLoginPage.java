package StepDefinition;

import PageObjectModel.LoginPage;
import Utils.GenericUtils;
import Utils.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepsToLoginPage {
    //page objects
    GenericUtils genericUtil;
    LoginPage loginP;

    //constructor
    public StepsToLoginPage(TestContext testContext1){

        genericUtil = testContext1.pageObjectManager.getGenericUtil();
        loginP = testContext1.pageObjectManager.getLogin();
    }
    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {
        loginP.verifyUserOnLandingPage();
    }
    @When("User enter the email as {string}")
    public void user_enter_the_email_as(String string) {
        loginP.enterId(string);
    }
    @When("User enter the password as {string}")
    public void user_enter_the_password_as(String string2) {
        loginP.enterPassword(string2);
    }
    @Then("User click on sign-in button and user is directed to the main page")
    public void user_click_on_sign_in_button_and_user_is_directed_to_the_main_page() throws InterruptedException {
        loginP.signinButton();
    }
}
