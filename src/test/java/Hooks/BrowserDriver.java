package Hooks;
import UtilPackage.OptionManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserDriver {
    public Properties prop;
    public static WebDriver driver;
    public OptionManager op;
    public static String highlight;


    public static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<>();
    public WebDriver BrowsersetUp(Properties prop)
    { op= new OptionManager(prop);
        highlight= prop.getProperty("highlight");
        String Browser= prop.getProperty("browser");

        if(Browser.equalsIgnoreCase("Firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            //driver= new FirefoxDriver();
            tlDriver.set(new FirefoxDriver(op.getFirefoxOptions()));
        }
        else if(Browser.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
//            ChromeOptions options = new ChromeOptions();
//            options.addExtensions(new File("C:\\Users\\LEDDANAP\\IdeaProjects\\AutomationTesting\\src\\test\\java\\Extensions\\AdBlock — best ad blocker 5.17.2.0.crx"));
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//            options.merge(capabilities);
            // ChromeDriver driver = new ChromeDriver(capabilities);
            // driver= new ChromeDriver();
            tlDriver.set(new ChromeDriver(op.getChromeOptions()));

        }
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
//        return driver;
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();
    }
    public static synchronized WebDriver getDriver()
    {
        return tlDriver.get();
    }
    public Properties initProperties()
    {
        prop= new Properties();
        FileInputStream ip;
        try {
            ip= new FileInputStream("C:\\Users\\BHGADI\\IdeaProjects\\StudioAutomation\\src\\test\\java\\UtilPackage\\ConfigFile");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }
}
