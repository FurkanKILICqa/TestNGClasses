package techproed.tests.day_24_dataprovider_xmlfiles;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.DataProviderPage;
import techproed.utilities.DataProviderUtils;
import techproed.utilities.Driver;

import java.io.FileNotFoundException;

public class C04DataProvidersUtils {




    @Test(dataProvider = "positiveTestData",dataProviderClass = DataProviderUtils.class)//Utilities class ı ile bağladik
    public void test01(int age) throws FileNotFoundException {



        //https://dataprovider.netlify.app/ adresine gidelim
        Driver.getDriver().get("https://dataprovider.netlify.app/");

        //BlackBoxTesting techniques ile otomasyon test yapalim


        //Driveri kapatalım
        DataProviderPage dataProviderPage = new DataProviderPage();
        dataProviderPage.searcBox.sendKeys(String.valueOf(age), Keys.TAB,Keys.ENTER);

        Assert.assertTrue(dataProviderPage.positiveVerifyMessage.isDisplayed());
        Driver.closeDriver();




    }
}
