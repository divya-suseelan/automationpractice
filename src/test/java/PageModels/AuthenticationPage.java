package PageModels;

import Generic.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AuthenticationPage extends Page{
    private static By EMAIL_ID = By.id("email");
    private static By PASSWORD = By.id("passwd");
    private static By SIGN_IN_BUTTON = By.id("SubmitLogin");

    public void setEmailAddress(String emailAddress){
        driver.findElement(EMAIL_ID).clear();
        driver.findElement(EMAIL_ID).sendKeys(emailAddress);
    }

    public void setPassword(String password){
        driver.findElement(PASSWORD).clear();
        driver.findElement(PASSWORD).sendKeys(password);
    }

    public void clickSignInButton(){
        driver.findElement(SIGN_IN_BUTTON).click();
    }

    public void SignInToShoppingSite(String emailAddress,String password){
        this.setEmailAddress(emailAddress);
        this.setPassword(password);
        this.clickSignInButton();
    }

}

