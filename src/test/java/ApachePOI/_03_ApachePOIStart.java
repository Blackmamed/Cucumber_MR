package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _03_ApachePOIStart {

    public static void main(String[] args) throws IOException {

        // dosyanin yolunu deyiskene atalim

        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        // JavaDosya okuma işlemcisine dosyanın yolunu veriyoruz:
        // böylece program ile dosya arasında bağlantı oluştu
        FileInputStream fileInputStream = new FileInputStream(path);

        //Dosya okuma işlemcisi üzerinden Çalışma Kitabını alıyorum
        // hafızada workbook u alıp oluşturdu
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        //istediğim isimdeki çalışma sayfasını alıyorum
        Sheet worksheet = workbook.getSheet("Sheet1");  // getSheetAt(0);

        //istenen Satırı alıyorum

        Row row = worksheet.getRow(0);

        Cell cell = row.getCell(0);

        System.out.println(cell);


    }
}
