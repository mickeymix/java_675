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
public class Manager extends Employee {

    private int bonus;

    public Manager() {
        super(9999, "Unknow");
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus=" + bonus + '}';
    }

    public Manager(int id, String name) {
        super(id, name);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getNetSalary() {
        double tax = (getSalary() + bonus) * 0.05;
        return (getSalary() + bonus) - tax;
    }

}
