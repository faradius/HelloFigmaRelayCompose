package com.example.hellofigma.helloscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.hellofigma.R
import com.example.hellofigma.hellocard.HelloCard

@Composable
fun HelloScreen(
    viewModel: HelloViewModel = hiltViewModel()
) {
    Column {
        HelloCard(
            title = viewModel.state.cardText,
            onButtonTapped = { viewModel.onEvent(HelloEvent.CardButton) },
            onHelloCardLongPressed = { viewModel.onEvent(HelloEvent.CardHello) },
            image = painterResource(id = R.drawable.image_demo),
            modifier = Modifier.height(280.dp)
        )
    }
}