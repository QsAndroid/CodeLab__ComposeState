package com.example.codelab____composestate

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WellnessTaskItem(

    taskName : String,
    checked : Boolean,
    onCheckedChange : (Boolean) -> Unit,
    onClose: () -> Unit,
    modifier: Modifier = Modifier
) {

    Row(
        modifier =  modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            modifier = Modifier
                .weight(1f)
                .padding(top = 16.dp, start = 16.dp),
            text = taskName)

        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange
        )

        IconButton(
            onClick = onClose,
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Icon(Icons.Filled.Close, contentDescription = "Close ")
        }

    }

}

@Composable
fun WellnessTaskItem(
    taskName: String,
    onClose: () -> Unit,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier) {

    var checkedState by rememberSaveable { mutableStateOf(false) }

    WellnessTaskItem(
        taskName = taskName,
        checked = checkedState,
        onCheckedChange = onCheckedChange,
        onClose = onClose,
        modifier = modifier
    )
}