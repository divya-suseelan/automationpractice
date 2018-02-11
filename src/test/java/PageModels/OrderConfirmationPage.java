package PageModels;

import Generic.Utilities;
import org.openqa.selenium.By;

public class OrderConfirmationPage extends Page {
    private static By MESSAGE = By.xpath("//div[@id='center_column']//div");
    private static By BACK_TO_ORDERS = By.xpath("//a[@title='Back to orders']");
    String referenceNumber = null;

    public String getOrderReferenceNumber() throws Exception{
        boolean refFlag =false;
        String requiredReferenceNumber =driver.findElement(MESSAGE).getText();
        Utilities.highlightWebElement(MESSAGE);
        Utilities.takeSnapShot("ConfirmationMessage");
        String referenceArray[]=requiredReferenceNumber.split("\\s");
        for(int i=0;i<referenceArray.length;i++){
            referenceNumber=referenceArray[i];
            if(refFlag){
                referenceNumber=referenceArray[i];
                if(referenceNumber.endsWith("."))
                referenceNumber = referenceNumber.substring(0,referenceNumber.length()-1);
                break;
            }
            if(referenceNumber.equalsIgnoreCase("reference")){
                refFlag = true;
            }

        }
        return referenceNumber;
    }
    public void clickOnBackToOrders(){
        driver.findElement(BACK_TO_ORDERS).click();
    }
}
