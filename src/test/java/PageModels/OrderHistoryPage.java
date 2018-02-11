package PageModels;

import Generic.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OrderHistoryPage extends Page{
    private static By ORDER_TABLE_ROW = By.xpath("//table[@id='order-list']//tbody//tr[1]//a");

    public String getOrderReferenceNumber() throws Exception{
        Utilities.highlightWebElement(ORDER_TABLE_ROW);
        Utilities.takeSnapShot("OrderHistory");
        String requiredReferenceNumber = driver.findElement(ORDER_TABLE_ROW).getText();
        return requiredReferenceNumber;
    }
}
