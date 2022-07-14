package com.yentar.structuralPatterns.classAdapter;

public class StudentDataParserAdapter implements JsonParser {
    private StudentDataParser studentDataParser;

    public StudentDataParserAdapter(StudentDataParser studentDataParser) {
        this.studentDataParser = studentDataParser;
    }

    @Override
    public String parse() {
        String studentData = this.studentDataParser.getStudentData();
        return convertXml2Json(studentData);
    }

    private String convertXml2Json(String studentData) {
        String result = studentData;
        result = "{" + "\n";
        result += "\t name: Oliver" + "\n";
        result += "\t age: 25" + "\n";
        result += "\t university: Hochschule Osnabrück" + "\n";
        result += "\t degree: Electrical Engineering (B.Sc.)" + "\n";
        result += "}";
        return result;
    }
}
