package com.yentar.creationalPatterns.prototype;

public class Employee extends Worker {

    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public String getGepartment() {
        return "dep - 01";
    }

    @Override
    public Worker clone() {
        return new Employee(super.name, super.age);
    }
}
