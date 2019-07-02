package com.denailry.activitylifecycle.account

class AccountFactory {
    enum class Type {
        CUSTOMER,
        MERCHANT
    }

    companion object {
        fun create(username: String, password: String, type: Type) : Account {
            return when (type) {
                Type.CUSTOMER -> Customer(username, password)
                Type.MERCHANT -> Merchant(username, password)
            }
        }
    }
}