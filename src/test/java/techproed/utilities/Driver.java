package techproed.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileNotFoundException;
import java.time.Duration;

public class Driver {

    private Driver() {



    }

    static WebDriver driver;
    public static WebDriver getDriver() throws FileNotFoundException {
        if(driver==null){
           switch (ConfigReader.getProperty("browser")){
                case "chrome" :
                    driver = new ChromeDriver();
                    break;

                case "edge" :
                    driver = new EdgeDriver();
                    break;
               default://else mantığı
                   driver=new ChromeDriver();//Eğer configiration class ıda pc de olmayan browser girer ve hata alırsak bu çalışacak
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){
            driver.close();
            driver=null;
        }

    }



/*
    Driver i her cagirdigimizda yeni bir pencere acmammasi icin bir if bloğu ile ayarlama yaptik
     if(driver==null) ile eger driver a deger atanmamis ise driver i baslat dedik, driver acik iken tekrar cagrilirsa
     driver a deger atanmis oldugu icin if block calismayacak ve dolayisiyla bu method mevcut driver i tekar return edecek
     Böylece ayni driver uzerinden test senaryolarimiza devam edebileceğiz
     */

    /*
    Page Object Model de driver icin TestBase classina extends yaparak kullanmak yerine Driver classi olusturularak bu classtan
    static method araciligi ile driver olusturup kullanmak tercih edilir
     */


/*
        POM de Driver classindan object olusturarak getDriver methodu kullanimini engellemeliyiz
        Bu nedenle singleton pattern kullanimi benimsenmistir
        Singleton Pattern : Bir classin farkli classlardan object olusturarak kullanilmasini engellemek icin kullanilir
        bu yüzden constructor i private yaptik
         */

}
