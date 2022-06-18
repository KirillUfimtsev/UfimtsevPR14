package com.example.ufimtsevpr14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun onClickStepsActivity3(view: View){
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }
    fun onClickStepsActivity4(view: View){
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }
    fun onClickStepsActivity5(view: View){
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }
    fun onClickStepsActivity6(view: View){
        val intent = Intent(this, MainActivity6::class.java)
        startActivity(intent)
    }
    fun onClickStepsActivity7(view: View){
        val intent = Intent(this, MainActivity7::class.java)
        startActivity(intent)
    }
}
