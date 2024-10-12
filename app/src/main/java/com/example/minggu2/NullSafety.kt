package com.example.minggu2

fun NullSafety() {
    // neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compiler error
    // neverNull = null

    //nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    // This is OK
    nullable = null

    // Check for null in Conditions
    if (neverNull == null) {
        println("inferredNonNull is Null")
    }
    else {
        println("InfferedNonNull is not Null")
    }
    // Safe call operator
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
}

fun main() {
    NullSafety()
}