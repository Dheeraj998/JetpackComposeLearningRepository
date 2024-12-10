package com.artifitia.jetpackcomposelearning

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    Scaffold(modifier = Modifier.fillMaxSize(),
        bottomBar = {
            Text(text = "bottom")

        }) { innerPadding ->
        ContentScreen(Modifier.padding(innerPadding))
    }
}

@Composable
fun ContentScreen(modifier: Modifier = Modifier) {
    Text(text = "helo")
}