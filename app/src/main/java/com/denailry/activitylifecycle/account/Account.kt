package com.denailry.activitylifecycle.account

abstract class Account(val type: AccountType, val username: String, val password: String) {
    abstract override fun toString(): String
}