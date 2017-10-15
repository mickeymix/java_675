/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author INT675
 */
public class TestSet {
    public static void main(String[] args) {
        Set<String> aSet = new TreeSet() ;
        Set<String> bSet = new HashSet() ;
        
        aSet.add("Somchai") ;
        aSet.add("Somchai") ;
        aSet.add("Somchai") ;
        aSet.add("Somsri") ;
        aSet.add("Somsak") ;
        aSet.add("xyz") ;
        
        bSet.add("Abcd") ;
        bSet.add("Kitisak") ;
        bSet.add("Kitichai") ;
        bSet.add("Kiti") ;
        bSet.add("Somsri") ;
        bSet.add("Somchai") ;
        
        // aSet.addAll(bSet) ;      // ---> Union
        //aSet.retainAll(bSet) ;   // ---> Intersection
        aSet.removeAll(bSet) ;  // ---> difference
        System.out.println(aSet);
        System.out.println(bSet);
        
    }
    
}
