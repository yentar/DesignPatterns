package com.yentar.structuralPatterns.classAdapter;

public class EmployeeDataParser implements JsonParser {

    @Override
    public String parse() {
        String result = "{" + "\n";
        result += "\t name: Mehmet" + "\n";
        result += "\t age: 99" + "\n";
        result += "}";
        return result;
    }
}
