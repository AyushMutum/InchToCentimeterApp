package com.example.inchtocentimeter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    private var inchToCentimeterValue = 2.54;
    private lateinit var editTextInput :EditText
    private lateinit var buttonConvert: Button
    private lateinit var textResultvalue: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        editTextInput = findViewById(R.id.editInput)
        buttonConvert = findViewById(R.id.convertBtn)
        textResultvalue = findViewById(R.id.resultValueText)

        buttonConvert.setOnClickListener {
            if(!editTextInput.text.toString().isEmpty()){
                val result = editTextInput.text.toString().toDouble() * inchToCentimeterValue
                textResultvalue.text = result.toString()
                textResultvalue.visibility = View.VISIBLE
            }
            else{
                textResultvalue.text = getString(R.string.message)
            }
        }

    }
}