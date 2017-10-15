/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author INT675
 */
public class TestJFrame {
    public static void main(String[] args) {
        JFrame jf  = new JFrame("My First Window") ;
        jf.setSize(600, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel jpx = new JPanel() ;
        JPanel jpy = new JPanel() ;
        jf.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 10));
        //jf.setLayout(new GridLayout(2, 7, 20, 10));
        jpx.setLayout(new BoxLayout(jpx, BoxLayout.X_AXIS));
        jpy.setLayout(new BoxLayout(jpy, BoxLayout.Y_AXIS));
        
        JButton jbOk = new JButton("OK");
        JButton jbIgnore = new JButton("Ignore");
        JButton jbCancel = new JButton("Cancel");
        
        jpx.add(jbOk) ;
        jpx.add(jbIgnore) ;
        jpx.add(jbCancel) ;
        
        JButton jb1 = new JButton(" Button 1 ") ;
        JButton jb2 = new JButton(" Button 2 ") ;
        JButton jb3 = new JButton(" Button 3 ") ;
        
        jpy.add(jb1) ;
        jpy.add(jb2) ;
        jpy.add(jb3) ;
        
        jf.add(jpx) ;
        jf.add(jpy) ;
//        for (int i = 1; i < 10; i++) {
//            jf.add(new JButton(" "+ i + " "));
//        }
        
//        jf.add(jbOk, BorderLayout.CENTER);
//        jf.add(jbIgnore, "West");
//        jf.add(jbCancel, BorderLayout.EAST);
//        jf.add(new JTextField(), "North") ;

        jf.setVisible(true);
    }
    
}
