package com.example.codelab____composestate

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun WaterCounter(modifier: Modifier = Modifier) {


    var count by remember {
        
    }

    Text(

        text ="You've had  glasses!",
        modifier = modifier.padding(16.dp)

    )
    
    Button(
        onClick = {   },
        modifier = Modifier.padding(top = 8.dp)
    ) {
        Text(text = "Add one")
        
    }


}