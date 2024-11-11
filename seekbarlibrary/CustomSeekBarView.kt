package com.sultanayubi.seekbar

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatSeekBar

class CustomSeekBarView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatSeekBar(context, attrs, defStyleAttr) {

    // Properties for segment configuration
    private var isMultipleCheck: Boolean = false
    private var segmentCheckValue: Int = 0
    private var totalEmployee: Int = 100
    private var presentEmployee: Int = 0
    private var absentEmployee: Int = 0
    private var leaveEmployee: Int = 0
    private var lateEmployee: Int = 0

    init {
        // Apply default style and setup drawable on init if values are provided in XML
        setupSeekBarDrawable()
    }

    /**
     * Method to configure the segment values for the custom drawable
     */
    fun configureSegments(
        isMultipleCheck: Boolean,
        segmentCheckValue: Int,
        totalEmployee: Int,
        presentEmployee: Int,
        absentEmployee: Int,
        leaveEmployee: Int,
        lateEmployee: Int
    ) {
        // Assign the configuration values
        this.isMultipleCheck = isMultipleCheck
        this.segmentCheckValue = segmentCheckValue
        this.totalEmployee = totalEmployee
        this.presentEmployee = presentEmployee
        this.absentEmployee = absentEmployee
        this.leaveEmployee = leaveEmployee
        this.lateEmployee = lateEmployee

        // Reinitialize the drawable with the new values
        setupSeekBarDrawable()
    }

    /**
     * Initializes and applies the custom drawable based on segment configuration
     */
    private fun setupSeekBarDrawable() {
        // Calculate progress values based on segments
        val maxProgress = totalEmployee
        max = maxProgress

        val presentProgress = presentEmployee
        val absentProgress = presentProgress + absentEmployee
        val leaveProgress = absentProgress + leaveEmployee
        val lateArrivalProgress = leaveProgress + lateEmployee

        // Create and set the custom drawable with the required parameters
        val progressDrawable = CustomSeekBarProgressDrawable(
            isMultipleCheck,
            segmentCheckValue,
            context,
            maxProgress,
            presentProgress,
            absentProgress,
            leaveProgress,
            lateArrivalProgress
        )

        // Set the progress drawable to the seek bar
        this.progressDrawable = progressDrawable
    }
}
