package com.danigelabert.appmvvm_homework

import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {

    private var _user=""
    val user: String
        get() = _user


    private var _password=""
    val password: String
        get() = _password


    fun comprovacioLogIn(userEditText: String, passwordEditText: String): Boolean {
        var nextUser = UserProvider.nextUser()
        while (nextUser!=null){
            nextUser = UserProvider.nextUser()
            _user = nextUser.name
            _password = nextUser.pwd

            if (_user==userEditText && _password==passwordEditText){
                return true;
            }
        }
        return false
    }
}