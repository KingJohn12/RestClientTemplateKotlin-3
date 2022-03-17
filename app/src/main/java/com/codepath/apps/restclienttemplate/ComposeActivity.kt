package com.codepath.apps.restclienttemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.codepath.apps.restclienttemplate.models.Tweet

class ComposeActivity : AppCompatActivity() {

    lateinit var etCompose: EditText
    lateinit var btnTweet: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compose)


        etCompose = findViewById(R.id.etComposeTweet)
        btnTweet = findViewById(R.id.btnTweet)


        btnTweet.setOnClickListener {

            val tweetContent = etCompose.text.toString()

            if(tweetContent.isEmpty())
            {
                Toast.makeText(this, "Empty tweets not allowed", Toast.LENGTH_SHORT).show()
            }
            else
            if(tweetContent.length > 140)
            {
                Toast.makeText(this,"The Tweet is way too long!!!! Length is 140 characters", Toast.LENGTH_SHORT).show()
            }

            else {
                Toast.makeText(this, tweetContent, Toast.LENGTH_SHORT).show()
            }

        }
    }
}