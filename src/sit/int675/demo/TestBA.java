/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo;

import sit.int675.demo.model.BankAccount ;
/**
 *
 * @author INT675
 */
public class TestBA {
    public static void main(String[] args) {
        BankAccount baSomchai, baSomsri ;
         baSomchai = new BankAccount();
         baSomsri = new BankAccount();
         
         baSomchai.deposit(15000);
         baSomchai.setName("Somchai");
         baSomchai.setAccountNumber(100009);
         baSomchai.withdraw(11000) ;
    
         System.out.println(baSomchai.getAccountNumber());
         System.out.println(baSomchai.getName());
         System.out.println(baSomchai.getBalance());
         
         System.out.println("------------------------------------");
         
         System.out.println(baSomsri .getAccountNumber());
         System.out.println(baSomsri.getName());
         System.out.println(baSomsri.getBalance());
    }
    
}
