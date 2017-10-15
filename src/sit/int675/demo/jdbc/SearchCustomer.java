/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.jdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author INT675
 */
public class SearchCustomer {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in) ;
        do {
            System.out.print("Enter customer name (enter stop to quit): ");
            String str = sc.next() ;
            if (str.equalsIgnoreCase("stop")) {
                break ;
            }
            List<Customer> cs = Customer.findByName(str) ;
            if (cs == null) {
                System.out.println("Customer name like '"+ str + "' does not exist !!!");
            } else {
                displayCustomer(cs) ;
            }
        } while(true) ;
    }

    private static void displayCustomer(List<Customer> cs) {
        System.out.println("  ID.. Name................................Zip.....Email........................");
        for (Customer c : cs) {
            System.out.printf("%5d  %-35s %-6s %s\n", c.getCustomerId(), c.getName(), c.getZip(), c.getEmail());
        }
        System.out.println(".......................................................................................");
    }
}
