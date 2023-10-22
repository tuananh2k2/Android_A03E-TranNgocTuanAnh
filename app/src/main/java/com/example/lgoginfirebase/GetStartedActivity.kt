package com.example.lgoginfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lgoginfirebase.databinding.ActivityGetStartedBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class GetStartedActivity : AppCompatActivity() {
    private var binding:ActivityGetStartedBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetStartedBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.cvGetStarted?.setOnClickListener {
            startActivities(arrayOf(Intent(this,SignInActivity::class.java)))
            finish()
        }
        val auth = Firebase.auth
        if (auth.currentUser!= null)
        {
            startActivities(arrayOf(Intent(this,MainActivity::class.java)))
            finish()
        }

    }

}