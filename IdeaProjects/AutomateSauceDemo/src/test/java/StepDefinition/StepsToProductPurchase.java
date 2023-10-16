package StepDefinition;

import PageObjectModel.LogOut;
import PageObjectModel.LoginPage;
import PageObjectModel.ProductPurchase;
import Utils.GenericUtils;
import Utils.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsToProductPurchase {
    //page objects
    GenericUtils genericUtil;
    ProductPurchase PP;
    //LogOut logoutP;

    //constructor
    public StepsToProductPurchase(TestContext testContext1){

        genericUtil = testContext1.pageObjectManager.getGenericUtil();
        PP = testContext1.pageObjectManager.getProductPurchase();
        PP = testContext1.pageObjectManager.productPurchase;
    }


    @Given("User is on the  products list page")
    public void user_is_on_the_products_list_page() throws InterruptedException {
       // logoutP.verifyUserOnMainPage();
    }
    @When("User can select multiple products")
    public void user_can_select_multiple_products() {
PP.selectProductsToBuy();
    }
    @When("User clicks on Add to cart button top right corner of the screen and directed to cart page")
    public void user_clicks_on_add_to_cart_button_top_right_corner_of_the_screen_and_directed_to_cart_page() {
        PP.clickOnAddToCartButton();
        PP.verifyUserOnCartPage();

    }
    @When("User clicks on Checkout button displaying on the cart page and directed to the Information page")
    public void user_clicks_on_checkout_button_displaying_on_the_cart_page_and_directed_to_the_information_page() {
        PP.clickOnCheckoutButton();
        PP.verifyUserOnCheckoutPage();

    }
//        @And("User fill the information FirstName, LastName and Zip\\/Postal code and Click on Continue button and directed to Overview page")
//        public void userFillTheInformationFirstNameLastNameAndZipPostalCodeAndClickOnContinueButtonAndDirectedToOverviewPage() {
//            PP.enterYourInformation();
//            PP.clickOnContinueButton();
//            PP.verifyUserOnOverviewPage();
//        }
@And("User fill the information FirstName, LastName and Zip or Postal code and Click on Continue button and directed to Overview page")
public void userFillTheInformationFirstNameLastNameAndZipPostalCodeAndClickOnContinueButtonAndDirectedToOverviewPage() {
    PP.enterYourInformation();
    PP.clickOnContinueButton();
    PP.verifyUserOnOverviewPage();
}


    @When("In overview page user clicks on Finish button to complete the shopping and directed to the Completion page")
    public void in_overview_page_user_clicks_on_finish_button_to_complete_the_shopping_and_directed_to_the_completion_page() {
        PP.clickOnFinishButton();
        PP.verifyUserOnCompletePage();
    }
    @Then("User clicks on Back Home button and directed to the main page")
    public void user_clicks_on_back_home_button_and_directed_to_the_main_page() throws InterruptedException {
        PP.clickOnBackHomeButton();
        //logoutP.verifyUserOnMainPage();
    }


}
