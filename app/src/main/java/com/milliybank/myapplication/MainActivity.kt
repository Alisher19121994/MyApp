package com.milliybank.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.milliybank.myapplication.sharedPrefs.SharedManager

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {


        val sign_in_id = findViewById<Button>(R.id.sign_in_id)

        sign_in_id.setOnClickListener {

            val id = findViewById<EditText>(R.id.username_id)
            val token = findViewById<EditText>(R.id.password_id)
            val text = token.text.toString().trim()
            val getId = id.text.toString().trim()

            val sharedManager = SharedManager(this)
            sharedManager.saveToken(text)
            sharedManager.fetchData()
            sharedManager.saveId(getId.toInt())
            sharedManager.fetchId()
        }
    }
}