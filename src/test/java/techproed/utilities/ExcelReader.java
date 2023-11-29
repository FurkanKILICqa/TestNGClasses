package techproed.utilities;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {


    Workbook workbook;


    Sheet sheet;

    //Bu class dan obje oluşturulmasının amaco excel dosyası okumaktır
    //

    public ExcelReader (String dosyaYolu,String sayfaIsmi){


        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            workbook=WorkbookFactory.create(fis);
            workbook.getSheet(sayfaIsmi);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }









}
