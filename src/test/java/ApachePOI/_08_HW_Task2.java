package ApachePOI;

import Utilites.ExcelUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileOutputStream;
import java.io.IOException;

public class _08_HW_Task2 extends ExcelUtility {

    /**
     * Soru 2:
     * yeni excel (yanyana.xls)
     * Çarpım tablosunu excele yazdırınız.
     * 1 x 1 = 1 şeklinde işaretleri de yazdırınız.
     * sıfırdan excel oluşturarak.
     * her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
     */

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Multiply Page");
        String path = "src/test/java/ApachePOI/resource/Multiply Table1.xlsx";

        int num1;
        int num2;
        int cellStep = 1;



        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {

                Row newRow = sheet.createRow(sheet.getPhysicalNumberOfRows() + 1);
                Cell newCell1 = newRow.createCell(cellStep);
                num1 = i;
                newCell1.setCellValue(num1);

                Cell newCell2 = newRow.createCell(1 + cellStep);
                newCell2.setCellValue("*");

                Cell newCell3 = newRow.createCell(2 + cellStep);
                num2 = j;
                newCell3.setCellValue(num2);

                Cell newCell4 = newRow.createCell(3 + cellStep);
                newCell4.setCellValue("=");

                Cell newCell5 = newRow.createCell(4 + cellStep);
                newCell5.setCellValue(num1 * num2);
            }
            sheet.removeRow(sheet.getRow(1));
            System.out.println(sheet.getPhysicalNumberOfRows());
            cellStep = cellStep + 6;

        }

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();
        System.out.println("Multiply prosess has finished");
    }


}

