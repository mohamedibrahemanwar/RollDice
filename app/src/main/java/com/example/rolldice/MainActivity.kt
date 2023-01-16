package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.rolldice.R
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : Button = findViewById(R.id.btn)
        btn.setOnClickListener {
            Rolldice()
        }
    }

    private fun Rolldice() {
        val img : ImageView = findViewById(R.id.Roll)
        val randowm = Random().nextInt(6)+1
        val x = when(randowm){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        img.setImageResource(x)
    }
}