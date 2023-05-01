package _JDBC.Gun2;

import _JDBC.JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class _01_GetAllRowColumn extends JDBC_Parent {

    @Test
    public void test1() throws SQLException {

        ResultSet resultSet = statement.executeQuery("select * from language");
        // data+ metadata

        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        // Neticerin xaricindeki diger melumatler: kolon sayisi, adlari, tipleri

        int columnCount = resultSetMetaData.getColumnCount();
        System.out.println("columnCount = " + columnCount);

        for (int i = 1; i <= columnCount; i++) {

            System.out.print( resultSetMetaData.getColumnName(i)+" ");
           // System.out.println("\tColumn type= " + resultSetMetaData.getColumnTypeName(i));

        }

    }

    @Test
    public void test2() throws SQLException {

        // language tablosundaki tüm satırları ve tüm sütunları yazdırınız,
        // aynı mysql sonuç ekranında olduğu gibi

        ResultSet resultSet = statement.executeQuery("select * from language");

        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        // Neticerin xaricindeki diger melumatler: kolon sayisi, adlari, tipleri


        for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
            System.out.print(resultSetMetaData.getColumnName(i) + "\t");

        }
        System.out.println();

        while (resultSet.next()) {
            for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {

                System.out.print(resultSet.getString(i) + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void test3() throws SQLException {

        // bir metoda sorguyu("select * from language") gönderiniz,
        // metod size sorgunun datasını bir ArrayList olarak döndürsün

        String sql = "select * from language";

        ArrayList<ArrayList<String>> returnResult = getListData(sql);

        for (ArrayList<String> retString :returnResult)
        System.out.println( retString);

    }

    public ArrayList<ArrayList<String>> getListData(String sql) {

        ArrayList<ArrayList<String>> tablo = new ArrayList<>();

        try {


            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                ArrayList<String> row = new ArrayList<>();
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {

                    row.add(resultSet.getString(i));
                }
                tablo.add(row);
            }
        } catch (Exception ex) {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
        return tablo;
    }
}

