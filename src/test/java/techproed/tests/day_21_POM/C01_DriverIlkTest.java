package techproed.tests.day_21_POM;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class C01_DriverIlkTest {


    @Test
    public void test01() {
        Driver.closeDriver();
        Driver.getDriver().get("https://www.amazon.com.tr/");
        Driver.getDriver().get("https://www.facebook.com/?locale=tr_TR");
        Driver.getDriver().get("https://www.google.co.uk/");



    }

    @Test
    public void test02() {
      //  Driver driver = new Driver();
//
      //  driver.getDriver().get("https://www.youtube.com/");
//




    }
}
