package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

import java.util.Scanner;

public class _05_GetASpecificData {

    /**
     * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
     * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
     * yani metoda "password" kelimesi gönderilecek, dönen değer password un değeri olacak.
     * bulup ve sonucun döndürülmesi için metod kullanınız.
     * src/test/java/ApachePOI/resources/LoginData.xlsx
     */

    public static void main(String[] args) {

        System.out.print("Enter search word= ");

        Scanner scan = new Scanner(System.in);
        String searchWord = scan.next();
        String returnResult = foundExcel(searchWord);
        System.out.println("returnResult = " + returnResult);
    }

    public static String foundExcel(String found) {
        String willReturn = "";
        //excelden okuma işlemleri
        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";

        Sheet sheet = null;

        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheetAt(0);
        } catch (Exception e) {

        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(found)) ;

            for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {

                willReturn += sheet.getRow(i).getCell(j) + " ";

            }
        }

        return willReturn;
    }
}
