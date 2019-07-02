package com.denailry.activitylifecycle.displayer

import com.denailry.activitylifecycle.account.Account
import com.denailry.activitylifecycle.account.Customer

class CustomerDisplayer : Displayer() {
    override fun execute(view: View, account: Account) {
        val customer = account as Customer

        view.setOccupation(customer.occupation)

        super.execute(view, account)
    }
}