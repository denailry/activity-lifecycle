package com.denailry.activitylifecycle.account

class Merchant(username: String, password: String) : Account(AccountType.MERCHANT, username, password) {
    var city: String? = null
    var phone: String? = null

    override fun toString(): String {
        return "$type;$username;$password;$city;$phone"
    }
}