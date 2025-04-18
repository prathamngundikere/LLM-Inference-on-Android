package io.github.prathamngundikere.llm.domain

import java.util.UUID

/**
 * Used to represent a ChatMessage
 */
data class ChatMessage(
    val id: String = UUID.randomUUID().toString(),
    val rawMessage: String = "",
    val author: String,
    val isLoading: Boolean = false,
    val isThinking: Boolean = false,
) {
    val isEmpty: Boolean
        get() = rawMessage.trim().isEmpty()
    val isFromUser: Boolean
        get() = author == USER_PREFIX
    val message: String
        get() = rawMessage.trim()
}
