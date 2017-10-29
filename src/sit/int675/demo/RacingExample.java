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
public class RacingExample implements Runnable {

    private ShareCounter shareCounter = null;

    RacingExample(ShareCounter aThis) {
        this.shareCounter = aThis;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {

        while (true) {
            synchronized (shareCounter) {
                int count = shareCounter.getCounter();
                count++;
                shareCounter.setCounter(count);
            }

        }

    }

    public static void main(String[] args) {
        new ShareCounter();
    }

}

class ShareCounter {

    private int count;
    RacingExample r1;
    RacingExample r2;

    public ShareCounter() {
        r1 = new RacingExample(this);
        r2 = new RacingExample(this);
    }

    public void setCounter(int tmpCounter) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            System.out.println("sit.int675.demo.ShareCounter.setCounter()" + ex);

        }
        this.count = tmpCounter;
        System.out.println(count);

    }

    public int getCounter() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(ShareCounter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.count;
    }
}
