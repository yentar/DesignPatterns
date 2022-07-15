package com.yentar.structuralPatterns.classAdapter;

public class CompanyDataParser implements JsonParser {
    @Override
    public String parse() {
        String result = "{" + "\n";
        result += "\t name: Company ads" + "\n";
        result += "\t employess: 6540" + "\n";
        result += "\t place: Münster" + "\n";
        result += "}";
        return result;
    }
}
