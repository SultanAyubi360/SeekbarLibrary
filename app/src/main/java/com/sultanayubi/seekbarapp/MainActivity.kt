package com.sultanayubi.seekbarapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sultanayubi.seekbarapp.databinding.ActivityMainBinding
import com.sultanayubi.seekbarlibrary.CustomSeekBarView

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val customSeekBar = binding.seekBar

        customSeekBar.configureSegments(
            isMultipleCheck = true, // Set whether multiple segments should be checked
            segmentCheckValue = 10, // Set the segment check value
            totalEmployee = 100,    // Set the total number of employees
            presentEmployee = 50,   // Set the number of present employees
            absentEmployee = 20,    // Set the number of absent employees
            leaveEmployee = 15,     // Set the number of employees on leave
            lateEmployee = 15      // Set the number of late arrivals
        )

        binding.btnAll.setOnClickListener {
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


        binding.btnPresent.setOnClickListener {
            customSeekBar.configureSegments(
                isMultipleCheck = false, // Set whether multiple segments should be checked
                segmentCheckValue = 1, // Set the segment check value
                totalEmployee = 100,    // Set the total number of employees
                presentEmployee = 100,   // Set the number of present employees
                absentEmployee = 0,    // Set the number of absent employees
                leaveEmployee = 0,     // Set the number of employees on leave
                lateEmployee = 0      // Set the number of late arrivals
            )
        }

        binding.btnAbsent.setOnClickListener {
            customSeekBar.configureSegments(
                isMultipleCheck = false, // Set whether multiple segments should be checked
                segmentCheckValue = 1, // Set the segment check value
                totalEmployee = 100,    // Set the total number of employees
                presentEmployee = 0,   // Set the number of present employees
                absentEmployee = 100,    // Set the number of absent employees
                leaveEmployee = 0,     // Set the number of employees on leave
                lateEmployee = 0      // Set the number of late arrivals
            )
        }

        binding.btnLeave.setOnClickListener {
            customSeekBar.configureSegments(
                isMultipleCheck = false, // Set whether multiple segments should be checked
                segmentCheckValue = 1, // Set the segment check value
                totalEmployee = 100,    // Set the total number of employees
                presentEmployee = 0,   // Set the number of present employees
                absentEmployee = 0,    // Set the number of absent employees
                leaveEmployee = 100,     // Set the number of employees on leave
                lateEmployee = 0      // Set the number of late arrivals
            )
        }

        binding.btnLate.setOnClickListener {
            customSeekBar.configureSegments(
                isMultipleCheck = false, // Set whether multiple segments should be checked
                segmentCheckValue = 1, // Set the segment check value
                totalEmployee = 100,    // Set the total number of employees
                presentEmployee = 0,   // Set the number of present employees
                absentEmployee = 0,    // Set the number of absent employees
                leaveEmployee = 0,     // Set the number of employees on leave
                lateEmployee = 100      // Set the number of late arrivals
            )
        }

    }
}