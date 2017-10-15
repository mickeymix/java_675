/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo;

import java.util.Scanner;
import static sit.int675.demo.SimplePrimeFinder.isPrime;

/**
 *
 * @author INT675
 */
public class MaxMin {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x ;
        int numbers[] ;
        do {
            System.out.print("Size of array : ");
            x = sc.nextInt();
            if (x > 0) {
                numbers = new int[x] ;
                initial(numbers);
                int minPos = findMin(numbers) ;
                int maxPos = findMax(numbers) ;
                System.out.println("Minimum number is "+ numbers[minPos] +
                        ",  at index "+ minPos);
                System.out.println("Maximum number is "+ numbers[maxPos] +
                        ",  at index "+ maxPos);
                System.out.println("-------------------------------------");
                printArray(numbers);
            }
        } while (x != 0);

    }
        
     public static int findMax(int[]  x) {
         int maxPos =  0 ;
         for (int i=1; i<x.length; i++) {
             if (x[i] > x[maxPos]) {
                 maxPos = i ;
             }
         }
         return maxPos ;
     }

     public static int findMin(int[]  x) {
         int minPos =  0 ;
         for (int i=1; i<x.length; i++) {
             if (x[i] < x[minPos]) {
                 minPos = i ;
             }
         }
         return minPos ;
     }
     
     public static void initial(int[] x) {
         for(int i=0; i<x.length ; i++) {
             x[i] = (int) (Math.random()*100+ 1);
         }
     }
     
     public static void printArray(int[] x) {
         int count = 1;
         for(int n : x) {
             System.out.print(n +  
                     (count++%10==0 ? "\n" : "\t"));
         }
     }
}
