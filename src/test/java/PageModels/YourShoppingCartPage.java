package PageModels;

import org.openqa.selenium.By;

public class YourShoppingCartPage extends Page {
    private static By PROCEED_TO_CHECKOUT = By.xpath("//a[@title='Continue shopping']//preceding-sibling::a");
    public void clickOnProceedToCheckout(){
        driver.findElement(PROCEED_TO_CHECKOUT).click();
    }

}
