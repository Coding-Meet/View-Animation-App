package com.example.viewanimationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // all animation file in github account



        // here all animation button setOnClickListener
        val image = findViewById<ImageView>(R.id.imageView)
        findViewById<Button>(R.id.blinkBtn).setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.blink_anim)
            // imageView set animation
            image.startAnimation(animation)
        }

        findViewById<Button>(R.id.bounceBtn).setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce_anim)
            image.startAnimation(animation)
            image.startAnimation(animation)
        }

        findViewById<Button>(R.id.fadeInBtn).setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in_anim)
            image.startAnimation(animation)
        }

        findViewById<Button>(R.id.fadeOutBtn).setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_out_anim)
            image.startAnimation(animation)
        }

        findViewById<Button>(R.id.moveBtn).setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.move_anim)
            image.startAnimation(animation)
        }

        findViewById<Button>(R.id.rotateBtn).setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim)
            image.startAnimation(animation)
        }

        findViewById<Button>(R.id.sequentialBtn).setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.sequential_anim)
            image.startAnimation(animation)
        }

        findViewById<Button>(R.id.slideDownBtn).setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_down_anim)
            image.startAnimation(animation)
        }

        findViewById<Button>(R.id.slideUpBtn).setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_up_anim)
            image.startAnimation(animation)
        }

        findViewById<Button>(R.id.togetherBtn).setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.together_anim)
            image.startAnimation(animation)
        }

        findViewById<Button>(R.id.zoomInBtn).setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in_anim)
            image.startAnimation(animation)
        }

        findViewById<Button>(R.id.zoomOutBtn).setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_out_anim)
            image.startAnimation(animation)
        }
    }
}