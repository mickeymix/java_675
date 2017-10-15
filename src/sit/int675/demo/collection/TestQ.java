/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.collection;

import java.util.LinkedList;

/**
 *
 * @author INT675
 */
public class TestQ {
    public static void main(String[] args) {
        LinkedList q = new LinkedList() ;
        q.offer("ACD") ;
        q.offer("BCD") ;
        q.offer("CCD") ;
        q.offer("DCD") ;
        q.offer("ECD") ;
        
        System.out.println(q.poll()) ;
        System.out.println(q.poll()) ;
        System.out.println(q.peek()) ; // stack + q
    }
    
}
