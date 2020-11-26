package com.dzakyhdr.mysimplecleanarchitecture.di

import com.dzakyhdr.mysimplecleanarchitecture.data.IMessageDataSource
import com.dzakyhdr.mysimplecleanarchitecture.data.MessageDataSource
import com.dzakyhdr.mysimplecleanarchitecture.data.MessageRepository
import com.dzakyhdr.mysimplecleanarchitecture.domain.IMessageRepository
import com.dzakyhdr.mysimplecleanarchitecture.domain.MessageInteractor
import com.dzakyhdr.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}