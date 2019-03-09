package com.bibimcode.androidsample2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    companion object {
        val EXTRA_MESSAGE = "com.bibimcode.androidsample2.MESSAGE"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button  */
    fun sendMessage(view: View) {
        val intent = Intent(this, DisplayMessageActivity::class.java)
        val editText = findViewById<View>(R.id.editText) as EditText
        val message = editText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }
}
