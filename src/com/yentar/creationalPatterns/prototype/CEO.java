package com.yentar.creationalPatterns.prototype;

public class CEO extends Worker {

    public CEO(String name, int age) {
        super(name, age);
    }

    @Override
    public String getDepartment() {
        return "dep - 04";
    }

    @Override
    public Worker clone() {
        return new CEO(super.name, super.age);
    }
}
