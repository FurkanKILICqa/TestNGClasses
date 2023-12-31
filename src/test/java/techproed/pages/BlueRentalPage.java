package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.io.FileNotFoundException;

public class BlueRentalPage {

    public BlueRentalPage() throws FileNotFoundException {

        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy (xpath = "//li//a[@role='button']")
    public WebElement loginButton;

    @FindBy (id = "formBasicEmail")
    public WebElement email;

    @FindBy (id = "formBasicPassword")
    public WebElement password;


    @FindBy (id = "dropdown-basic-button")
    public WebElement loginVerify;



    @FindBy (xpath = "//*[contains( text(), 'User with email fake@bluerentalcars.com not found'  )]")
    public WebElement negatifloginVerify;



    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement userNameButton;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[2]")
    public WebElement profileButton;


    @FindBy(xpath = "//em")
    public  WebElement userEmail;

    @FindBy(xpath = "//*[.='Logout']")
    public WebElement logout;

    @FindBy(xpath = "//*[.='OK']")
    public WebElement okButton;

    @FindBy(xpath = "(//*[.='User with email ceyhancan@bluerentalcars.com not found'])[5]")
    public WebElement alert;





}
