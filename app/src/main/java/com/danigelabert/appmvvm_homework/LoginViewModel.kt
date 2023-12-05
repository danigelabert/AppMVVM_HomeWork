package com.danigelabert.appmvvm_homework

import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {

    private var _user=""
    val user: String
        get() = _user


    private var _password=""
    val password: String
        get() = _password


    fun login(username: String, password: String): Boolean {
        return UserProvider.login(username, password)
    }


}