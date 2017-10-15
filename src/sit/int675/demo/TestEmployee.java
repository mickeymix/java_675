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
public class TestEmployee {
    public static void main(String[] args) {
        
        Manager m = new Manager();
        Employee e = m ; 
        Object x = m ;
        
        System.out.println(m.toString()) ;
      
      Employee e1 = new Employee(10001, "Somchai", 10000);
      Employee  m2 = new Manager();
      
      

      m2.setName("Somchai");
      m2.setSalary(10_000);

      ((Manager) m2).setBonus(10_000);
        
        System.out.println(e1.getNetSalary());
        System.out.println(m2.getNetSalary());
    }
    
}
