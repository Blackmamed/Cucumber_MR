package Utilites;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.*;
import java.util.ArrayList;

public class DBUtility {

    public static Connection connection;
    public static Statement statement;

    public static ArrayList<ArrayList<String>> getListData(String sql) {

        DBConnectionOpen();

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
        DbConnectionClose();
        return tablo;
    }

    public static void DBConnectionOpen() {

        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        try {
            connection = DriverManager.
                    getConnection(hostUrl, username, password);
            statement = connection.createStatement();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void DbConnectionClose() {

        try {
            connection.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
