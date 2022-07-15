package com.yentar.structuralPatterns.classAdapter

class EmployeeDataParser : JsonParser {
    override fun parse(): String {
        var result = """
            {
            
            """.trimIndent()
        result += """	 name: Mehmet
"""
        result += """	 age: 99
"""
        result += "}"
        return result
    }
}