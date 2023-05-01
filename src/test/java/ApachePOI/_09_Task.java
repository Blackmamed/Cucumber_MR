package ApachePOI;


import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _09_Task {

    /**
     * Kullanıcıdan istediği kolon sayısını aldıktan sonra
     * aşağıdaki excelin 2.Sheet inden istediği kadar kolon miktarını alarak
     * bir fonksyonda ArrayListe çevirerek mainden yazdırınız
     * src/test/java/ApachePOI/resource/ApacheExcel2.xlsx
     */

    public static void main(String[] args) {

        String patrh = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        String sheetName = "testCitizen";

        System.out.print("Enter the number columns you want= ");
        Scanner scan = new Scanner(System.in);
        int columnCount = scan.nextInt();

        ArrayList<ArrayList<String>> returnResult = getData(patrh, sheetName, columnCount);

        System.out.println("returnResult = " + returnResult);

    }

    public static ArrayList<ArrayList<String>> getData(String path, String sheetName, int colmCount) {

        ArrayList<ArrayList<String>> lists = new ArrayList<>();
        Sheet sheet = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            sheet = workbook.getSheet(sheetName);

        } catch (Exception ex) {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            ArrayList<String> row = new ArrayList<>();
            System.out.println(" = " );

            for (int j = 0; j < colmCount; j++) {
                row.add(sheet.getRow(i).getCell(j).toString());

            }
            lists.add(row);
        }

        return lists;
    }
}