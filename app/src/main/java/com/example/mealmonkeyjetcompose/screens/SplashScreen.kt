package com.example.mealmonkeyjetcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mealmonkeyjetcompose.R

@Preview
@Composable
fun SplashScreen(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {

        Image(painter = painterResource(id = R.drawable.splash_background), contentDescription = "Splashscreen backGround")
        
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(id = R.drawable.meal_monkey_splash_logo), contentDescription = "app logo" )

        }

        
    }

}