package techproed.tests.day_23_excel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;

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

        ExcelReader excelReader=new ExcelReader(classPath,pageName);
        String emailExcel = excelReader.getCellData(2,0);
        String passwordExcel = excelReader.getCellData(2,1);

        blueRentalPage.email.sendKeys(emailExcel);
        blueRentalPage.password.sendKeys(passwordExcel, Keys.ENTER);
        blueRentalPage.userNameButton.click();
        blueRentalPage.profileButton.click();
        String profileEmail = blueRentalPage.userEmail.getText();

       Assert.assertEquals(profileEmail,emailExcel,"Emailde uyumsuzluk var");






    }
}
