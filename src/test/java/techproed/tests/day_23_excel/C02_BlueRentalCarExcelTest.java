package techproed.tests.day_23_excel;

import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.io.FileNotFoundException;

public class C02_BlueRentalCarExcelTest {

    //BlueRentalCar sayfasına gidelim
    //Login buttonuna tıklayalım
    //Excel dosyasındaki herhangi bir email ve password ile login olalım
    //Girilen email ile giriş yapıldığını doğrulayın
    //sayfayı kapatalım


    @Test
    public void test01() throws FileNotFoundException {

        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        BlueRentalPage blueRentalPage =new BlueRentalPage();
        blueRentalPage.loginButton.click();

        String classPath = "src\\test\\java\\techproed\\resources\\mysmoketestdata.xlsx";
        String pageName="customer_info";


    }
}
