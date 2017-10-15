/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.game;

import java.util.Scanner;

/**
 *
 * @author INT675
 */
public class TestHiLow {

    public static void main(String[] args) {
        HiLow h1 = new HiLow();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your guess number (3 to 18, 0 to Exit: ");
            int n = sc.nextInt();
            if (n <= 0) {
                break;
            }
            h1.roll();
            System.out.println("-----------------------------");
            System.out.println(h1);
            System.out.println("-----------------------------");
            if (n == h1.getValue()) {
                System.out.println("Congratulation YOU WIN !!!");
            } else {
                System.out.println("Sorry..  YOU LOSS .. try again");
            }

        }
    }
}
