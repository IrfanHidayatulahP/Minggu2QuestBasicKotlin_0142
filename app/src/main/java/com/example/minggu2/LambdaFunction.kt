package com.example.minggu2

// Lambda Functions
// Lambda Functions adalah fungsi yang tidak memiliki nama
// Lambda Functions biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda Functions menggunakan tandan panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String {
    return string.uppercase()
}

// Dapat ditulis dalam ekspresi lambda sbb :
fun main() {
    uppercaseString("Hello")
    println({string: String -> string.uppercase()} ("Hello"))
    // Hello
}