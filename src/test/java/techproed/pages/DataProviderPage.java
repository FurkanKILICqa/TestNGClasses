package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.io.FileNotFoundException;

public class DataProviderPage {


    public DataProviderPage() throws FileNotFoundException {
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(id="age")
    public WebElement searcBox;


    @FindBy(xpath="//*[.='Yaş doğrulandı!']")
    public WebElement positiveVerifyMessage;








}
