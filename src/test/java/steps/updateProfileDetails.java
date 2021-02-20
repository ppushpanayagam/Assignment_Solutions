package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.personalInformationPage;

public class updateProfileDetails {

    @When("^the user update their first name$")
    public void the_user_update_their_first_name() throws Throwable {
            new personalInformationPage()
                    .verifyPersonalPage()
                    .clickMyPersonalPageLink()
                    .UpdateFirstName("AnyName")
                    .enterOldPassword("Password@123")
                    .clickSaveButton();
    }

    @Then("^the user should be able to update the first name successfully$")
    public void the_user_should_be_able_to_update_the_first_name_successfully() throws Throwable {
            new personalInformationPage()
                    .verifySuccessfulMessage("Your personal information has been successfully updated.");
    }
}
