package techproed.tests.day_20_annotations_softassert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_Priority {

    //Test NG de natural order a göre çalışır;
    //Eğer sıra belirtmek istiyorsak priority dememiz lazım
    //Eğer priority belirlemezsek otomatikmen olur

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }



    @Test(priority = -1)
    public void youtubeTest() {//Son çalışan Diğer testlerin priority si ootmatikmen 0 dır
        // bunu ilk çalıştırmak istediğimiz için 0 değeri verdik
        driver.get("https://www.youtube.com/");


    }


    @Test
    public void amazonTest() {//ilk çalışan

        driver.get("https://www.amazon.com/");


    }


    @Test
    public void facebookTest() {//ikinci çalışan

        driver.get("https://www.facebook.com/?locale=tr_TR");


    }



    @AfterMethod
    public void tearDown() {
        driver.quit();
    }



}
