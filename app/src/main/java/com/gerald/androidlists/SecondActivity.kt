package com.gerald.androidlists

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val txtName = findViewById<TextView>(R.id.txtGames)
        val txtPosition = findViewById<TextView>(R.id.txtPosition)

        val font =ResourcesCompat.getFont(this,R.font.edu)//customize font anf its location
        txtName.typeface=font //position use of font
        txtPosition.typeface=font


        val intent : Intent = intent
        val namePlayer = intent.getStringExtra("name")
        Log.d("CITY","$namePlayer")

        val position = intent.getIntExtra("position",0)
        txtName.text = namePlayer
        txtPosition.text = position.toString()

        val actionBar =supportActionBar
        actionBar!!.title = namePlayer
    }
}