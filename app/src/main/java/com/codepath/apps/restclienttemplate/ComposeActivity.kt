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
               Toast.makeText(this,"Empty tweet not allowed", Toast.LENGTH_SHORT)
           }
            else if (tweetContent.length > 140)
           {
                Toast.makeText(this, "This tweeet is too long. The character limit is 140", Toast.LENGTH_SHORT)
           } else {
               Toast.makeText(this,tweetContent, Toast.LENGTH_SHORT)
           }





           }
        }
    }
