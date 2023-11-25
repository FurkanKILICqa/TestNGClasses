package techproed.tests.day_20_annotations_softassert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class C03_Ignore {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Test(priority = -1)
    @Ignore //artık bu method görmezden gelinecek
    public void youtubeTest() {
        driver.get("https://www.youtube.com/");


    }


    @Test(enabled = false)//artık bu method çalıştırılmayacak bunu yoruma almak gibi birşey (disabled gibi)
    public void amazonTest() {//ilk çalışan

        driver.get("https://www.amazon.com/");


    }


    @Test
    public void facebookTest() {
        driver.get("https://facebook.com");

        boolean excelDosyaYolu = false;
        if (excelDosyaYolu) {
            System.out.println("testleri calistir");
        } else {
            throw new SkipException("Excel dosyasi baglantisinda dosya bulunamadi");
        }

        /*
        Bu testte SkipException kullanarak testin calistirilmasini run time da dynamic olarak durdurabiliriz
        SkipException firlatildiginda test "Skipped" olarak isaretlenir
        dolayisiyla bu yöntem testin belirli kosullar altinda atlanmasi gerektiginde kullanilabilir
         */

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
