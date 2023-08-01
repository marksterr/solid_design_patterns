package com.example.soliddesignpatterns.solid

/*
* we introduce an interface MessageService, and both EmailService and
* SmsService implement this interface. The Notification class depends
* on the MessageService abstraction and not on the low-level modules
* directly. So now, if we want to change the notification method, we
* just need to pass a different MessageService implementation to the
* Notification class. The Notification class itself does not need to
* change. This design adheres to the Dependency Inversion Principle
* */

interface MessageService {
    fun sendMessage(message: String, receiver: String)
}

class EmailService : MessageService {
    override fun sendMessage(message: String, receiver: String) {
        // Send email
    }
}

class SmsService : MessageService {
    override fun sendMessage(message: String, receiver: String) {
        // Send SMS
    }
}

class Notification(private val service: MessageService) {
    fun promotionalNotification(message: String, user: String) {
        service.sendMessage(message, user)
    }
}