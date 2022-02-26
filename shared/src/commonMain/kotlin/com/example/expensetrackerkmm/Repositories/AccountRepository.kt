package com.example.expensetrackerkmm.Repositories

import com.example.expensetrackerkmm.Entities.AccountEntity

interface AccountRepository {
    fun getAccounts(): List<AccountEntity>
}

class AccountRepositoryImpl: AccountRepository {
    override fun getAccounts(): List<AccountEntity> {
        return listOf(
            AccountEntity(name = "Capital One Checking", balance = 123.45),
            AccountEntity(name = "Capital One Savings", balance = 15000.00),
            AccountEntity(name = "Chase Credit Card", balance = 1234.56)
        )
    }
}