package StepDefinition;

import PageObjectModel.LogOut;
import PageObjectModel.LoginPage;
import Utils.GenericUtils;
import Utils.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsToLogOut {
    //page objects
    GenericUtils genericUtil;
    LogOut logoutP;

    //constructor
    public StepsToLogOut(TestContext testContext1){

        genericUtil = testContext1.pageObjectManager.getGenericUtil();
        logoutP = testContext1.pageObjectManager.logOut();
    }


    @Given("User is already login into the application")
    public void user_is_already_login_into_the_application() throws InterruptedException {
       logoutP.verifyUserOnMainPage();

    }
    @When("User clicks on menu button top left of the screen")
    public void user_clicks_on_menu_button_top_left_of_the_screen() {
logoutP.clickOnMenuIcon();
    }
    @Then("User clicks on the logout option and directed to the main page")
    public void user_clicks_on_the_logout_option_and_directed_to_the_main_page() {
        logoutP.clickOnLogoutButton();
    }
}
