package com.example.codelab____composestate

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen (modifier: Modifier = Modifier) {

    Scaffold {

        StatefulCounter(modifier)
        WellnessTaskList()
    }
}