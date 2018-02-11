package Generic;

import com.google.gson.annotations.Since;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Utilities extends Browser{
    private static final DateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static void highlightWebElement(By elementLocator){
        WebElement elementToHighlight=driver.findElement(elementLocator);
        highLighterMethod(elementToHighlight);
    }
    public static void highLighterMethod(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }

    public static void takeSnapShot(String imageName) throws Exception{
        String timeStamp = timeStamp();
        String destinationPath = createScreenshotFolder()+imageName+timeStamp+".png";
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(destinationPath);
        FileUtils.copyFile(SrcFile, DestFile);
    }

    public static String createScreenshotFolder(){
        String screenShotPath = System.getProperty("FILEPATH");
        File file = new File(screenShotPath);
        if (!file.exists()) {
            file.mkdir();
        }
        return screenShotPath;
    }

    public static String timeStamp(){
        String expectedDateFormat=null;
        Date date = new Date();
        String dateformat = simpleDateFormat.format(date).toString();
        if(dateformat.contains("/")){
            dateformat = dateformat.replaceAll("/","_");
        }if(dateformat.contains(":")){
            dateformat = dateformat.replaceAll(":","_");
        }
        expectedDateFormat = dateformat;
        return expectedDateFormat;
    }

}
