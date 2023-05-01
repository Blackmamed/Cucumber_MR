package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _07_NewExcelWrite {

    public static void main(String[] args) throws IOException {

        // hafızada workbook ve sheet ini oluşturucam
        XSSFWorkbook workbook = new XSSFWorkbook();
        // hafızada bir workbook oluşturuldu
        XSSFSheet sheet= workbook.createSheet("New Page");
        // içinde sheet oluşturdum

        // Hafızada işlemlere devam ediyorum
        Row newRow= sheet.createRow(0);
        Cell newCell = newRow.createCell(0);
        newCell.setCellValue("Hello XSSF");

        // path i verip yazdırma işlemi SAVE işlemi
        String path = "src/test/java/ApachePOI/resource/NewExcel.xlsx";
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("Writing prosess has started");

    }
}
