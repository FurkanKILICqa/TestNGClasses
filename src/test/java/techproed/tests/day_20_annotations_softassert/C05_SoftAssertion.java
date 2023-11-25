package techproed.tests.day_20_annotations_softassert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_SoftAssertion {


    @Test
    public void softAssertionTest() {

        //Öncelikle soft assert class ından bir object oluşturmalıyız bu obje Test NG den gelir
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(2,2);


    }
}
