package com.yentar.structuralPatterns.classAdapter

object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        val employeeParser: JsonParser = EmployeeDataParser()
        println(employeeParser.parse())

        val companyParser: JsonParser = CompanyDataParser()
        println(companyParser.parse())

        val studentParser: JsonParser = StudentDataParserAdapter()
        println(studentParser.parse())
    }
}