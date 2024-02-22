package UtilPackage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class OptionManager {
    public Properties prop;

    public FirefoxOptions fo;
    public OptionManager(Properties prop)
    {
        this.prop=prop;
    }
    public ChromeOptions getChromeOptions()
    {
        ChromeOptions   co= new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        if(Boolean.parseBoolean(prop.getProperty("headless").trim()))
        {
            co.addArguments("--headless=new");

        }
        if(Boolean.parseBoolean(prop.getProperty("incognito").trim()))

        {
            co.addArguments("--incognito");
        }
        return co;
    }
    public FirefoxOptions getFirefoxOptions()
    {
        fo= new FirefoxOptions();
        if(Boolean.parseBoolean(prop.getProperty("headless").trim()))
        {
            fo.addArguments("--headless");

        }
        return fo;
    }
}
