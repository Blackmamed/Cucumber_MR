package ApachePOI;

import Utilites.ExcelUtility;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _08_HW_Task1  {


/**  Soru 1:
 *  yeni excel (altalta.xls)
 *  Çarpım tablosunu excele yazdırınız.
 *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
 *  sıfırdan excel oluşturarak.
 *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata
 */

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Multiply Page");
        String path = "src/test/java/ApachePOI/resource/Multiply Table.xlsx";

        int num1;
        int num2;

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {

                Row newRow = sheet.createRow(sheet.getPhysicalNumberOfRows()+1);
                Cell newCell1 = newRow.createCell(0);
                num1 = i;
                newCell1.setCellValue(num1);

                Cell newCell2 = newRow.createCell(1);
                newCell2.setCellValue("*");

                Cell newCell3 = newRow.createCell(2);
                num2 = j;
                newCell3.setCellValue(num2);

                Cell newCell4 = newRow.createCell(3);
                newCell4.setCellValue("=");

                Cell newCell5 = newRow.createCell(4);
                newCell5.setCellValue(num1 * num2);
            }
            sheet.createRow(sheet.getPhysicalNumberOfRows()+1);
        }

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();
        System.out.println("Multiply prosess has finished");

    }


}
