package com.dzakyhdr.mysimplecleanarchitecture.data

import com.dzakyhdr.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcome to clean architecture")
}