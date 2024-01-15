package com.example.app111
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnDark = findViewById<Button>(R.id.darkBtn)
        btnDark.setOnClickListener {
            val intent= Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}