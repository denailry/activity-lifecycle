package com.denailry.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.denailry.activitylifecycle.account.Account
import com.denailry.activitylifecycle.account.AccountFactory
import com.denailry.activitylifecycle.displayer.Displayer
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), Displayer.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val accountSchema = intent.getStringExtra("account") ?: ""
        val account = AccountFactory.create(accountSchema)

        display(account)

        Log.d(Common.TAG_LIFECYLCE, "${javaClass.simpleName} + is created!")
    }

    private fun display(account : Account?) {
        if (account != null) {
            Displayer.display(this, account)
        }
    }

    override fun setType(type: String) {
        textType.text = type
    }

    override fun setUsername(username: String) {
        textUsername.text = "Welcome, $username!"
    }

    override fun setOccupation(occupation: String?) {
        textOccupation.text = occupation ?: return
    }

    override fun setCity(city: String?) {
        textCity.text = city ?: return
    }

    override fun setPhone(phone: String?) {
        textPhone.text = phone ?: return
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
