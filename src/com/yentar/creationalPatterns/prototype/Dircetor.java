package com.yentar.creationalPatterns.prototype;

public class Dircetor extends Worker {

    public Dircetor(String name, int age) {
        super(name, age);
    }

    @Override
    public String getDepartment() {
        return "dep - 03";
    }

    @Override
    public Worker clone() {
        return new Dircetor(super.name, super.age);
    }
}
