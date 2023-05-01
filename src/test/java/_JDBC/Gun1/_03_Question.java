package _JDBC.Gun1;

import _JDBC.JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_Question extends JDBC_Parent {
// city tablosundaki tüm kayıtlardaki isimleri next ile yazdırınız


    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select city from city");

        int rowCount = 0;

        while (rs.next()) {
            System.out.println(rs.getString("city"));
            rowCount++;
        }
        System.out.println("rowCount = " + rowCount);
    }

    @Test
    public void test2() throws SQLException {

        // TODO : city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız

        ResultSet rs = statement.executeQuery("select city from city");

        int rowCount = 1;

        while (rs.absolute(rowCount)) {

            System.out.println(rs.getString("city"));

            ++rowCount;
        }
        System.out.println(rowCount);

    }

    @Test
    public void test3() throws SQLException {

        // TODO : city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız

        ResultSet rs = statement.executeQuery("select city from city");

        int rowCount = 0;

        while (rs.relative(1)) {
            System.out.println(rs.getString("city"));
            rowCount++;
        }
        System.out.println(rowCount);
    }
}