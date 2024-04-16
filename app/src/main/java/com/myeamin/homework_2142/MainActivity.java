package com.myeamin.homework_2142;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * MainActivity class defines the behavior for an app that checks if a year
 * entered by the user is a leap year.
 */
public class MainActivity extends AppCompatActivity {

    // UI components
    EditText editTextYear;
    Button buttonCheck;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the UI components
        editTextYear = findViewById(R.id.editTextYear);
        buttonCheck = findViewById(R.id.buttonCheck);
        textViewResult = findViewById(R.id.textViewResult);

        // Set a click listener on the check button
        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the user input as a trimmed string
                String yearString = editTextYear.getText().toString().trim();

                // Check if the input string is empty
                if (yearString.isEmpty()) {
                    // If no input provided, display a request for input
                    textViewResult.setText("Please enter a year");
                } else {
                    // Parse the input string to an integer
                    int year = Integer.parseInt(yearString);

                    // Determine if the year is a leap year
                    if (year % 400 == 0) {
                        // If year is divisible by 400, it's a leap year
                        textViewResult.setText(year + " is a Leap Year");
                    } else if (year % 4 == 0 && year % 100 != 0) {
                        // If year is divisible by 4 and not divisible by 100, it's a leap year
                        textViewResult.setText(year + " is a Leap Year");
                    } else {
                        // Otherwise, it's not a leap year
                        textViewResult.setText(year + " is not a Leap Year");
                    }
                }
            }
        });
    }
}
