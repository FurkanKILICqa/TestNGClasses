package techproed.tests.day_20_annotations_softassert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_SoftAssertion {

    //Normal assrtionda fail olunca durur soft assertionda ise bitene kadar çalıştırır
    //Softassertion u eğer genel bir sonucu almak istiyorsak kullanırız eğer hataları düzelte düzelte ilerlemek istiyorsak
    //hard assertion (junit de kullandığımız) kullanmalıyız
    @Test
    public void softAssertionTest() {

        //Öncelikle soft assert class ından bir object oluşturmalıyız bu obje Test NG den gelir
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(2,2,"2 == 2 ye bu kontrol başarılı");//Junit deki gibi önce accepted değil actual i ister

        softAssert.assertTrue(2>3,"2 3 ten büyük olmalıydı Bu kontrol başarısız");

        softAssert.assertFalse(3>2,"3, 2 den büyük olmamalıydı bu kontrol başarısız");


        softAssert.assertAll();//assertALL demezsek softassert çalışmaz hata var ise bu komttan sonraki komutlar çalışmaz

        //assertAll methodu kendisinden once yapilan tum soft assertion lari deegerlendirir,
        // eger herhangi bir method fali olduysa test basarisiz olur, ve classin kalan kismi calistirilmaz
        // bu method cagrilmazsa soft assertion basarisiz olup olmadigi anlasilamaz


        System.out.println("Bu kodu consolda görebilir miyim");

    }

    @Test
    public void hardAssertion() {

        System.out.println("bu kod hard assertion dan once ");

        Assert.assertTrue(false);

        System.out.println("bu kod hard assertion dan sonra ");


    }
}
