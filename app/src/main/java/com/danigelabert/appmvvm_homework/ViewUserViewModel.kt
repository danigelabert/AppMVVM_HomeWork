package com.danigelabert.appmvvm_homework

import androidx.lifecycle.ViewModel

class ViewUserViewModel: ViewModel() {

    private var _user=""
    val user: String
        get() = _user


    private var _email="";
    val email: String
        get() = _email


    private var _edat=0;
    val edat: Int
        get() = _edat


    fun nextUser() {
        val nextUser = UserProvider.nextUser()
        _user = nextUser.name
        _email = nextUser.email
        _edat = nextUser.edat

    }

}