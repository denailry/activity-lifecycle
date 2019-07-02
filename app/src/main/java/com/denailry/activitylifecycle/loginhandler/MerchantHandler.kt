package com.denailry.activitylifecycle.loginhandler

import com.denailry.activitylifecycle.account.Account
import com.denailry.activitylifecycle.account.Customer
import com.denailry.activitylifecycle.account.Merchant

class MerchantHandler : LoginHandler() {
    private val knownMerchants = arrayOf(
        arrayOf("levyson", "123456", "bekasi", "363")
    )

    override fun handle(username: String, password: String): Account? {
        for (knownMerchant in knownMerchants) {
            if (knownMerchant[0] == username && knownMerchant[1] == password) {
                val merchant = Merchant(knownMerchant[0], knownMerchant[1])
                merchant.city = knownMerchant[2]
                merchant.phone = knownMerchant[3]
                return merchant
            }
        }

        return nextHandler?.handle(username, password)
    }
}