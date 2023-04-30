package com.example.codelab____composestate

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StatelessCounter (

    count : Int,
    onIncrement: () -> Unit,
    modifier: Modifier = Modifier

) {

    if (count > 0) {
        Text(text = "You've had $count glasses.")
    }

    Button(
        onClick = onIncrement,
        modifier = Modifier.padding(top =  32.dp,),

        enabled = count < 10
    ) {
        Text(text = "Add one")
    }

}