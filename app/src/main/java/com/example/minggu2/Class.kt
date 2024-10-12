package com.example.minggu2

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gamil.com")

    //prints the value of the property: email
    println(contact.email)

    //update the value of the property: email
    contact.email = "jane@gmail.com"

    // Prints the new value of the property: email
    println(contact.email)
}