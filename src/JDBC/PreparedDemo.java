package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedDemo {
    public static void main(String[] args) throws Exception{

        Class.forName("org.sqlite.JDBC");

        Connection con= DriverManager.getConnection("jdbc:sqlite:C:/Users/Sunil/Desktop/OOPS/src/SQLite/univ.db");

        java.sql.PreparedStatement stm =
                con.prepareStatement("select * from students where deptno=?");


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter dept number:");
        int dno=sc.nextInt();
        stm.setInt(1,dno);

        ResultSet rs = stm.executeQuery();


        while(rs.next()){
            System.out.print(rs.getInt("roll")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("city")+" ");
            System.out.println(rs.getInt(4)+" ");
        }
        stm.close();
        con.close();
    }
}
