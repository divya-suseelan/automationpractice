package Stepdef;

import PageModels.YourPersonalInformationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class UpdatingMyAccountsStep {
    private static YourPersonalInformationPage yourPersonalInformationPage = new YourPersonalInformationPage();

    @Given("^a user is on My personal information page$")
    public void aUserIsOnMyPersonalInformationPage() throws Throwable {
        yourPersonalInformationPage.clickOnMyPersonalInformation();
    }


    @When("^user enter \"([^\"]*)\" in the First name field$")
    public void userEnterInTheFirstNameField(String firstName) throws Throwable {
        yourPersonalInformationPage.updateFirstName(firstName);
    }

    @And("^enter \"([^\"]*)\" in Current Password and save the details$")
    public void enterInCurrentPasswordAndSaveTheDetails(String password) throws Throwable {
       yourPersonalInformationPage.inputCurrentPassword(password);
       yourPersonalInformationPage.clickOnSaveButton();
    }

    @Then("^message displayed \"([^\"]*)\"$")
    public void messageDisplayed(String successMessage) throws Throwable {
       String requiredMessage = yourPersonalInformationPage.getUpdateSuccessfullMessage();
        Assert.assertEquals(successMessage,requiredMessage);
    }


}
