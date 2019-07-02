package com.denailry.activitylifecycle.account

class AccountFactory {
    companion object {
        fun create(accountSchema: String) : Account? {
            val attributes = accountSchema.split(";")
            return when (attributes[0]) {
                AccountType.CUSTOMER.toString() -> {
                    val customer = Customer(attributes[1], attributes[2])
                    customer.occupation = attributes[2]
                    customer
                }
                AccountType.MERCHANT.toString() -> {
                    val merchant = Merchant(attributes[1], attributes[2])
                    merchant.city = attributes[3]
                    merchant.phone = attributes[4]
                    merchant
                }
                else -> null
            }
        }
    }
}