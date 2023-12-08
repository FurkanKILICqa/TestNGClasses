package techproed.tests.day_22_POM;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed.pages.TestCenterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.FileNotFoundException;

public class C02_ClassWork {



    @Test
    public void test01() throws FileNotFoundException {

        //https://testcenter.techproeducation.com/index.php?page=form-authentication
        Driver.getDriver().get(ConfigReader.getProperty("testCenterUrl"));


        //Page object Model kullanarak sayfaya giriş yapildigini test edin
        TestCenterPage testCenterPage = new TestCenterPage();
       String userName = ConfigReader.getProperty("tech_test_username");
       String pass = ConfigReader.getProperty("tech_test_password");
       testCenterPage.userName.sendKeys(userName);
       testCenterPage.password.sendKeys(pass);
       testCenterPage.submitButton.click();


        ReusableMethods.visibleWait(testCenterPage.logout,15);
        SoftAssert softAssert1 = new SoftAssert();
        softAssert1.assertTrue(testCenterPage.logout.isDisplayed());

        //Sayfadan cikis yap ve cikis yapildigini test et
        SoftAssert softAssert = new SoftAssert();
        testCenterPage.logout.click();
        softAssert.assertEquals(Driver.getDriver().getTitle(),"Login");
        softAssert.assertAll();



        //sayfayı kapatınızfafadfadsf
        Driver.closeDriver();

    }

}
