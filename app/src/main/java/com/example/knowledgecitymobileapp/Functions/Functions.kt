package com.example.knowledgecitymobileapp.Functions

import java.util.regex.Pattern

class Functions {

    fun validateFirstName(dataFName: String): Boolean{
        return dataFName.matches(".*[a-z].*".toRegex()) && dataFName.length > 2 && dataFName.length <= 15
    }

    fun validateMiddleName(dataMName: String): Boolean{
        return dataMName.matches(".*[a-z].*".toRegex()) && dataMName.length > 2
    }

    fun validateSurName(dataSName: String): Boolean{
        return dataSName.matches(".*[a-z].*".toRegex()) && dataSName.length > 2
    }

    fun validateEmail(dataEmail: String): Boolean{
        return dataEmail.matches("^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})".toRegex())
    }

    fun validatePhoneNumber(dataPhoneNumber: String): Boolean{
        val myPhoneValidator: Pattern = Pattern.compile("^(0|\\+234)\\d{10}\$")
        return myPhoneValidator.matcher(dataPhoneNumber).matches()
    }

    fun validatePassword(dataPass: String): Boolean{
        return true
    }
}