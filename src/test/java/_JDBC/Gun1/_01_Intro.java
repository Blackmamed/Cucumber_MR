package _JDBC.Gun1;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {

    @Test
    public void test1() throws SQLException {

        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        // connection acilir , fileInputstream
        Connection connection = DriverManager.getConnection(hostUrl, username, password);
        // 1- baglantiya click etdik.

        // 2- sorgulari isletmek sorgu sahesi
        Statement statement = connection.createStatement();

        // 3- sorgunun yazildi ve isletdim
        ResultSet resultSet = statement.executeQuery("select * from customer");

        resultSet.next();  // novbeti ilk setire getdi

        String firstName = resultSet.getString("first_name");
        String lastName = resultSet.getString("last_name");

        System.out.println("1-setirin musteri adi ve soydi= " + firstName + " " + lastName);


        resultSet.next();  // novbeti ilk setire getdi

        firstName = resultSet.getString("first_name");
        lastName = resultSet.getString("last_name");

        System.out.println("2-setirin musteri adi ve soydi= " + firstName + " " + lastName);

        resultSet.close();

    }
}
