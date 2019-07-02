package com.denailry.activitylifecycle.displayer

import com.denailry.activitylifecycle.account.Account
import com.denailry.activitylifecycle.account.Merchant

class MerchantDisplayer : Displayer() {
    override fun execute(view: View, account: Account) {
        val merchant = account as Merchant

        view.setCity(merchant.city)
        view.setPhone(merchant.phone)

        super.execute(view, account)
    }
}