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
public class AssertionDemo {

    public static void main(String[] args) {
        
        String x = getDayString(1);
        System.out.println(x);
        assert getDayString(1).equalsIgnoreCase("monday")  : 1;
        assert getDayString(2).equalsIgnoreCase("monday") : 2 ;
        assert getDayString(3).equalsIgnoreCase("tuesday") ;
        assert getDayString(4).equalsIgnoreCase("wednesday") ;

    }

    private static String getDayString(int day) {
        String dayString = null;
        switch (day) {
            case 1:
                dayString = "Sunday";
                break;
            case 2:
                dayString = "Monday";
                break;
            case 3:
                dayString = "Tuesday";
                break;
            case 4:
                dayString = "Wednesday";
                break;
            case 5:
                dayString = "Thursday";
                break;
            case 6:
                dayString = "Friday";
                break;
            case 7:
                dayString = "Saturday";
                break;

            default:
                assert false : day ;
            }
            return dayString ;
    }  
}
