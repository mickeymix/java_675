/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.model;

/**
 *
 * @author INT675
 */
public class BankAccount {
    private int accountNumber ;
    private String name ;
    private double balance ;

    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public BankAccount() {
    }
    
    
    
    public void deposit(double amount) throws BankAccountException {
        if (amount < 0) {
            throw new BankAccountException("Negative amount ("+  amount+ ")  !!!");
        }
        balance = balance + amount ;
    }
    
    public double withdraw(double amount) throws BankAccountException {
        if (amount > balance ) {
            throw new BankAccountException("Balance does not enough :  balance="
                    +balance + ", amout="+ amount+ " !!!");
        }
        double x = 0 ;
         balance = balance - amount ;
         x = amount ;
        return x;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + '}';
    }
    
}
