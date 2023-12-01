package techproed.tests.day_24_dataprovider_xmlfiles;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C01_DataProvider {


    @DataProvider
    public static Object[][] isimler() {
        return new Object[][]{

                {"mustafa"},{"Ibrahim"},{"furkan"},{"ali"}
        };
    }



    @Test(dataProvider = "isimler")
    public void test01(String data) {
        System.out.println(data);
    }

    @DataProvider
    public static Object[][] isimlervesoyisimler() {
        return new Object[][]{
                {"ali", "can"},{"veli" ,"can"},{"ahmet" ,"can"}
        };
    }


    @Test(dataProvider = "isimlervesoyisimler")
    public void test02(String isim,String soyisim) {

        System.out.println(isim+" "+soyisim);



    }
}
