package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcel {

    public static void main(String[] args) throws IOException {

        //once exceli acarim, sheete catarim
        // deyisenleri elave ederim(yaddasda)
        // yazma modunu acib, yaddasdaki yazilini
        // save ederim

        String path ="src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";

        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet= workbook.getSheetAt(0);

        // Yaddasda emeliyyatlara davam edirem

        Row newRow= sheet.createRow(sheet.getPhysicalNumberOfRows());
        Cell newCell= newRow.createCell(0);
        newCell.setCellValue("Hello ApachePOI");

        // novbe save e geldi, amma once okuma modunda cixib
        // Yazma Modun kecek
        inputStream.close();// okuma Modu baglandi

        // Yazma Modu acdim

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream); // Save olundu
        workbook.close();// Ram i bosalt
        outputStream.close(); // yaddasi bosalt

        System.out.println("Writing prosess has started");


    }
}
