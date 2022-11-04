package com.example.imgbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imgBtn1 = findViewById<ImageButton>(R.id.imageButton)
        var imgBtn2 = findViewById<ImageButton>(R.id.imageButton2)
        var imgBtn3 = findViewById<ImageButton>(R.id.imageButton3)
        var imgBtn4 = findViewById<ImageButton>(R.id.imageButton5)
        var imgBtn5 = findViewById<ImageButton>(R.id.imageButton6)
        imgBtn1.setOnClickListener {
            if(imgBtn1.alpha == 1f){
                imgBtn1.alpha = 0.5f
            }else{
                imgBtn1.alpha = 1f
            }
            Toast.makeText(this,"Chleb", Toast.LENGTH_SHORT).show()
        }
        imgBtn2.setOnClickListener {
            if(imgBtn2.alpha == 1f){
                imgBtn2.alpha = 0.5f
            }else{
                imgBtn2.alpha = 1f
            }
            Toast.makeText(this,"Świstak", Toast.LENGTH_SHORT).show()
        }
        imgBtn3.setOnClickListener {
            if(imgBtn3.alpha == 1f){
                imgBtn3.alpha = 0.5f
            }else{
                imgBtn3.alpha =1f
            }
            Toast.makeText(this,"Kevin", Toast.LENGTH_SHORT).show()
        }
        imgBtn4.setOnClickListener {
            if(imgBtn4.alpha == 1f){
                imgBtn4.alpha = 0.5f
            }else{
                imgBtn4.alpha = 1f
            }
            Toast.makeText(this,"Co on paczy?", Toast.LENGTH_SHORT).show()
        }
        imgBtn5.setOnClickListener {
            if(imgBtn5.alpha == 1f){
                imgBtn5.alpha = 0.5f
            }else{
                imgBtn5.alpha = 1f
            }
            Toast.makeText(this,"Supreme patriarch of the empire", Toast.LENGTH_SHORT).show()
        }

    }
}