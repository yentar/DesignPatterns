package com.yentar.structuralPatterns.classAdapter

class StudentDataParserAdapter : StudentDataParser(), JsonParser {
    override fun parse(): String {
        val studentData = super.studentData
        return convertXml2Json(studentData)
    }

    private fun convertXml2Json(studentData: String?): String {
        //Assumption: studentData data was here converted.
        var result = """
            {
            
            """.trimIndent()
        result += """	 name: Oliver
"""
        result += """	 age: 25
"""
        result += """	 university: Hochschule Osnabrück
"""
        result += """	 degree: Electrical Engineering (B.Sc.)
"""
        result += "}"
        return result
    }
}