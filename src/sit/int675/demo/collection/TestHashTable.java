/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.collection;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author INT675
 */
public class TestHashTable {

    public static void main(String[] args) {
        String x[] = {"abce", "efg", "sommchai", "somsak", "somsri", "xyz", "main",
            "vmj", "jvm", "java", "php", "python", "IOT"};
        Set<String> xSet = new HashSet();

        for (String s : xSet) {
            System.out.println(s.hashCode() + " --> "+ hashIndex(s.hashCode()));
            xSet.add(s) ;
        }
        
    }
    
    static int hashIndex(int h) {
        int hash = h ^ (h>>>16) ;
        return 15 & hash ;
    }
}
