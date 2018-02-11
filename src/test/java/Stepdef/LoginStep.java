package Stepdef;

import PageModels.AuthenticationPage;
import PageModels.MyAccountPage;
import PageModels.Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStep {
    private static Page page = new Page();
    private static AuthenticationPage authenticationPage = new AuthenticationPage();
    private static MyAccountPage myAccountPage = new MyAccountPage();

    @cucumber.api.java.en.Given("^User navigate to the Sign in page$")
    public void userNavigateToTheSignInPage() throws Throwable {
        page.clickOnSignIn();
    }


    @When("^user submit \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userSubmitAnd(String emailAddress, String password) throws Throwable {
        authenticationPage.SignInToShoppingSite(emailAddress,password);
    }


    @Then("^user should be taken to \"([^\"]*)\" page$")
    public void userShouldBeTakenToPage(String HeaderName) throws Throwable {
        String requiredText = myAccountPage.getTextOfHeader();
        Assert.assertEquals(HeaderName,requiredText);
    }
}
