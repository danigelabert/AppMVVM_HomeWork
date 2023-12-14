package com.danigelabert.appmvvm_homework

class UserProvider {
    companion object{
        var position = 0
        fun nextUser(): User{
            position++
            return userName[position]
        }

        fun login(username: String, password: String): Boolean {
            val user = userName.find { it.name == username && it.pwd == password }
            return user != null
        }



        val userName = listOf<User>(
            User("Dani", "patata123"),
            User("Ruben",  "patata123"),
            User("Marc",  "patata123"),
            User("Pau",  "patata123"),
            User("Arnau", "patata123"),
            User("Aram", "patata123"),
            User("Alex", "patata123"),
            )
    }
}