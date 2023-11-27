package techproed.tests.day_21_POM;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class C01_DriverIlkTest {


    @Test
    public void test01() {

        Driver.getDriver().get("https://www.amazon.com.tr/");



    }
}
