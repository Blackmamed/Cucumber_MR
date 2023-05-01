package _JDBC.Gun1;

import _JDBC.JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLastGetRowgetType extends JDBC_Parent {

    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select city from city");

        rs.last();  // son setire gedir
        System.out.println("Son setir seher adi= "+ rs.getString(1));

        rs.first();  // ilk setire gedir
        System.out.println("Ilk setir seher adi = "+ rs.getString(1));

        rs.last();
        int whichRow = rs.getRow(); // necenci setirdeyim
        System.out.println("Necenci setirdeyim= "+ whichRow);

    }
}