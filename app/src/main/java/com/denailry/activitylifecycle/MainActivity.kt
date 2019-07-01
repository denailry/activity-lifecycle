package com.denailry.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG_LIFECYLCE = "lifecycle"
        const val VALID_USERNAME = "daniel"
        const val VALID_PASSWORD = "qwerty"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupClickListener()
    }

    private fun setupClickListener() {
        btn_login.setOnClickListener{
            if (validCredential()) {
                Toast.makeText(applicationContext, "successfully logged in", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "oops... invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validCredential() : Boolean {
        val username = in_username.text.toString()
        val password = in_password.text.toString()
        return username == VALID_USERNAME && password == VALID_PASSWORD
     }

    override fun onStart() {
        Log.d(TAG_LIFECYLCE, "${javaClass.simpleName} + is started!")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG_LIFECYLCE, "${javaClass.simpleName} + is resumed!")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG_LIFECYLCE, "${javaClass.simpleName} + is paused!")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG_LIFECYLCE, "${javaClass.simpleName} + is stoped!")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG_LIFECYLCE, "${javaClass.simpleName} + is destroyed!")
        super.onDestroy()
    }
}
