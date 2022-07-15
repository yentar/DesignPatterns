package com.yentar.structuralPatterns.classAdapter

class CompanyDataParser : JsonParser {
    override fun parse(): String {
        var result = """
            {
            
            """.trimIndent()
        result += """	 name: Company ads
"""
        result += """	 employess: 6540
"""
        result += """	 place: Münster
"""
        result += "}"
        return result
    }
}