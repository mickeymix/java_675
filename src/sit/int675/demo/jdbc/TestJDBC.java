/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author INT675
 */
public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String URL = "jdbc:derby://localhost:1527/sample" ;
        Class.forName("org.apache.derby.jdbc.ClientDriver") ;
        Connection conn = DriverManager.getConnection(URL, "app", "app") ;
        
        String sqlCmd = "select customer_id, name, zip, email from customer where name like ?" ;
        
        PreparedStatement pstm = conn.prepareStatement(sqlCmd) ;
        
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Search customer name like : ");
        String s = sc.next() ;
        
        pstm.setString(1, "%" + s + "%");
        
        ResultSet rs = pstm.executeQuery();
        
        System.out.println("  ID.. Name................................Zip.....Email........................");
        //System.out.println("---------------------------------------------------------");
        while(rs.next()) {
            System.out.printf("%5d  %-35s %-6s %s\n", 
                    rs.getInt(1), rs.getString("name"), rs.getString("zip"), rs.getString("email"));
        }
        System.out.println(".......................................................................................");
        rs.close();
        conn.setAutoCommit(false);
        pstm = conn.prepareStatement("update customer set name='Somchai' where customer_id >500");
        int count = pstm.executeUpdate();
        System.out.println(count + " record(s) done");
        //conn.rollback();
        conn.commit();
        conn.close();
        //System.out.println("Driver has been load !!");
    }
}
