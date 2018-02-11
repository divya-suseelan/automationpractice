package Stepdef;

import PageModels.Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class LogOutStep {
    private static Page page = new Page();

    @And("^user logout$")
    public void userLogout() throws Throwable {
            page.clickOnSignOut();

    }
}
