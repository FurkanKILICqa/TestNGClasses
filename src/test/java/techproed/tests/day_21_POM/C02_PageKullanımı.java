package techproed.tests.day_21_POM;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.utilities.Driver;

import java.io.FileNotFoundException;

public class C02_PageKullanımı {



    @Test
    public void test01() throws FileNotFoundException {
        //amazon sayfasina gidelim
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();


        //arama kutusunda iphone aratalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searcBox.sendKeys("iphone", Keys.ENTER);



    }
}
