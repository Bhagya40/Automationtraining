package PageObjects;

import UtilPackage.ElementUtil;
import org.openqa.selenium.WebDriver;

public class TestCase2Page {
    public WebDriver driver;
    public ElementUtil eleutil;
    public TestCase2Page(WebDriver driver)
    {
        this.driver=driver;
        eleutil= new ElementUtil(driver);
    }
}
