package com.dede.android_eggs.desktop

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Android Easter Eggs") {
        MaterialTheme {
            AppContent()
        }
    }
}

@Composable
fun AppContent() {
    Text("Android Easter Eggs Desktop Version")
}
