package com.example.lesson7month5

import androidx.core.text.isDigitsOnly

class Math {
    val integarChars = '0'..'9'

    fun add(a:String, b:String): String{
        var result = ""
        if (a.isInteger() && b.isInteger()){
            result = (a.toInt() + b.toInt()).toString()
        }
        else if (a.contains(".")|| b.contains(".")){
            result = (a.toDouble() + b.toDouble()).toString()
        }
        else{
            result = "вы обязаны ввести числа"
        }
        return result
    }

    fun devide(a:String, b:String): String{
        var result = ""
        if (a.isInteger() && b.isInteger() && b !="0"){
            result = (a.toDouble() / b.toDouble()).toString()
        }
        else if (result.contains(".")){
            result = (a.toDouble() + b.toDouble()).toString()
        }
        else if (a.contains(".")|| b.contains(".")){
            result = (a.toDouble() + b.toDouble()).toString()
        }
        else if (b =="0"){
            result = "на ноль делить нельзя"
        }
        else{
            result = "вы обязаны ввести числа"
        }
        return result
    }


    fun String.isInteger() = this.toIntOrNull()?.let { true } ?:false


}