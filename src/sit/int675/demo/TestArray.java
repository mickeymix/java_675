/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo;

import java.util.Scanner;

/**
 *
 * @author INT675
 */
public class TestArray {
    public static void main(String[] args) {
        
        Scanner  sc= new Scanner(System.in) ;
        System.out.print("Please enter integer number: ");
        int v = sc.nextInt() ;
        
        String result =  v%2==0 ? "Even number" : "Odd Number" ;
        
        System.out.println( v + " is "+ result);
        
        
        double  a1 = 3 + 5 / 2.0  * 3;
        System.out.println(a1);
        int x[] = new int[20] ;
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() *100) ;
        }
        
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] +( (i+1)%5==0 ? "\n" : "\t") );
        }
    }
}
