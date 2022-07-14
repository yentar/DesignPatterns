package com.yentar.creationalPatterns.singleton.enumSingleton;

public class Client extends Thread {
    public static void main(String[] args) {
        new Client().start();
        new Client().start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            EnumSingleton.INSTANCE.inkrementValue();
        }
    }
}
