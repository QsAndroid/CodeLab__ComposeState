package com.example.codelab____composestate

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WellnessTaskItem(

    taskName : String,
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
                .padding(top = 96.dp, start = 16.dp),
            text = taskName)

        IconButton(
            onClick = onClose,
            modifier = Modifier.padding(top = 96.dp)
        ) {
            Icon(Icons.Filled.Close, contentDescription = "Close ")
        }

    }

}