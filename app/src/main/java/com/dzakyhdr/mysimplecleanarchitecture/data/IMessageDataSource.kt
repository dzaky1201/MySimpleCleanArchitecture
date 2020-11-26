package com.dzakyhdr.mysimplecleanarchitecture.data

import com.dzakyhdr.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}