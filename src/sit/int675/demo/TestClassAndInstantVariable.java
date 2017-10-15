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
public class TestClassAndInstantVariable {
    int number = 600 ;
    public static void main(String[] args) {
        System.out.println(Student.YEAR_ENTRY);
        Student x = new Student() ;
        Student y = new Student() ;
        x.setId(100001);
        y.YEAR_ENTRY = 2550 ;
        
        System.out.println(x.getId());
        System.out.println(x.getYEAR_ENTRY());
        //System.out.println("Number = "+ number);
    }
    
}

class Student  {
    public static int YEAR_ENTRY = 2560 ;
    private int id ;
    private String name ;
    private double gpa ;

    public static int getYEAR_ENTRY() {
        return YEAR_ENTRY;
    }

    public static void setYEAR_ENTRY(int YEAR_ENTRY) {
        Student.YEAR_ENTRY = YEAR_ENTRY;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    
}
