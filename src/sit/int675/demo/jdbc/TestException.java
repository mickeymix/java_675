/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.jdbc;

/**
 *
 * @author INT675
 */
public class TestException {
    
    private static boolean isNumber(String x) {
        try {
            Double.parseDouble(x) ;
            return true ;
        } catch (Exception e) {
        }
        return false ;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("1237"));
        System.out.println(isNumber("12 37"));
        System.out.println(isNumber("$1237"));
        System.out.println(isNumber("13.258"));
        
        f1();
        System.out.println("After call f1()");
    }

    static void f1() {
        f2();
        System.out.println("After call f2()");
    }

    static void f2() {
        int x = 100;
        int y = 6;
        try {
            y = x / y;
            String s = "ABCD";
            System.out.println(s.toString());
            System.out.println("`f2() done");
        } catch (ArithmeticException e) {
            System.err.println("divider is zero !!!");
        } catch (NullPointerException e) {
            System.err.println(e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("-----------------------------");
        }
    }
}
