fun ContohList() {
    println("=== List ===")
    // List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // list Mutable
    val shape: MutableList<String> =
        mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    // Menghapus data dari List Mutable
    shape.remove(element = "Triangle")
    println(shape)

    // mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)

    // set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
    // set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
    // Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
    // Set Read-only menggunakan setOf
    // Set Mutable menggunakan mutable setOf

    fun ContohSet() {
        println()
        println("=== Set ===")

        // Set Read-Only
        val readOnlyAbjad = setOf("A", "B", "C")
        println(readOnlyAbjad)

        // Set Mutable
        val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
        println(shape)

        // Menambahkan data ke dalam set Mutable
        shape.add("Rectangle")
        println(shape)

        // Menghapus data dari Set Mutable
        shape.remove("Circle")
        println(shape)

        // Set Read-Only
        val shapesLocked: Set<String> = shape
        println(shapesLocked)
    }

}