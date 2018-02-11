package PageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage extends Page{
    private static By MY_ACCOUNT_HEADER = By.xpath("//span[contains(text(),'My account')]");
    private static By TSHIRT_TAB = By.xpath("//li[@id='category-thumbnail']//following::li//a[@title='T-shirts']");

    public String getTextOfHeader(){
       String requiredText = driver.findElement(MY_ACCOUNT_HEADER).getText();
       return requiredText;
    }

    public void clickOnTshirtTab(){
        WebElement hoverOverElement = driver.findElement(TSHIRT_TAB);
        Actions mouserHover = new Actions(driver);
        mouserHover.moveToElement(hoverOverElement).build().perform();
        driver.findElement(TSHIRT_TAB).click();
    }
}
