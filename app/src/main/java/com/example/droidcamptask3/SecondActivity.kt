package com.example.droidcamptask3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent1 = intent
        val name1 = intent1.getStringExtra("name")
        textView.text = name1
        button.setOnClickListener {

            Toast.makeText(this, "Hello ${name1.substringBefore(delimiter = " ")}",
                Toast.LENGTH_SHORT).show()

        }
    }
}
