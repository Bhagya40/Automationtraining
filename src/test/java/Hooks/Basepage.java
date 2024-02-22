package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Basepage {
    public  BrowserDriver Bdriver;
    public static WebDriver driver;
    //there is only one copy of variable in memory
    public Properties prop;
    @Before
    public void setUp()
    {
        Bdriver=new BrowserDriver();
        prop= Bdriver.initProperties();
        driver= Bdriver.BrowsersetUp(prop);
    }
    @After
    public void TearDown()
    {
        //driver.close();
    }
}
