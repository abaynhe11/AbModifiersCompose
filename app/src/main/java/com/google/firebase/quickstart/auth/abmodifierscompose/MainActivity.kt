package com.google.firebase.quickstart.auth.abmodifierscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.google.firebase.quickstart.auth.abmodifierscompose.ui.theme.AbModifiersComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                   AbModifier()
        }
    }
}

@Composable
fun AbBackgroundColor()
{
    Text(text="background color",
    Modifier.background(color= Color.Green))
}

@Composable
fun AbTextWidthPadding() {
    Text(
        "Padding and margin!",
        Modifier
            .padding(32.dp) // Outer padding (margin)
            .background(color = Color.Green) //background color
            .padding(16.dp) // Inner padding
    )
}


@Composable
fun AbWidthAndHeightModifier() {
    Text(
        text = "Width and Height",
        color = Color.White,
        modifier = Modifier
            .background(Color.Blue)
            .width(200.dp)
            .height(300.dp)
    )
}

@Composable
fun AbSizeModifier() {
    Text(
        text = "Text with Size",
        color = Color.White,
        modifier = Modifier
            .background(Color.Cyan)
            .size(width = 250.dp, height = 100.dp)
    )
}

@Composable
fun AbFillWidthModifier() {
    Text(
        text = "Text Width Match Parent",
        color = Color.White,
        modifier = Modifier
            .background(Color.Gray)
            .padding(Dp(10f))
            .fillMaxWidth(1f))
}

@Composable
fun AbFillHeightModifier() {
    Text(
        text = " Text with 75% Height ",
        color = Color.White,
        modifier = Modifier
            .background(Color.Red)
            .fillMaxHeight(0.75f) //75% area fill
    )
}
@Composable
fun AbAlphaModifier() {
    Box(
        Modifier
            .size(250.dp)
            .alpha(0.5f)//50% opacity
            .background(Color.Red)
    )
}
@Composable
fun AbRotateModifier() {
    Box(
        Modifier
            .rotate(45f)
            .size(250.dp)
            .background(Color.Red)
    )
}
@Composable
fun AbScaleModifier() {
    Box(
        Modifier
            .scale(scaleX = 2f, scaleY = 3f)
            .size(200.dp, 200.dp)
    )
}
@Composable
fun AbWeightModifier(){
    Row() {
        Column(
            Modifier
                .weight(1f)
                .background(Color.Red)){
            Text(text = "Weight = 1", color = Color.White)
        }
        Column(
            Modifier
                .weight(1f)
                .background(Color.Blue)){
            Text(text = "Weight = 1", color = Color.White)
        }
        Column(
            Modifier
                .weight(2f)
                .background(Color.Green)
        ) {
            Text(text = "Weight = 2")
        }

    }
}
@Composable
fun AbBorderModifier() {
    Text(
        text = "Text with Red Border",
        modifier = Modifier
            .padding(10.dp)
            .background(Color.Yellow)
            .border(2.dp, Color.Red)
            .padding(10.dp)
    )
}

@Composable
fun AbBorderWithShape() {
    Text(
        text = "Text with round border",
        modifier = Modifier
            .padding(10.dp)
            .border(2.dp, SolidColor(Color.Green), RoundedCornerShape(20.dp))
            .padding(10.dp)
    )

}
@Composable
fun AbClipModifier() {
    Text(
        text = "Text with Clipped background",
        color = Color.White,
        modifier = Modifier
            .padding(Dp(10f))
            .clip(RoundedCornerShape(25.dp))
            .background(Color.Blue)
            .padding(Dp(15f))
    )
}

@Composable
fun AbModifier()
{
    /*AbBackgroundColor()
    AbTextWidthPadding()
    AbWidthAndHeightModifier()
    AbSizeModifier()
    AbFillWidthModifier()
    AbFillHeightModifier()
    AbAlphaModifier()
    AbRotateModifier()
    AbScaleModifier()
    AbWeightModifier()
    AbBorderModifier()
    AbBorderWithShape() */
    AbClipModifier()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun defaultPreview()
{
    AbModifier()
}