package _JDBC.Gun1;

import _JDBC.JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRel extends JDBC_Parent {

    @Test
    public void nextPrev() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from language");

        rs.next(); // birinci satir
        System.out.println("1 setir dil adi= " + rs.getString(2));// burada 2 column sirasi

        rs.next(); // ikinci satir
        System.out.println("2 setir dil adi= " + rs.getString(2));

        rs.next(); // ikinci satir
        System.out.println("2 setir dil adi= " + rs.getString(2));


    }

    @Test
    public void absoluteRelative() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from film");

        // rs.next();  sonraki satir
        // rs.previous(); onceki satir
        // rs.absolute(12); // basdan baslayib 12 setire gedir
        // rs.absolute(-12); // sondan baslayib 12 setir geriye gedir gedir
        // rs.relative(14); // oldugu yerden  14 setir gedir

        rs.absolute(12); // basdan baslayib 12 setire gedir
        System.out.println("12 satir title= "+ rs.getString("title"));

        rs.relative(14); // 26 setire getdi
        System.out.println("26 satir title= "+ rs.getString("title"));

        rs.relative(-6);
        System.out.println("20 satir title= "+ rs.getString("title"));

    }

}
