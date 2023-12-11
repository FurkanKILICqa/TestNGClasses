package techproed.tests.day_22_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.io.FileNotFoundException;

public class C03_PositiveLoginTest {

    //Uygulamayı geçerli veriler ile test etmeye positive test denir

    //Name: US100201_Admin_Login
    //Description:
    //Admin bilgileriyle giriş
    //Acceptance Criteria:
    //Admin olarak, uygulamaya giriş yapabilmeliyim
    //email : ada@ada.com
    //password: 12345
    //https://www.bluerentalcars.com/

    //Negatif seçenekleri pass boş bırakılabilir mail bıoş bırakılabilir mailde @ kullanılmaması hepsini boş bıraktığımızda
    //altta çıkması gereken uyarı mesajı görünürmü onları pass harf veya sayı miktarı min or max geçersiz mail
    @Test
    public void test01() throws FileNotFoundException {


        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        BlueRentalPage blueRentalPage=new BlueRentalPage();
        blueRentalPage.loginButton.click();

        blueRentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"));
        blueRentalPage.password.sendKeys(ConfigReader.getProperty("blueRentalPassword"), Keys.ENTER);

        Assert.assertTrue(blueRentalPage.loginVerify.getText().contains("Batch189"));
        System.out.println(blueRentalPage.loginVerify);
        Driver.closeDriver();





    }










}
