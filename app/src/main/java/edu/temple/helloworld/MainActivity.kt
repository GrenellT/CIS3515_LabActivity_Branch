package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var displayTextView: TextView
    lateinit var nameEditText: EditText
    lateinit var clickMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayTextView = findViewById(R.id.displayTextView)
        nameEditText = findViewById(R.id.nameEditText)
        clickMeButton = findViewById(R.id.clickMeButton)
        
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            val name = nameEditText.text.toString()
            if (name.isNotEmpty()) {
                displayTextView.text = "Hello, $name"
            } else {
                displayTextView.text = "Please enter your name"
            }
        }
    }
}