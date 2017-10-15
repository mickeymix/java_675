/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.abstracts;

/**
 *
 * @author INT675
 */
public class TestAbstract {

    public static void main(String[] args) {
        //Geometric g = new Geometric();
        Circle c = new Circle(2.0);
        Rectangle r = new Rectangle(4.19, 3.0);
        if (c.compareTo(r) == 0) {
            System.out.println("Circle c is equals to Rectangle r");
        } else if (c.compareTo(r) > 0) {
            System.out.println("Circle c is bigger than Rectangle r");
        } else {
            System.out.println("Circle c is smaller than Rectangle r");
        }
        
        System.out.println("A".compareTo("B"));
        System.out.println("A".compareTo("C"));
        System.out.println("A".compareTo("D"));
        
        System.out.println("");
        printArea(c);
        System.out.println("--------------------");
        printArea(r);
        System.out.println("--------------------");
        Geometric x = r;
        System.out.println("Geometric :" + x.type);
        System.out.println("Rectangle : " + r.type);
        Double.valueOf("120D") ;
    }

    public static void printArea(Geometric g) {
        System.out.printf("Area = %10.2f \n", g.getArea());
        System.out.printf("Perimeter = %10.2f \n", g.getPerimeter());
    }
}
