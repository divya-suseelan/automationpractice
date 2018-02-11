package PageModels;

import Generic.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YourPaymentMethodPage extends Page {
    private static By PAY_BY_BANK_WIRE = By.xpath("//a[@title='Pay by bank wire']");
    private static By PAY_BY_CHECK = By.xpath("//a[@title='Pay by check.']");
    private static By I_CONFIRM_ORDER_BUTTON = By.xpath("//p[@id='cart_navigation']//button");

    public void processOrderPayment(String paymentMethod) throws Exception{
        if(paymentMethod.equalsIgnoreCase("Pay by Bank Wire")){
            Utilities.highlightWebElement(PAY_BY_BANK_WIRE);
            Utilities.takeSnapShot("Pay by Bank Wire");
            driver.findElement(PAY_BY_BANK_WIRE).click();

        }else{
            Utilities.highlightWebElement(PAY_BY_CHECK);
            Utilities.takeSnapShot("Pay by check");
            driver.findElement(PAY_BY_CHECK).click();

        }
    }

    public void clickOnIConfirm(){
        wait.until(ExpectedConditions.presenceOfElementLocated(I_CONFIRM_ORDER_BUTTON));
        driver.findElement(I_CONFIRM_ORDER_BUTTON).click();
    }
}
