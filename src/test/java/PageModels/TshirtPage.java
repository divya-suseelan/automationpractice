package PageModels;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Iterator;
import java.util.Set;


public class TshirtPage extends Page {
    private static By ADD_TO_CART_BUTTON = By.xpath("//a[@title='Add to cart']");
    private static By PROCEED_TO_CHECKOUT_BUTTON= By.xpath("//span[@title='Continue shopping']//following-sibling::a[@title='Proceed to checkout']");
    private static By CONTAINER = By.className("product-container");
    private static By BUTTON_CONTAINER = By.className("button-container");

    public void clickOnAddToCart(){
        wait.until(ExpectedConditions.presenceOfElementLocated(CONTAINER));
        WebElement buttonContainer = driver.findElement(CONTAINER);
        Actions action = new Actions(driver);
        action.moveToElement(buttonContainer).build().perform();
        driver.findElement(ADD_TO_CART_BUTTON).click();
    }
    public void clickOnProceedToCheckout(){
        wait.until(ExpectedConditions.presenceOfElementLocated(PROCEED_TO_CHECKOUT_BUTTON));
        String proceedTocheckOut = driver.findElement(PROCEED_TO_CHECKOUT_BUTTON).getAttribute("href");
        driver.navigate().to(proceedTocheckOut);
    }
}
