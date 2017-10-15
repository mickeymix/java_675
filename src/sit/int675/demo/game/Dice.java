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
public class Dice {
    private final static int MAX_FACE = 6 ;
    private int face ;
    
    public Dice() {
        roll();
    }
    
    public void roll() {
        this.face = (int) (Math.random() * MAX_FACE + 1) ;
    }

    @Override
    public String toString() {
        return "Dice{" + "face=" + face + '}';
    }

    public int getFace() {
        return face;
    }
    
}
