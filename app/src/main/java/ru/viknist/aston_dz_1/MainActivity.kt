package ru.viknist.aston_dz_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val info = Info("Mark")
        Toast.makeText(applicationContext, "Hello $info.name!", Toast.LENGTH_LONG).show()
    }
}