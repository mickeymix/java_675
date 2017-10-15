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
public class CountLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your String: ");
        String str = sc.nextLine().toUpperCase() ;
        int[] count = new int[26] ;
        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i) ;
            if (ch>='A' && ch <= 'Z') {
                count[ch-65] ++ ;
            }
            //System.out.print(str.charAt(i) + ((i+1)%50==0 ? "\n" : "  "));
        }
        for(int i=0; i<count.length; i++) {
            System.out.println((char) (i+65) + " = "+ (count[i]>0 ? count[i] : " -"));
        }
    }
    
}
