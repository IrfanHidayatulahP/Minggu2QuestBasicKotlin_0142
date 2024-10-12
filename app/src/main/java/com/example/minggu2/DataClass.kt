package com.example.minggu2

// Data Class
// Data Class adalah class yang digunakan untuk menyimpan data.
// Data Class menyediakan fungsi untuk meng-override fungsi equals(), hashcode(), dan toString().
// Data Class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan

data class DataClass(
    val id: Int,
    var email: String
)

