/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo;

/**
 *
 * @author INT675
 */
public class TestString {
    public static void main(String[] args) {
//        String s1 = new String("ABCD") ;
//        String s2 = new String ("ABCD") ;
        String s1 = "ABCD" ;
        String s2 = "ABCD" ;
        
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        
        StringBuilder buffer = new StringBuilder(20) ;
        //StringBuffer buffer = new StringBuffer(20) ;
        buffer.append("SIT") ;
        buffer.append("School of information technology") ;
        System.out.println(buffer);
        System.out.println(buffer.capacity());
        buffer.replace(13, 14, "I") ;
        buffer.replace(25, 26, "T") ;
        buffer.insert(3, ": ") ;
        System.out.println(buffer);
    }
    
}
