package com.example.codelab____composestate

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WellnessTaskList (

    list: List<WellnessTask>,
    onCloseTask : (WellnessTask) -> Unit,
    onCheckedTask : (WellnessTask, Boolean) -> Unit,
    modifier: Modifier = Modifier,

) {
    
    LazyColumn(
        modifier = modifier.padding(top = 48.dp)
    ) {
        items(

            items = list,
            key = {task -> task.id}


        ) { task ->
            WellnessTaskItem(
                taskName = task.label,
                checked = task.checked,
                onClose = { onCloseTask(task) },
                onCheckedChange = { checked ->  onCheckedTask(task,checked)}
            )
        }
    }
    
}