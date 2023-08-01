package com.example.soliddesignpatterns.solid

/*
 each class has a single responsibility: UserValidator validates users and UserDatabase manages
 the persistence of user data. This makes the code more modular, easier to maintain,
 and less prone to bugs
 */

data class User(val name: String)

class UserValidator {
    fun validateUser(user: User) {
        // validate user data
    }
}

class UserDatabase {
    fun saveUser(user: User) {
        // save user data to a database
    }
}