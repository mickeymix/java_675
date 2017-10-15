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
public class SimplePrimeFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.print("Enter integer number (0 to stop) : ");
            x = sc.nextInt();
            if (x != 0) {
                String isPrime = null;
                if (isPrime(x)) {
                    isPrime = x + " is prime number !";
                } else {
                    isPrime = x + " is NOT  primer number !";
                }
                System.out.println(isPrime);
            }
        } while (x != 0);

    }

    public static boolean isPrime(int x) {
        boolean result = x < 2  ? false : true ;
        for (int i = 2; i < x / 2 + 1; i++) {
            if (x % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
