package PageModels;

import Generic.Utilities;
import org.openqa.selenium.By;

public class YourPersonalInformationPage extends Page{
    private static By MY_PERSONAL_INFORMATION = By.xpath("//a[@title='Information']");
    private static By FISRT_NAME = By.id("firstname");
    private static By CURRENT_PASSWORD = By.xpath("//input[@id='old_passwd']");
    private static By SAVE_BUTTON =By.xpath("//button[@name='submitIdentity']");
    private static By MESSAGE = By.xpath("//p[contains(text(),' Your personal information has been successfully updated.')]");

    public void clickOnMyPersonalInformation(){
        driver.findElement(MY_PERSONAL_INFORMATION).click();
    }

    public void updateFirstName (String newFirstName) throws Exception{
        driver.findElement(FISRT_NAME).clear();
        driver.findElement(FISRT_NAME).sendKeys(newFirstName);
        Utilities.highlightWebElement(FISRT_NAME);
        Utilities.takeSnapShot("FirstName");
    }
    public void inputCurrentPassword(String currentPassword) throws Exception{
        driver.findElement(CURRENT_PASSWORD).clear();
        driver.findElement(CURRENT_PASSWORD).sendKeys(currentPassword);
        Utilities.highlightWebElement(CURRENT_PASSWORD);
        Utilities.takeSnapShot("CurrentPassword");
    }
    public void clickOnSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
    }

    public String getUpdateSuccessfullMessage() throws Exception{
        Utilities.highlightWebElement(MESSAGE);
        String expectedMessage = driver.findElement(MESSAGE).getText();
        Utilities.takeSnapShot("UpdateMessage");
        return expectedMessage;
    }
}
