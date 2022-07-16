package com.yentar.creationalPatterns.prototype;

public class Manager extends Worker {

    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public String getDepartment() {
        return "dep - 02";
    }

    @Override
    public Worker clone() {
        return new Manager(super.name, super.age);
    }
}
