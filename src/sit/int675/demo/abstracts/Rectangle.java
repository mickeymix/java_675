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
public class Rectangle extends Geometric  {
    int type = 100 ;
    private double width ;
    private double height ;

    public Rectangle() {
    }

    public Rectangle(double side) {
        this(side, side) ;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height ;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height) ;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
