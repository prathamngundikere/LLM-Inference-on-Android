package io.github.prathamngundikere.llm.data

import com.google.mediapipe.tasks.genai.llminference.LlmInference.Backend
import io.github.prathamngundikere.llm.domain.GenericUiState
import io.github.prathamngundikere.llm.domain.UiState

enum class Model(
    val path: String,
    val preferredBackend: Backend?,
    val uiState: UiState,
    val temperature: Float,
    val topK: Int,
    val topP: Float,
) {
    GEMMA3_CPU(
        path = "/data/local/tmp/gemma3-1b-it-int4.task",
        preferredBackend = Backend.CPU,
        uiState = GenericUiState(),
        temperature = 1f,
        topK = 64,
        topP = 0.95f
    ),
    GEMMA3_GPU(
        path = "/data/local/tmp/gemma3-1b-it-int4.task",
        preferredBackend = Backend.GPU,
        uiState = GenericUiState(),
        temperature = 1f,
        topK = 64,
        topP = 0.95f
    )
}