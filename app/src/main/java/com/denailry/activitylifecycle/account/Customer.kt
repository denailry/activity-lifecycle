package com.denailry.activitylifecycle.account

class Customer(username: String, password: String) : Account(username, password) {
    var occupation: String? = null
}