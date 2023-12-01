package techproed.tests.day_24_dataprovider_xmlfiles;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.io.FileNotFoundException;

public class C03_DataProvider {
    /*
       BlueRentalCar Sayfasına Gidelim
       Login butonuna tıklayalım
       Dataprovider Kullanarak verilen email ve password bilgileri ile login olalım
       Sayfayı kapatalım

          {"ayhancan@bluerentalcars.com", "ayhan"},
          {"beyhancan@bluerentalcars.com", "beyhan"},
          {"seyhan@bluerentalcars.com", "seyhan"},
          {"johnson@bluerentalcars.com", "johnson"}
*/

        @DataProvider
        public static Object[][] credentials() {
            return new Object[][]{
                    {"ayhancan@bluerentalcars.com", "ayhan"},
                    {"beyhancan@bluerentalcars.com", "beyhan"},
                    {"seyhan@bluerentalcars.com", "seyhan"},
                    {"johnson@bluerentalcars.com", "johnson"}
            };
        }
        //Excel den çekip de yapabiliriz ama normal kullanımı üstteki gibi

        @Test(dataProvider = "credentials")
        public void test01(String email,String password) throws FileNotFoundException {
            // BlueRentalCar Sayfasına Gidelim
            Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

            //       Login butonuna tıklayalım
            BlueRentalPage blueRentalPage=new BlueRentalPage();
            blueRentalPage.loginButton.click();

            //       Dataprovider Kullanarak verilen email ve password bilgileri ile login olalım
            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password, Keys.ENTER);

            //       Sayfayı kapatalım
            Driver.closeDriver();

        }







}
