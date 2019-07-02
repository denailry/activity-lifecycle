package com.denailry.activitylifecycle.account

class Customer(username: String, password: String) : Account(AccountType.CUSTOMER, username, password) {
    var occupation: String? = null

    override fun toString(): String {
        return "$type;$username;$password;$occupation"
    }
}