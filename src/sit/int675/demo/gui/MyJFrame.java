/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.gui;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author INT675
 */
public class MyJFrame extends JFrame implements MouseMotionListener, ActionListener {
    JTextField jt1 = new JTextField(10);
    JTextField jt2 = new JTextField(10);
    JTextField jtResult = new JTextField(10);
    JButton jbOk = new JButton("Add")  ;
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double x = Double.parseDouble(jt1.getText());
            double y = Double.parseDouble(jt2.getText());
            jtResult.setText((x+y) + "") ;
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Invalid or Missing  number", "Error", JOptionPane.WARNING_MESSAGE) ;
        }
    }   
    
    public MyJFrame() throws HeadlessException {
        this.setTitle("Simple Window App");
        this.addMouseMotionListener(this);
        jt2.addActionListener(this);  // <------- register listener
        jt1.addActionListener(this);
        jbOk.addActionListener(this);
        this.setLayout(new GridLayout(4, 2));
        this.add(new JLabel("Operand 1 : ")) ;
        this.add(jt1) ;
        
        this.add(new JLabel("Operand 2 : ")) ;
        this.add(jt2) ;
        
        this.add(new JLabel("Result : ")) ;
        this.add(jtResult) ;
        jtResult.setEnabled(false);
        
        this.add(new JLabel("")) ;
        this.add(jbOk) ;
        
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        double x = e.getPoint().getX();
        double y = e.getPoint().getY();
        System.out.println(e.getModifiers());
        String button = (e.getModifiers()==16) ? "Left" : "Right" ;
        this.setTitle("Simple Window App: x="+x + ", y="+ y+ "("+ button+")" );
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        double x = e.getPoint().getX();
        double y = e.getPoint().getY();
        this.setTitle("Simple Window App: x="+x + ", y="+ y );
    }
    
    public static void main(String[] args) {
        new MyJFrame();
    }


}
