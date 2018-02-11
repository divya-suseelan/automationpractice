package PageModels;

import org.openqa.selenium.By;

public class AddressPage extends Page {
    private static By PROCEED_TO_CHECKOUT_BUTTON = By.xpath("//button[@name='processAddress']");

    public void clickOnProceedToCheckout(){
        driver.findElement(PROCEED_TO_CHECKOUT_BUTTON).click();
    }
}
