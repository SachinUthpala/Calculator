package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.calculator.Models.Calculator

class MainActivity : AppCompatActivity() {

    //define variables
    lateinit var edtNumber01:EditText
    lateinit var edtNumber02:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumber01 = findViewById(R.id.edtText01)
        edtNumber02 = findViewById(R.id.edtText02)
    }

    fun btnClick(v:View){
        var ans = 0.0

        val calculator = Calculator(
            edtNumber01.text.toString().toDouble(),
            edtNumber02.text.toString().toDouble()
        )

        when(v.id){

            R.id.btnAdd -> ans = calculator.add()
            R.id.btnSubs -> ans = calculator.substrac()
            R.id.btnMul -> ans = calculator.multipication()
            R.id.btnDivi -> ans = calculator.divide()

        }

        //make a toast massage
        Toast.makeText(this,"Answer = $ans",Toast.LENGTH_LONG).show()
    }
}