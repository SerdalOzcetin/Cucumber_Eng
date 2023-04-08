package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestAutomationHomePage {

    public TestAutomationHomePage () {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "menu-item-20")
    public WebElement buttonPRACTICE;

    @FindBy(xpath = "//a[text()='Test Login Page']")
    public WebElement linkTestLoginPage;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement buttonSubmit;

    @FindBy(xpath = "//h1[text()='Logged In Successfully']")
    public WebElement textLoggedInSuccessfully;
}
