package com.yentar.creationalPatterns.prototype;

public class Client {
    public static void main(String[] args) {
        Worker manager = new Manager("Ralph", 48);
        System.out.println(manager.getName());
        System.out.println(manager.getAge());
        System.out.println(manager.getName());

        Worker clonedManager = manager.clone();
        System.out.println(clonedManager.getName());
        System.out.println(clonedManager.getAge());
        System.out.println(clonedManager.getName());


    }
}
