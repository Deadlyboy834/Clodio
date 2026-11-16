package app.clodio.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import app.clodio.alarm.AlarmList

@Composable
fun Home() {
    Box(
        modifier = Modifier.fillMaxSize().background(color = Color(0xFF000000)),
        contentAlignment = Alignment.TopStart
    ) {
        AlarmList()
    }
}