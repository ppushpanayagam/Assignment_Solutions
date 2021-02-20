package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.homePage;
import utils.reusbaleMethods;

import java.io.IOException;

public class orderTshirtSteps {
    private static reusbaleMethods methods;
    @Given("the user invoke the application")
    public void the_user_invoke_the_application() throws IOException {
            methods = new reusbaleMethods();
            methods.loadProperties();
            methods.invokeApp();
    }
    @And("^sign in$")
    public void signIn() {
        new homePage()
                .clickSignInLink()
                .enterUserName("mailforTest@gmail.com")
                .enterPassword("Password@123")
                .clickSignInButtonn();
    }
    @When("the User Order a Tshirt as a existing user")
    public void the_user_order_a_tshirt_as_a_existing_user() {
            new homePage()
                    .verifyHomePage()
                    .clickTshirtLink()
                    .clickTshirtImage()
                    .clickAddToCartButton()
                    .clickProceedToCheckOutButton()
                    .clickProceedToCheckOutButtonInSummarySection()
                    .clickProceedToCheckOutButtonInAddressSection()
                    .clickCheckBox()
                    .clickBankWireOptionInShippingSection()
                    .clickConfirmOrderInShippingSection();
    }
    @Then("the user should be able to order an item successfully")
    public void the_user_should_be_able_to_order_an_item_successfully() {
            new homePage()
                    .verifyMessage("Your order on My Store is complete.");
    }
}
