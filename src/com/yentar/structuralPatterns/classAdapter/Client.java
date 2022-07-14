package com.yentar.structuralPatterns.classAdapter;

public class Client {
    public static void main(String[] args) {
        JsonParser employeeParser = new EmployeeDataParser();
        System.out.println(employeeParser.parse());

        JsonParser companyParser = new CompanyDataParser();
        System.out.println(companyParser.parse());

        StudentDataParser studentDataParser = new StudentDataParser();
        JsonParser studentParser = new StudentDataParserAdapter(studentDataParser);
        System.out.println(studentParser.parse());
    }
}
