/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author chaiyapong
 */
public class ExampleManyToLess {

    private static Integer[] a = {2, 6, 3, 5, 1};
    private static Integer[] b = {28, 9, 4, 99, 22};

    public static void main(String[] args) {
        Comparable[] merge = merge(a, b);
//        System.out.println();
        for (int i = 0; i < merge.length; i++) {
            Comparable comparable = merge[i];
            System.out.println(comparable.toString());

        }
    }

    public static Comparable[] mergeSort(Comparable[] a) {
        return new Comparable[a.length];
//		mergeSort(a, tmp,  0,  a.length - 1);
    }

    public static Comparable[] merge(Comparable[] array1, Comparable[] array2) {
        ///////////
        int j = 0, k = 0;
        Integer c[] = new Integer[array1.length + array2.length];
        for (int i = 0; i < c.length; i++) {
            // if both "a" and "b" have elements left to check
            if (j < a.length && k < b.length) {
                if (b[k] < a[j]) {
                    c[i] = b[k];
                    k++;
                } else {
                    c[i] = a[j];
                    j++;
                }
            } else if (k < b.length) {
                c[i] = b[k];
                k++;
            } else {
                c[i] = a[j];
                j++;
            }
        }
        /////////////
        Arrays.sort(c);
        
//        Comparable[] cCompare = c;
        return c;
    }
}
