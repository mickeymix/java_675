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
public class TeatStackAndQueue {
    public static void main(String[] args) {
        
        System.out.println(Integer.toBinaryString(131));
        
        
        System.out.println("23 --> "+ decToBin(23));
        System.out.println("15 --> "+ decToBin(15));
        System.out.println("129 --> "+ decToBin(129));
        System.out.println("131 --> "+ decToBin(131));
        
        System.exit(0);
        
        LinkedList<String>  stack = new LinkedList() ;
        
        stack.push("ABCD");
        stack.push("XYZ");
        stack.push("MOI");
        stack.push("KMLN");
        stack.push("ZZZZ");
        stack.push("MMMM");
        
        System.out.println(stack.peek());
        System.out.println("----------------");
        while(! stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        
        
         LinkedList<String> q = new LinkedList() ;
        
        q.offer("ABCD");
        q.offer("XYZ");
        q.offer("MOI");
        q.offer("KMLN");
        q.offer("ZZZZ");
        q.offer("MMMM");
        
        System.out.println(q.peek());
        System.out.println("----------------");
        while(! q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
    
    
    static String decToBin(int dec) {
        LinkedList<String>  stack = new LinkedList() ;
        stack.push( ""+ dec%2);
        while(dec > 1) {
            dec = dec / 2 ;
            stack.push(""+ (dec%2)) ;
        }
        String x = "" ;
        while(!stack.isEmpty()) {
            x= x + stack.pop() ;
        }
        
        return x ;
    }
}
