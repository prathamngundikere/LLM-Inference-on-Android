package io.github.prathamngundikere.llm.domain

import androidx.compose.runtime.toMutableStateList

/**
 * A sample implementation of [UiState] that can be used with any model.
 */
class GenericUiState(
    messages: List<ChatMessage> = emptyList()
) : UiState {
    private val _messages: MutableList<ChatMessage> = messages.toMutableStateList()
    override val messages: List<ChatMessage> = _messages.asReversed()
    private var _currentMessageId = ""

    override fun createLoadingMessage() {
        val chatMessage = ChatMessage(author = MODEL_PREFIX, isLoading = true)
        _messages.add(chatMessage)
        _currentMessageId= chatMessage.id
    }

    override fun appendMessage(text: String, done: Boolean){
        val index = _messages.indexOfFirst { it.id == _currentMessageId }
        if (index != -1) {
            val newText = _messages[index].rawMessage + text
            _messages[index] = _messages[index].copy(rawMessage = newText, isLoading = false)
        }
    }

    override fun addMessage(text: String, author: String) {
        val chatMessage = ChatMessage(
            rawMessage = text,
            author = author
        )
        _messages.add(chatMessage)
        _currentMessageId = chatMessage.id
    }

    override fun clearMessages() {
        _messages.clear()
    }

    override fun formatPrompt(text: String): String {
        return text
    }
}