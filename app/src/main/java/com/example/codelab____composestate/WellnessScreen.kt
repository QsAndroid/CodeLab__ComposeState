package com.example.codelab____composestate

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen (

    modifier: Modifier = Modifier,
    viewModel: WellnessViewModel = androidx.lifecycle.viewmodel.compose.viewModel()

) {

    Scaffold {

        Column(modifier = modifier) {

            StatefulCounter()

            WellnessTaskList(
                list = viewModel.tasks,
                onCloseTask = { task -> viewModel.remove(task)},
                onCheckedTask = {task, checked -> viewModel.changeTaskChecked(task,checked)}

            )

        }


    }
}