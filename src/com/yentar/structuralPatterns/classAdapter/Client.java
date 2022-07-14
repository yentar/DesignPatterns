package com.yentar.structuralPatterns.classAdapter;

public class Client {
    public static void main(String[] args) {
        JsonParser employeeParser = new EmployeeDataParser();
        System.out.println(employeeParser.parse());

        JsonParser companyParser = new CompanyDataParser();
        System.out.println(companyParser.parse());

        JsonParser studentParser = new StudentDataParserAdapter();
        System.out.println(studentParser.parse());
    }
}
