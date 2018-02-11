package Stepdef;


import Generic.Browser;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ShopScriptGateWay extends Browser {

    @Before
    public void SetUp(){
       getDriver();
       getUrl();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
