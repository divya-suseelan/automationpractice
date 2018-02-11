package PageModels;

import org.openqa.selenium.By;

public class ShippingPage extends Page{
    private static By I_AGREE_CHECKBOX = By.id("cgv");
    private static By PROCEED_TO_CHECKOUT = By.xpath("//button[@name='processCarrier']");

    public void clickOnProceedToCheckout(){
        driver.findElement(I_AGREE_CHECKBOX).click();
        driver.findElement(PROCEED_TO_CHECKOUT).click();
    }
}
