package techproed.tests.day_20_annotations_softassert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class C04_DependsOnMethods {

    //TestNG de tum  @Test metotlar bitbirlerinden bagimsiz olarak calisirlar
    //    Eger methodlari bagimli hale getirmek istersem, dependsOnMethods parametresi kullanilir
    //    Burdaki ornekde, test02 methodu test01 methoduna bagimlidir
    //    test02 den once test01 calisir
    //    Eger test01 basarili ise test02 calisir.
    //    Eget test01 basarisiz ise, test02 IGNORE edilir

    /*
        Test NG de DependsOnMethods ozelligini kullanarak bazi testlerin bagimli oldugu
        diger testlerin basarili olmasi durumuna göre calistirabilirsiniz
        DependsOnMethods baglandigi testin sonucuna bakar, passed olursa calisir fail olursa hic calismaz
     */
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Test
    public void test01() {

        //amazon sayfasina gidiniz
        driver.get("https://amazon.com");

        //arama kutusunda iphone aratiniz
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone");
        searchBox.submit();
        Assert.assertEquals(2,3);//Bilerek hata aldık


    }

    @Test(dependsOnMethods = "test01")
    public void test02() {

        //sonuc yazisinin iphone icerdigini test edelim
        String sonucYazisi =driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]")).getText();
        Assert.assertTrue(sonucYazisi.contains("iphone"));

    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
