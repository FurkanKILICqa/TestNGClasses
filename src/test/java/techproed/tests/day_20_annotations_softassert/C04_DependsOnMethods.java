package techproed.tests.day_20_annotations_softassert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C04_DependsOnMethods {

    //TestNG de tum  @Test metotlar bitbirlerinden bagimsiz olarak calisirlar
    //    Eger methodlari bagimli hale getirmek istersem, dependsOnMethods parametresi kullanilir
    //    Burdaki ornekde, test02 methodu test01 methoduna bagimlidir
    //    test02 den once test01 calisir
    //    Eger test01 basarili ise test02 calisir.
    //    Eget test01 basarisiz ise, test02 IGNORE edilir
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Test
    public void test01() {







    }
}
