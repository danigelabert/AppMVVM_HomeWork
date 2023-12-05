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
            User("Dani", 22, "dani@gmail.com", "patata123"),
            User("Ruben", 13, "ruben@gmail.com", "patata123"),
            User("Marc", 19, "marc@gmail.com", "patata123"),
            User("Pau", 5, "pau@gmail.com", "patata123"),
            User("Arnau", 34, "arnau@gmail.com", "patata123"),
            User("Aram", 18, "aram@gmail.com", "patata123"),
            User("Alex", 22, "alex@gmail.com", "patata123"),
            )
    }
}