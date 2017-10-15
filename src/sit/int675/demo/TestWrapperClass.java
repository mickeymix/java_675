/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo;

/**
 *
 * @author INT675
 */
public class TestWrapperClass {

    public static void main(String[] args) {
        String x = "1547";
        int n = Integer.parseInt(x);
        System.out.println(n * 10);
        System.out.println(Integer.parseInt(x, 8));

        Integer a1 = new Integer(120);
        double y = a1.doubleValue();
    }

}
