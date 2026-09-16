package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btn1 = findViewById<TextView>(R.id.btn1)
        val btn2 = findViewById<TextView>(R.id.btn2)
        val btn3 = findViewById<TextView>(R.id.btn3)
        val btn4 = findViewById<TextView>(R.id.btn4)
        val btn5 = findViewById<TextView>(R.id.btn5)
        val btn6 = findViewById<TextView>(R.id.btn6)

        btn1.setOnClickListener {
            Toast.makeText(this, "Bạn chọn số 1", Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {
            Toast.makeText(this, "Bạn chọn số 2", Toast.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener {
            Toast.makeText(this, "Bạn chọn số 3", Toast.LENGTH_SHORT).show()
        }

        btn4.setOnClickListener {
            Toast.makeText(this, "Bạn chọn số 4", Toast.LENGTH_SHORT).show()
        }

        btn5.setOnClickListener {
            Toast.makeText(this, "Bạn chọn số 5", Toast.LENGTH_SHORT).show()
        }

        btn6.setOnClickListener {
            Toast.makeText(this, "Bạn chọn số 6", Toast.LENGTH_SHORT).show()
        }
    }
}