package com.denailry.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onStart() {
        Log.d(Common.TAG_LIFECYLCE, "${javaClass.simpleName} + is started!")
        super.onStart()
    }

    override fun onResume() {
        Log.d(Common.TAG_LIFECYLCE, "${javaClass.simpleName} + is resumed!")
        super.onResume()
    }

    override fun onPause() {
        Log.d(Common.TAG_LIFECYLCE, "${javaClass.simpleName} + is paused!")
        super.onPause()
    }

    override fun onStop() {
        Log.d(Common.TAG_LIFECYLCE, "${javaClass.simpleName} + is stoped!")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(Common.TAG_LIFECYLCE, "${javaClass.simpleName} + is destroyed!")
        super.onDestroy()
    }
}
