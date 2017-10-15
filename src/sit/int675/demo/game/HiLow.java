/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.game;

/**
 *
 * @author INT675
 */
public class HiLow {
    private Dice d1 ;
    private Dice d2 ;
    private Dice d3 ;
    
    public HiLow() {
        d1 = new Dice();
        d2 = new Dice();
        d3 = new Dice();
    }
    
    public void roll() {
        d1.roll();
        d2.roll();
        d3.roll();
    }

    public int getValue() {
        return d1.getFace() + d2.getFace() + d3.getFace() ;
    }
    
    public String getValueString() {
        int value = getValue() ;
        if (value > 11) {
            return "High" ;
        } else if (value < 11) {
            return "Low" ;
        }
        return "Hi-Low" ;
    }
    
    @Override
    public String toString() {
        return "d1: "+ d1.getFace() + ", d2: "+ d2.getFace() + ", d3: "+ d3.getFace() +
                "  ( "+ getValue() + " )  --> " + getValueString() ;
    }
    
    public Dice getD1() {
        return d1;
    }

    public Dice getD2() {
        return d2;
    }

    public Dice getD3() {
        return d3;
    }
    
}
