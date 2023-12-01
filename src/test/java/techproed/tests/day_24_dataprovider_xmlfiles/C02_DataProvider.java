package techproed.tests.day_24_dataprovider_xmlfiles;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.io.FileNotFoundException;

public class C02_DataProvider {


    @DataProvider
    public static Object[][] urunler() {
        return new Object[][]{
                {"laptop"},{"iphone"},{"mouse"}
        };
    }

    @Test(dataProvider = "urunler")
    public void test01(String data) throws FileNotFoundException {

        //Google sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        //DataProvider ile istediğimiz arac isimlerini aratalım
        new GooglePage().searchBox.sendKeys(data, Keys.ENTER);

        //sayfayı kapatalım
        Driver.closeDriver();

    }


    @Test
    public void test02() {



    }
}
