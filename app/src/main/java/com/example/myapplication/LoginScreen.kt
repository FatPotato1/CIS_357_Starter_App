package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun LoginScreen(vm: LoginViewModel) {
    val bananaText = vm.banana.collectAsState()
    Column(modifier = Modifier.fillMaxSize().background(color = Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally) {

        TextField(
            value = "apple",
            onValueChange = {}

        )
        TextField(
            value = bananaText.value,
            onValueChange = {}
        )
        TextField(
            value = "LANDON JURMO",
            onValueChange = {}
        )
        Button(
            onClick = { vm.doStuff() }
        ) {
            Text("click me")
        }
    }


}