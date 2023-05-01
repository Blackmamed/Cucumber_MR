package _JDBC.Gun2;

import _JDBC.JDBC_Parent;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_Question extends JDBC_Parent {

    //TODO  select first_name from actor where first_name like 'A%';

    @Test
    public void test1() throws SQLException, IOException {
        String sql = "select first_name from actor where first_name like 'A%';";
        String path = "src/test/java/ApachePOI/resource/JDBC_Task2.xlsx";
        String newPath = "src/test/java/ApachePOI/resource/JDBC_Task3.xlsx";

        ResultSet resultSet = statement.executeQuery(sql);
        ResultSetMetaData rsgmd = resultSet.getMetaData();

        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.createSheet("Actor tablo3");
        Row row = sheet.createRow(0);

        int rowCount = 0;
        for (int i = 1; i < rsgmd.getColumnCount(); i++) {

            System.out.printf("$-20s", rsgmd.getColumnName(i));
            row.createCell(rowCount).setCellValue(rsgmd.getColumnName(i));
            rowCount++;
        }
        System.out.println();
        rowCount = 1;

        int cellCount = 0;
        while (resultSet.next()) {
            row = sheet.createRow(rowCount);

            for (int i = 1; i <= rsgmd.getColumnCount(); i++) {
                System.out.printf("%-20s", resultSet.getString(i));
                Cell cell = row.createCell(cellCount);
                cell.setCellValue(resultSet.getString(i));
                cellCount++; // cellin sayi burada 4 olur
            }
            cellCount = 0; // setir basina kecmek ucun sifir deyer veririk
            rowCount++;
            System.out.println();
        }

        FileOutputStream outputStream = new FileOutputStream(newPath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }
}