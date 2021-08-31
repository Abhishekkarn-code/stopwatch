package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chronometer : Chronometer = findViewById(R.id.chronometer)
        val startups: ImageButton = findViewById(R.id.startBtn)
        val stop: ImageButton = findViewById(R.id.stopBtn)
        val button: Button = findViewById(R.id.button)
        startups.setOnClickListener{
            chronometer.start()
        }

        stop.setOnClickListener{
            chronometer.stop()
        }

        button.setOnClickListener{
            chronometer.setOnChronometerTickListener { SystemClock.elapsedRealtime()  }
        }
    }
}