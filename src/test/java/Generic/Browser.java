package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
    public static WebDriver driver;
    private static String baseURL = null;
    public static WebDriverWait wait;

    public static void getDriver(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20);

    }
    public static void getUrl(){
        baseURL = System.getProperty("URL");
        driver.get(baseURL);
    }
}
