package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count by remember { mutableStateOf(0) }
    Column(
        modifier = modifier
            .padding(all = 16.dp)
    ) {
        if (count > 0) {
            var showTask by remember { mutableStateOf(true) }
            if (showTask) {
                WellnessTaskItem(
                    taskName = "Have you taken your 15 minutes walk today?",
                    onClose = { showTask = false }
                )
            }
            Text(
                text = "You've had $count glasses."
            )
        }
        Button(
            onClick = { count++ },
            modifier = modifier.padding(top = 8.dp),
            enabled = count < 10
        ) {
            Text(
                text = "Add more"
            )
        }
    }
}

