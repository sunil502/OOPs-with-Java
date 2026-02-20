package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DMLinsert {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC" );

        Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Users/Sunil/Desktop/OOPS/src/SQLite/univ.db" );

        Statement stm = con.createStatement();

        ResultSet rs = stm.executeQuery("select * from students" );

        stm.executeQuery("insert into dept values(60,'Chem')");

        stm.close();
        con.close();

    }
}