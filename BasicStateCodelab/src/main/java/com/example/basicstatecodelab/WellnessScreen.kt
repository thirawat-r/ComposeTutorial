package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import com.example.basicstatecodelab.data.WellnessTask

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        StatefulCounter()

        val list = remember { getWellnessTasks().toMutableStateList() }
        WellnessTasksList(
            list = list,
            onCloseTask = { task -> list.remove(task) }
        )
    }
}

private fun getWellnessTasks() = List(30) { index ->
    WellnessTask(index, "Task # $index")
}
