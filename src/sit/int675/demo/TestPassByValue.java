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
public class TestPassByValue {
    public static void main(String[] args) {
        int a = 5 , b = 3 ;
        swap(a, b);
        
        System.out.println("a = "+ a +",  b = "+ b);
        //------------------------------------
        Student st = new Student() ;
        System.out.println("id = "+ st.getId() + ", name = "+ st.getName()+ ", gpa = "+ st.getGpa());
        init(st) ;
        System.out.println("id = "+ st.getId() + ", name = "+ st.getName()+ ", gpa = "+ st.getGpa());
    }
    
    public static void swap (int a, int b) {
        int tmp = a ;
        a = b ;
        b =tmp ;
        System.out.println("swap method: a = "+ a +",  b = "+ b);
    }
    
    public static void init(Student x) {
        x.setId(100001);
        x.setName("Apirak");
        x.setGpa(3.95);
    }
}


