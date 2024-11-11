package com.sultanayubi.seekbarapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sultanayubi.seekbarlibrary.CustomSeekBarView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val customSeekBar = findViewById<CustomSeekBarView>(R.id.seekBar)

        customSeekBar.configureSegments(
            isMultipleCheck = true, // Set whether multiple segments should be checked
            segmentCheckValue = 10, // Set the segment check value
            totalEmployee = 100,    // Set the total number of employees
            presentEmployee = 50,   // Set the number of present employees
            absentEmployee = 20,    // Set the number of absent employees
            leaveEmployee = 15,     // Set the number of employees on leave
            lateEmployee = 15      // Set the number of late arrivals
        )

    }
}