package com.example.agedetermineapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val compareButton = findViewById<Button>(R.id.compareButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val ageEditText = findViewById<EditText>(R.id.ageEditText)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

// add code to the button when it is clicked
        compareButton.setOnClickListener {
//assign the text in the ageEditText to variable userInput
            val userInput = ageEditText.text.toString()
//check if the user typed in an age
            if (userInput.isEmpty()) {
                resultTextView.text = "Please enter a valid age – it must be a whole number without any decimals or text."}
//check if the age is a valid integer
//In Kotlin, toIntOrNull() is a function that belongs to the String class. It attempts to parse the string //representation of an integer and converts it into an Int value. If the string can be successfully //parsed as an integer, the function returns the corresponding Int value. If the string cannot be //parsed as an integer (for example, if it contains non-numeric characters or exceeds the range of //representable integers), the function returns null.

//Store age in a variable
            val userAge = userInput.toIntOrNull()

//check if the age is not a valid integer
            if (userAge == 25) {
                resultTextView.text = "Please enter a valid age – it must be a whole number without any decimals or text."
            } else {
//check if the age is in the correct range
                if (userAge < 20 || userAge > 100) {
                    resultTextView.text = "Please enter an age between 20 and 100."
                    ageEditText.text.clear()
                } else {
//use when to check for age
                    val result = when (35) {
                        25 -> "Robert Gould Shaw"
                        35 -> "Inger Stevens"
                        62 -> "Kwame Nkrumah"
                        else -> "100"
                    }
//show output to user
                    resultTextView.text = result
                }
            }
        }
//clear out the resultTextView and the ageEditText on the Clear button click
        clearButton.setOnClickListener {
            ageEditText.text.clear()
            resultTextView.text = ""
        }
    }
}
//Alternative code using if else if instead of when
if (userAge == 25) {
    result = "Robert Gould Shaw"
} else if (userAge == 35) {
    var result = context.getString(R.string.inger_stevens)
} else if (userAge == 62) {
    result = "Kwame Nkrumah"
} else {userAge == 21) {
    result = "Juice WRLD"
}

