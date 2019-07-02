package com.denailry.activitylifecycle.loginhandler

import com.denailry.activitylifecycle.account.Account
import com.denailry.activitylifecycle.account.Customer

class CustomerHandler : LoginHandler() {
    private val knownCustomers = arrayOf(
        arrayOf("daniel", "123456", "student"),
        arrayOf("ryan", "qwerty", "developer")
    )

    override fun handle(username: String, password: String): Account? {
        for (knownCustomer in knownCustomers) {
            if (knownCustomer[0] == username && knownCustomer[1] == password) {
                val customer = Customer(knownCustomer[0], knownCustomer[1])
                customer.occupation = knownCustomer[2]
                return customer
            }
        }

        return nextHandler?.handle(username, password)
    }
}