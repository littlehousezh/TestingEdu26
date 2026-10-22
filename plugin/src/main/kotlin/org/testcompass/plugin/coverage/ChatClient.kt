package org.testcompass.plugin.coverage

interface ChatClient {
    fun chatOnce(prompt: String): String
}
