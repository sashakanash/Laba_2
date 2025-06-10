package com.example.laba_2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onClick (view: View)
    {
        val str = findViewById<TextView>(R.id.textInputEditText)

        val a = str.text.toString().toIntOrNull()?: 0
        val b = findViewById<TextView>(R.id.textView2)
        if (a == 0)
        {
            return
        }
        b.text = factorial(a).toString()
    }

    fun factorial (n: Int): Int{
        var result = 1

        for (i in 2..n)
        {
            result *= i
        }
        return result
    }
}