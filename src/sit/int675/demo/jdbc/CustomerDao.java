/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INT675
 */
public class CustomerDao {

    private static String FIND_BY_NAME = "select * from customer where lower(name) like ?";
    private static String FIND_BY_ID = "select * from customer where customer_id = ?";
    private static String NEW_CUSTOMER = "";
    private static String UPDATE_CUSTOMER = "update customer set name=?, email= ? where customer_id = ?";
    private static String DELETE_CUSTOMER = "";

    public static List<Customer> findByName(String key) {
        List<Customer> customers = null;
        Customer c = null;
        Connection conn = ConnectionBuilder.getConnection();
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement(FIND_BY_NAME);
            pstm.setString(1, key.toLowerCase() + "%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                c = new Customer(rs);
                if (customers == null) {
                    customers = new LinkedList();
                }
                customers.add(c);
            }
            conn.close();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return customers;
    }
    
    protected static boolean update(Customer c) throws SQLException{
         Connection conn = ConnectionBuilder.getConnection();
        PreparedStatement pstm;
         try {
            pstm = conn.prepareStatement(UPDATE_CUSTOMER);
            pstm.setString(1, c.getName());
            pstm.setString(2, c.getEmail());
            pstm.setInt(3, c.getCustomerId());
            pstm.executeUpdate();
            return true;
         }catch (SQLException e){
             e.printStackTrace();
         }finally{
             conn.close();
         }
        
        return false;
    }
}
