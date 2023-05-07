package ru.viknist.aston_dz_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Person("Alex", 21).run {
            Toast.makeText(applicationContext, "Hello ${this.name}!", Toast.LENGTH_LONG).show()
        }

        val first = SealedClass.First(1)
        val second = SealedClass.Second("Two")
        val list = mutableListOf(first, second)

        with(list) {
            println("Size is: ${this.size}")
            for (item in this) {
                item.printSealed()
            }
        }

        val sampleString = "Sample String"
        println(sampleString.let { it.uppercase().plus(" Addition") })

        val infoSecond = Person("Nick", 10)
        infoSecond.apply {
            println("Old name: $name  Old age: $age")
            name = "James"
            age = age.plus(3).also { println("${it - age} years has passed") }
            println("New name: $name  New age: $age")
        }

    }
}