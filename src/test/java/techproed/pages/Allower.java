package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.io.FileNotFoundException;

public class Allower {




    public Allower() throws FileNotFoundException {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[.='Sign In'])[2]")
    public WebElement SignIn;





    @FindBy(xpath = "//*[@id='username']")
    public WebElement email;


    @FindBy(xpath = "//*[@id='password']")
    public WebElement pass;


    @FindBy(xpath = "//*[@name='login']")
    public WebElement submit;

    @FindBy(xpath = "(//*[@href='https://allovercommerce.com/my-account-2/'])[1]")
    public WebElement myAccount;

    @FindBy(xpath = "//*[@href='https://allovercommerce.com/store-manager/']")
    public WebElement storeManager;


    @FindBy(xpath = "(//*[@class='elementor-widget-wrap elementor-element-populated'])[23]")
    public WebElement scroll;

    @FindBy(xpath = "(//*[@class='text'])[4]")
    public WebElement product;


    @FindBy(xpath = "(//*[text()='Add New'])[1]")
    public WebElement addNew;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[1]")
    public WebElement inventory;


    @FindBy(xpath = "//*[@id='wcfm_products_manage_form_advanced_head']")
    public WebElement advenced;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[4]")
    public  WebElement shipping;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[5]")
    public WebElement atteributes;


    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[7]")
    public WebElement linked;


    @FindBy(xpath = "//*[@id='sku']")
    public WebElement sku;

    @FindBy(xpath = "//strong[text()='Sold Individually']")
    public WebElement soldIndividual;

    @FindBy(xpath = "//*[@id='manage_stock']")
    public WebElement manageStockCheckBox;


    @FindBy(xpath = "//*[@id='stock_qty']")
    public WebElement stockQty;














}
