package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProf1 = findViewById<Button>(R.id.btnProf1)
        val btnProf2 = findViewById<Button>(R.id.btnProf2)
        val btnProf3 = findViewById<Button>(R.id.btnProf3)
        val btnProf4 = findViewById<Button>(R.id.btnProf4)

        btnProf1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        btnProf2.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        btnProf3.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        btnProf4.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
    }
}