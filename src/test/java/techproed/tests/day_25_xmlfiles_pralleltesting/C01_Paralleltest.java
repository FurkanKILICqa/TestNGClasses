package techproed.tests.day_25_xmlfiles_pralleltesting;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.io.FileNotFoundException;

public class C01_Paralleltest {


    @Test
    public void test01() throws FileNotFoundException {

        Driver.getDriver().get(ConfigReader.getProperty("testCenterUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

    }

    @Test
    public void test02() throws FileNotFoundException {
        Driver.getDriver().get(ConfigReader.getProperty("testCenterUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

    }
}
