package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DMLprepared {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC" );

        Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Users/Sunil/Desktop/OOPS/src/SQLite/univ.db" );

        PreparedStatement stm = con.prepareStatement("insert into students values(?,?,?,?)");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student data:");
        int r=sc.nextInt();
        String name=sc.next();
        String city=sc.next();
        int dno= sc.nextInt();;


        stm.setInt(1,r);
        stm.setString(2,name);
        stm.setString(3,city);
        stm.setInt(4,dno);

        stm.executeUpdate();



        stm.close();
        con.close();

    }
}
