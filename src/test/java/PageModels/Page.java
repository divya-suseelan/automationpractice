package PageModels;

import Generic.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page extends Browser {
    private static By SIGN_IN = By.xpath("//a[contains(text(),'Sign in')]");
    private static By SIGN_OUT = By.xpath("//a[@title='Log me out']");

    public void clickOnSignIn(){
        driver.findElement(SIGN_IN).click();
    }
    public void clickOnSignOut(){
        driver.findElement(SIGN_OUT).click();
    }
}
