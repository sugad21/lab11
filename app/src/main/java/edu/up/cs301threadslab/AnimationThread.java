package edu.up.cs301threadslab;


public class AnimationThread extends Thread {

    private AnimationView myAv;

    public AnimationThread(AnimationView in) {
        myAv = in;
    }

    @Override
    public void run() {

            while (true) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {

                }
                myAv.postInvalidate();
            }

    }
}
