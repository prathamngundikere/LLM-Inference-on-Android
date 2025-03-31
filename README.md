# Android LLM Inference with MediaPipe

This project demonstrates how to run Large Language Model \(LLM\) inference locally on Android devices using MediaPipe. It provides a foundation for building applications that leverage the power of LLMs without relying on cloud-based APIs, ensuring privacy and enabling offline functionality.

## Features

*   **Local LLM Inference:** Execute LLMs directly on the Android device.
*   **MediaPipe Integration:** Utilizes MediaPipe Tasks for efficient and optimized on-device inference.
*   **Privacy-Focused:**  No data is sent to external servers, ensuring user privacy.
*   **Offline Support:**  The application can function without an internet connection.
*   **Example Implementation:** Includes a sample app showcasing how to integrate and use the LLM pipeline.
*   **Customizable Pipeline:**  Easily adaptable to different LLMs and use cases.

## Getting Started

1.  **Prerequisites:**
    *   Android Studio
    *   Android SDK
    *   Basic knowledge of Android development
2.  **Clone the repository:**
    ```bash
    git clone https://github.com/prathamngundikere/LLM-Inference-on-Android
    ```
3.  **Open the project in Android Studio.**
4.  **Download the model and place it in** `/data/local/tmp/gemma3-1b-it-int4.task`
5.  **Build and run the application on an Android device or emulator.**

## Technologies Used

*   [Android](https://www.android.com/)
*   [MediaPipe](https://ai.google.dev/edge/mediapipe/solutions/genai/llm_inference/android)
*   [Gemma3-1B](https://huggingface.co/litert-community/Gemma3-1B-IT)
