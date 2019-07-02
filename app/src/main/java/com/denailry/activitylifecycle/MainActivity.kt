package com.denailry.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.denailry.activitylifecycle.loginhandler.CustomerHandler
import com.denailry.activitylifecycle.loginhandler.LoginHandler
import com.denailry.activitylifecycle.loginhandler.MerchantHandler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var loginHandler: LoginHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupClickListener()
        Log.d(Common.TAG_LIFECYLCE, "${javaClass.simpleName} + is created!")
        loginHandler = LoginHandler.new()
            .addHandler(CustomerHandler())
            .addHandler(MerchantHandler())
    }

    private fun setupClickListener() {
        buttonLogin.setOnClickListener{
            val username = formUsername.text.toString()
            val password = formPassword.text.toString()
            val account = loginHandler.handle(username, password)

            if (account != null) {
                val intent = Intent(applicationContext, HomeActivity::class.java)
                intent.putExtra("account", account.toString())
                startActivity(intent)

                Toast.makeText(applicationContext, "successfully logged in", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "oops... invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }
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
