package techproed.tests.day_23_excel;

import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;

import java.io.FileNotFoundException;

public class C03_BlueRentalCarExcelTest {

    BlueRentalPage blueRentalPage;



    //sayfayi kapatalim




    @Test
    public void test01() throws FileNotFoundException {

        //BlueRentalCar sayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));


        //Excel dosyasindaki tum email ve passwordler ile login olalim ve login oldugumuzu dogrulayalim
        blueRentalPage=new BlueRentalPage();


        String classPath = "src\\test\\java\\techproed\\resources\\mysmoketestdata.xlsx";
        String pageName="customer_info";
        ExcelReader excelReader=new ExcelReader(classPath,pageName);

        for (int i = 1; i <= excelReader.rowCount(); i++) {


          String email =  excelReader.getCellData(i,0);
          String password = excelReader.getCellData(i,1);

            System.out.println(email+" "+password);

        }




    }
}
