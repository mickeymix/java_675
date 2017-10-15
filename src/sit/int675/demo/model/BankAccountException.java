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
public class BankAccountException extends Exception {

    public BankAccountException(String message) {
        super(message);
    }
    
    public BankAccountException() {
        super("BankAccountException: Unknow message !!!") ;
    }
    
}
