package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DMLdelete {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC" );

        Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Users/Sunil/Desktop/OOPS/src/SQLite/univ.db" );

        Statement stm = con.createStatement();

        stm.executeQuery("delete from dept where deptno>=50");

        stm.close();
        con.close();

    }
}
