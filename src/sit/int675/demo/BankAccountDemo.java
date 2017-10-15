/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import sit.int675.demo.model.BankAccount;
import sit.int675.demo.model.BankAccountException;

/**
 *
 * @author INT675
 */
public class BankAccountDemo {
    public static void main(String[] args)  {
        BankAccount[] x = loadData() ;
        for (BankAccount ba : x) {
            try {
                ba.withdraw(6000);
            } catch (BankAccountException ex) {
                System.err.println(ex);
            }
            System.out.println("Account Number: "+ ba.getAccountNumber());
            System.out.println("Account Name: "+ ba.getName());
            System.out.println("Balance: "+ ba.getBalance());
            System.out.println("-------------------------------\n");
        }
    }
    
    public static BankAccount[] loadData()  {
        BankAccount[] bas = new BankAccount[7] ;
        File f = new File("data.txt") ;
        Scanner sc = null;
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException ex) {
            System.err.println("File data.txt does not exist !!!");
            System.err.println(ex);
            return null ;
        }
        int index = 0 ;
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, ",");
            int id = Integer.parseInt(stk.nextToken()) ;
            String name = stk.nextToken() ;
            double balance = Double.parseDouble(stk.nextToken()) ;
            bas[index++] = new BankAccount(id, name, balance) ;
            //System.out.println(bas[index-1]);
        }
        sc.close();
        return bas ;
    }        
}
