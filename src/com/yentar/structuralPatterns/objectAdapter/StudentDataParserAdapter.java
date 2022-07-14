package com.yentar.structuralPatterns.objectAdapter;

public class StudentDataParserAdapter implements JsonParser {
    private final StudentDataParser studentDataParser;

    public StudentDataParserAdapter(StudentDataParser studentDataParser) {
        this.studentDataParser = studentDataParser;
    }

    @Override
    public String parse() {
        String studentData = this.studentDataParser.getStudentData();
        return convertXml2Json(studentData);
    }

    private String convertXml2Json(String studentData) {
        //Assumption: studentData data was here converted.
        String result = "{" + "\n";
        result += "\t name: Oliver" + "\n";
        result += "\t age: 25" + "\n";
        result += "\t university: Hochschule Osnabrück" + "\n";
        result += "\t degree: Electrical Engineering (B.Sc.)" + "\n";
        result += "}";
        return result;
    }
}
