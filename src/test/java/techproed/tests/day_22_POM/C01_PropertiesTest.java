package techproed.tests.day_22_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.FileNotFoundException;

public class C01_PropertiesTest {


    @Test
    public void test01() throws FileNotFoundException {

       String amazonUrl = ConfigReader.getProperty("amazonUrl");

        System.out.println(amazonUrl);

        Driver.getDriver().get(amazonUrl);

    }

    //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
    //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim login olalım
    //kullanici=Admin
    //kullaniciSifre=admin123
    //Login Testinin basarili oldugunu test edelim
    //sayfayı kapatalim
    @Test
    public void test02() throws InterruptedException, FileNotFoundException {

        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get(ConfigReader.getProperty("OpenSourceUrl"));

        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim login olalım
        //kullanici=Admin
        //kullaniciSifre=admin123
        OpenSourcePage openSourcePage = new OpenSourcePage();
        openSourcePage.userName.sendKeys(ConfigReader.getProperty("OpenSourceUserName"));
        openSourcePage.password.sendKeys(ConfigReader.getProperty("OpenSourcePassword"));
        openSourcePage.loginButton.click();

        Thread.sleep(2000);

        //Login Testinin basarili oldugunu test edelim
        Assert.assertTrue( openSourcePage.dashBoard.isDisplayed());

        //sayfayı kapatalim
        Driver.closeDriver();


    }


    @Test
    public void test03() throws FileNotFoundException, InterruptedException {


        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get(ConfigReader.getProperty("OpenSourceUrl"));

        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim login olalım
        //kullanici=Admin
        //kullaniciSifre=admin123
        OpenSourcePage openSourcePage = new OpenSourcePage();
        openSourcePage.userName.sendKeys(ConfigReader.getProperty("OpenSourceUserName"));
        openSourcePage.password.sendKeys(ConfigReader.getProperty("OpenSourcePassword"));
        openSourcePage.loginButton.click();

        ReusableMethods.visibleWait(openSourcePage.dashBoard,15);


        //Login Testinin basarili oldugunu test edelim
        Assert.assertTrue( openSourcePage.dashBoard.isDisplayed());
        ReusableMethods.screenShot("OpenSource");
        ReusableMethods.screenShotOfWebElement(openSourcePage.dashBoard);


        //sayfayı kapatalim
        Driver.closeDriver();

    }


}
