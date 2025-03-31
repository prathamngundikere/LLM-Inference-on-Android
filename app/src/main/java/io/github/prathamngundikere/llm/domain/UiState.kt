package io.github.prathamngundikere.llm.domain

const val USER_PREFIX = "user"
const val MODEL_PREFIX = "model"

interface UiState {
    val messages: List<ChatMessage>

    /** Creates a new loading message. */
    fun createLoadingMessage()

    /**
     * Appends the specified text to the message with the specified ID.
     * THe underlying implementations may split the re-use messages or create new ones. The method
     * always returns the ID of the message used.
     * @param done - indicates whether the model has finished generating the message.
     */
    fun appendMessage(text: String, done: Boolean = false)

    /** Creates a new message with the specified text and author. */
    fun addMessage(text: String, author: String)

    /** Clear all messages. */
    fun clearMessages()

    /** Formats a messages from the user into the prompt format of the model. */
    fun formatPrompt(text:String) : String
}