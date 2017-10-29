/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo;

/**
 *
 * @author chaiyapong
 */
public class DexToHex {

    private static final String digitsHEXConStants = "0123456789ABCDEF";

    public static void main(String[] args) {
        for (int i = 0; i < 255; i++) {

            System.out.println(dexToHEX(i));
//            System.out.println(Integer.toHexString(i));
        }
    }

    private static String dexToHEX(int d) {

        if (d <= 0) {
            return "0";
        }
        int base = 16;
        String hex = "";
        while (d > 0) {
            int digit = d % base;
            hex = digitsHEXConStants.charAt(digit) + hex;
            d = d / base;
        }
        return hex.toLowerCase();
    }

}
