package org.example.push;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int state) {
        System.out.println("********* OBS1 *******");
        System.out.println("State Value ="+ state);
        System.out.println("********* OBS1 *******");
    }
}
