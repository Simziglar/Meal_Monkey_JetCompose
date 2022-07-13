package com.example.mealmonkeyjetcompose.screens

import androidx.annotation.ColorRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            Row(modifier = Modifier.fillMaxWidth(), ) {
                Box() {
                    Image(painter = painterResource(id = R.drawable.organe_top_shape), contentDescription = "Splashscreen backGround")
                }
            }
            
            Spacer(modifier = Modifier.height( 110.dp ))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text(text = "Discover the best foods from over 1,000\n" +
                        "restaurants and fast delivery to your\n" +
                        "doorstep", textAlign = TextAlign.Center)
            }
            
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(350.dp)
                        .height(65.dp),
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.main_color))

                ) {
                    Text(text = "Login", color = Color.White, fontSize = 20.sp)
                    
                }

                Spacer(modifier = Modifier.height(30.dp))

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(350.dp)
                        .height(65.dp),
                    border = BorderStroke(width = 2.dp, colorResource(id = R.color.main_color )),
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
                ) {
                    Text(
                        text = "Create an Account",
                        color = colorResource(id = R.color.main_color),
                        fontSize = 20.sp
                    )

                }
                
            }


        }

    }

}