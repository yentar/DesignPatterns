package com.yentar.structuralPatterns.classAdapter;

public class StudentDataParserAdapter extends StudentDataParser implements JsonParser {

    @Override
    public String parse() {
        String studentData = super.getStudentData();
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
