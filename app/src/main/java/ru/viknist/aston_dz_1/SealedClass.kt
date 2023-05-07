package ru.viknist.aston_dz_1

sealed class SealedClass {
    class First(val value: Int) : SealedClass()
    class Second(val value: String) : SealedClass()

    fun printSealed() =
        when(this){
            is First -> println("First : $value")
            is Second -> println("Second : $value")
        }
}
