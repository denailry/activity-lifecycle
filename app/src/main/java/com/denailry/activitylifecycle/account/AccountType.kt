package com.denailry.activitylifecycle.account

enum class AccountType {
    CUSTOMER {
        override fun toString(): String {
            return "customer"
        }
    },
    MERCHANT {
        override fun toString(): String {
            return "merchant"
        }
    }
}