package com.denailry.activitylifecycle.account

class Merchant(username: String, password: String) : Account(username, password) {
    var city: String? = null
    var phone: String? = null
}