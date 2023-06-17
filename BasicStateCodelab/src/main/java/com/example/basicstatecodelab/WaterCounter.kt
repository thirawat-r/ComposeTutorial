package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    val count = 0
    Column(
        modifier = modifier
            .padding(all = 16.dp)
    ) {
        Text(
            text = "You've had $count glasses."
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = modifier.padding(top = 8.dp)
        ) {
            Text(
                text = "Add more"
            )
        }
    }
}

