/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chaiyapong
 */
public class ThreadStuff {

    public static void main(String[] args) throws InterruptedException {
        MyThread mt1 = new MyThread("A");
        MyThread mt2 = new MyThread("B");
        MyThread mt3 = new MyThread("C");

        Thread t1 = new Thread(new MyRunable("33"));
        Thread t2 = new Thread(new MyRunable("dddd"));
        mt3.setPriority(1);
        mt2.setPriority(9);

        mt1.start();
        mt2.start();
        mt3.start();
        
        t1.start();
       t2.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main()");
            Thread.sleep((int) ((Math.random() * 200)));

        }

    }

}

class MyRunable implements Runnable {

    private String name;

    public MyRunable(String mName) {
        this.name = mName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MyRunable()");
            try {
                Thread.sleep((int) ((Math.random() * 200)));
            } catch (InterruptedException ex) {
                Logger.getLogger(MyRunable.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}

class MyThread extends Thread {

    public MyThread(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("run()" + this.getName());
        } //To change body of generated methods, choose Tools | Templates.
    }

}
