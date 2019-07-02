package com.denailry.activitylifecycle.displayer

import com.denailry.activitylifecycle.account.Account
import com.denailry.activitylifecycle.account.AccountType

abstract class Displayer {
    interface View {
        fun setType(type: String)
        fun setUsername(username: String)
        fun setOccupation(occupation: String?)
        fun setCity(city: String?)
        fun setPhone(phone: String?)
    }

    companion object {
        private val displayers = arrayOf(
            CustomerDisplayer(),
            MerchantDisplayer()
        )

        fun display(view: View, account: Account) {
            when (account.type) {
                AccountType.CUSTOMER -> displayers[0].execute(view, account)
                AccountType.MERCHANT -> displayers[1].execute(view, account)
            }
        }
    }

    open fun execute(view: View, account: Account) {
        view.setType(account.type.toString())
        view.setUsername(account.username)
    }
}