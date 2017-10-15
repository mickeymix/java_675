/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author INT675
 */
public class TestList {

    public static void main(String[] args) {
        int MAX = 1_000_000;
        Random r = new Random();
//        List aList = new ArrayList(1_002_000);
        List<Integer> aList = new LinkedList();
        
        
        for (int j = 0; j < 10; j++) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < MAX; i++) {
                aList.add(r.nextInt(1000));
            }

            for (int i = 0; i < 1000; i++) {
                aList.add(0, r.nextInt());
            }

            System.out.println("duration: " + (System.currentTimeMillis() - start) + " milliSeconds");

            int index = aList.indexOf(100);
            System.out.println("100 @ " + index);
            index = aList.indexOf(399);
            System.out.println("399 @ " + index);
            index = aList.indexOf(1220);
            System.out.println("1220 @ " + index);
            if (j != 9) {
                aList.clear();
            }
        }
//        Iterator it = aList.iterator() ;
//        int count = 1;
//        while(it.hasNext()) {
//            int  a = (int) it.next() ;
//            System.out.print(a + (count%100==0? "\n" : "\t"));
//            count++;
//        }
//        
        int count = 1;
        for (int object : aList) {
            System.out.print(object + (count % 100 == 0 ? "\n" : "\t"));
            count++;
        }
    }
}
