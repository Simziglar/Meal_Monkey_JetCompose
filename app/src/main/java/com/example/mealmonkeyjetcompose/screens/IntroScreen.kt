package com.example.mealmonkeyjetcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mealmonkeyjetcompose.R

@Preview
@Composable
fun IntroScreen(){
    Surface( modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "App Logo")

        }

        Column() {
            Row(modifier = Modifier.fillMaxWidth()) {
                Box() {
                    Image(painter = painterResource(id = R.drawable.organe_top_shape), contentDescription = "Splashscreen backGround")
                }
            }
            
            Spacer(modifier = Modifier.height( 120.dp ))
            
            Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Login")
                    
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Login")

                }
                
            }


        }



        }



}