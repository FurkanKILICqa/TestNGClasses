package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

import java.io.FileNotFoundException;

public class TestCenterPage {


    public TestCenterPage() throws FileNotFoundException {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="exampleInputEmail1")
    public WebElement userName;



    @FindBy(id="exampleInputPassword1")
    public WebElement password;




    @FindBy(xpath="//button")
    public WebElement submitButton;


    @FindBy(xpath = "//a//i")
    public WebElement logout;










}
