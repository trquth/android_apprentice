package com.example.myapplication

import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName
    private lateinit var resultTxt: TextView;
    private lateinit var iosBtn: Button;
    private lateinit var androidBtn: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iosBtn = findViewById(R.id.iosBtnId)
        androidBtn = findViewById(R.id.androidBtnId)
        resultTxt = findViewById(R.id.resultTxtId)

        iosBtn.setOnClickListener { onIOSTap() }
        androidBtn.setOnClickListener { onAndroidTap() }

        Log.d(TAG, "onCreate call")

    }


    fun onAndroidTap() {
        // resultTxt.setText(getString(R.string.beginner_member,"Android"))
        Toast.makeText(this, getString(R.string.beginner_member, "Android"), Toast.LENGTH_LONG)
            .show()
    }

    fun onIOSTap() {
        //resultTxt.setText(getString(R.string.beginner_member,"IOS"))
        Toast.makeText(this, getString(R.string.beginner_member, "IOS"), Toast.LENGTH_LONG).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId === R.id.about_item) {
            showInfo()
        }
        return true;
    }

    private fun showInfo() {
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Hello")
        alert.setMessage("ANDROID APPRENTICE")
        alert.create().show()
    }

}