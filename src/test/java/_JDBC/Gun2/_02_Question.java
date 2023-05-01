package _JDBC.Gun2;

import Utilites.DBUtility;
import Utilites.ExcelUtility;
import _JDBC.JDBC_Parent;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class _02_Question extends JDBC_Parent {

    // TODO: DB den Actor tablosunu okuyarak, bir excele yazdırınız.

    @Test
    public void test1() throws SQLException, IOException {

        String sql = "select * from actor";
        String path = "src/test/java/ApachePOI/resource/JDBC_Task2.xlsx";

        ResultSet resultSet = statement.executeQuery(sql);
        ResultSetMetaData rsgmd = resultSet.getMetaData();
        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Actor tablo2");

        Row row = sheet.createRow(0);
        int rowCount = 0;

        for (int i = 1; i < rsgmd.getColumnCount(); i++) {

            System.out.printf("%-20s", rsgmd.getColumnName(i));
            row.createCell(rowCount).setCellValue(rsgmd.getColumnName(i));
            rowCount++;
        }
        System.out.println();

        rowCount = 1;
        int cellCount = 0;
        while (resultSet.next()) {

            row = sheet.createRow(rowCount);

            for (int i = 1; i < rsgmd.getColumnCount(); i++) {

                System.out.printf("%-20s", resultSet.getString(i));
                Cell cell = row.createCell(cellCount);
                cell.setCellValue(resultSet.getString(i));
                cellCount++; // cellin sayi burada 4 olur
            }
            cellCount = 0; // setir basina kecmek ucun sifir deyer veririk
            rowCount++;
            System.out.println();
        }
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }
}