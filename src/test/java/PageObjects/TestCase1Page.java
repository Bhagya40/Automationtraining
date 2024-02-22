package PageObjects;

import UtilPackage.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase1Page {
    public WebDriver driver;
    public ElementUtil eleutil;
    public TestCase1Page(WebDriver driver)
    {
        this.driver=driver;
        eleutil= new ElementUtil(driver);
    }
    By clicksignupbutton=By.xpath(" //a[text()=' Signup / Login']");
    By newusersignuptext=By.xpath("//div[@class='signup-form']//h2[text()='New User Signup!']");
    By name=By.xpath("//input[@name='name']");
    By email= By.xpath("//div[@class='signup-form']//input[@name='email']");
    By signUpbutton=By.xpath("//button[text()='Signup']");
    By accountinfo=By.xpath("//div//h2//b[text()='Enter Account Information']");
    By titlemrs= By.xpath("//input[@value='Mrs']");
    By titlemr= By.xpath("//input[@value='Mr']");
    By pwd= By.id("password");
    By day= By.id("days");
    By month= By.id("months");
    By year= By.id("years");
    By clicknewsletterbutton= By.id("newsletter");
    By receivecheckbox= By.id("optin");

    By entername= By.name("first_name");
    By lastname=By.name("last_name");
    By company=By.id("company");
    By address= By.id("address1");
    By addr2= By.id("address2");
    By country=By.id("country");
    By state= By.id("state");
    By city= By.id("city");
    By zipcode= By.id("zipcode");
    By mobileno= By.id("mobile_number");
    By submitbutton= By.xpath("//button[text()='Create Account']");
    By AccountHeader= By.xpath("//div//h2//b[text()='Account Created!']");
    //. Click 'Continue' button
    By continuebutton= By.xpath("//a[text()='Continue']");
    //Verify that 'Logged in as username' is visible
    By namedisplayed= By.xpath("//a//i[@class='fa fa-user']");
    //Click 'Delete Account' button
    By deleteaccount= By.xpath("//a//i[@class='fa fa-trash-o']");
    //Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    By deleteaccountHeader=By.xpath("//div//h2//b[text()='Account Deleted!']");
    By continuesbutton= By.xpath("//div//a[text()='Continue']");

    public void Navigate(String url)
    {
        driver.navigate().to(url);
    }
    public boolean VerifyHomePageTitledisplayed()
    {
        String title=driver.getTitle();
        if(title.equalsIgnoreCase("Automation Exercise"))
        {
            return true;
        }
        return false;
    }
    public void doClickSignupbutton()
    {
        eleutil.doClick(clicksignupbutton);
    }
    public void verifyNewUserSignUpisVisible()
    {
        eleutil.getElement(newusersignuptext).isDisplayed();
    }
    public void doclicksignUp()
    {
        eleutil.doClick(signUpbutton);
    }
    public void enterName(String text)
    {
        eleutil.doSendKeys(name,text);
    }
    public void enterEmail(String text)
    {
        eleutil.doSendKeys(email,text);
    }
    public void clickSignUpbutton()
    {
        eleutil.doClick(signUpbutton);
    }
    public void verifyaccountinfoisvisible()
    {
        eleutil.getElement(accountinfo).isDisplayed();
    }
    public void selectTitle(String text)
    {
        if(text.equalsIgnoreCase("Mrs"))
        {
            eleutil.doClick(titlemrs);
        }
        else if(text.equalsIgnoreCase("Mr"))
        {eleutil.doClick(titlemr);
        }
    }
    public void enterPassword(String text)
    {
        eleutil.doSendKeys(pwd,text);
    }
    public void selectdateofbirth(int text1, String text2, int text3)
    {
        eleutil.doSelectDropDownByValue(day,String.valueOf(text1));
        eleutil.doSelectDropDownByVisibleText(month,text2);
        eleutil.doSelectDropDownByValue(year, String.valueOf(text3));
    }
    public void clicknewsletter()
    {
        eleutil.doClick(clicknewsletterbutton);
    }
    public void clickreceivecheckbox()
    {
        eleutil.doClick(receivecheckbox);
    }
    public void EnterDetails(String text1, String text2,String text3,String text4,String text5,String text6, String text7,String text8,String text9,String text10)
    {
        eleutil.doSendKeys(entername,text1);
        eleutil.doSendKeys(lastname,text2);
        eleutil.doSendKeys(company,text3);
        eleutil.doSendKeys(address,text4);
        eleutil.doSendKeys(addr2,text5);
        eleutil.doSelectDropDownByVisibleText(country,text6);
        eleutil.doSendKeys(state,text7);
        eleutil.doSendKeys(city,text8);
        eleutil.doSendKeys(zipcode,text9);
        eleutil.doSendKeys(mobileno,text10);
    }
    public void doSubmit()
    {
        eleutil.doClick(submitbutton);
    }
    public void accountcreationVisible()
    {
        eleutil.waitForElementVisible(AccountHeader,40);
    }
    public void clickContinueButton()
    {
        eleutil.doClick(continuebutton);
    }
    public boolean verifyNamedisplayed()
    {
        return eleutil.doElementIsDisplayed(namedisplayed);
    }
    public void clickDeleteaccountbutton()
    {
        eleutil.doClick(deleteaccount);
    }
    public boolean verifyDeleteAccountDisplayed()
    {
        return  eleutil.doElementIsDisplayed(deleteaccountHeader);
    }
    public void ClickContinuesButton()
    {
        eleutil.doClick(continuesbutton);
    }
}

