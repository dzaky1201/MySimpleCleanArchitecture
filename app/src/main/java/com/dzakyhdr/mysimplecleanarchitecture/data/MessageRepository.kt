package com.dzakyhdr.mysimplecleanarchitecture.data

import com.dzakyhdr.mysimplecleanarchitecture.domain.IMessageRepository
import com.dzakyhdr.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository{
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}