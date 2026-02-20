package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DMLupdate {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC" );

        Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Users/Sunil/Desktop/OOPS/src/SQLite/univ.db" );

        Statement stm = con.createStatement();

        stm.executeQuery("update dept set dname='chem' where deptno=40");

        stm.close();
        con.close();

    }
}
