package edu.up.cs301threadslab;

import java.util.ConcurrentModificationException;

public class StarAnimationThread extends Thread {
    private StarAnimation myStar;

    public StarAnimationThread(StarAnimation in) {
        myStar = in;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {

            } catch (ConcurrentModificationException e) {

            }
            double i = Math.random();
            if (i < 0.5) {
                myStar.addStar();
            } else {
                myStar.removeStar();
            }

        }
    }
}