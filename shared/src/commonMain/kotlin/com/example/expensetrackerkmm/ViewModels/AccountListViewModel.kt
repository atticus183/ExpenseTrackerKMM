package com.example.expensetrackerkmm.ViewModels

import com.example.expensetrackerkmm.Repositories.AccountRepository
import com.example.expensetrackerkmm.Repositories.AccountRepositoryImpl

class AccountListViewModel(
    repository: AccountRepository = AccountRepositoryImpl()
) {
    var accounts = repository.getAccounts()
}