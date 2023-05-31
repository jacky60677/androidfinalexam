package com.example.finalexam

import android.graphics.Paint.Align
import android.media.ImageReader.OnImageAvailableListener
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.finalexam.ui.theme.FinalexamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinalexamTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
                Box1()
                Box2()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    Column( Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "作者 : 資管二B 陳丞彥",  textAlign = TextAlign.Center,)
        Image(
            painter = painterResource(id = R.drawable.map),
            contentDescription = "map",

            )
    }
}
@Composable
fun Box1() {
    Canvas(
        modifier = Modifier
            .size(size = 300.dp)
    ) {
        drawRect(
            color = Color.Blue,
            size = Size(width = 10.dp.toPx(), height = 10.dp.toPx()),
            topLeft = Offset(x = 265.dp.toPx(), y = 60.dp.toPx())
        )
    }
}
@Composable
fun Box2(){
    Canvas(
        modifier = Modifier
            .size(size = 300.dp)
    ) {
        drawRect(
            color = Color.Blue,
            size = Size(width = 10.dp.toPx(), height = 10.dp.toPx()),
            topLeft = Offset(x = 540.dp.toPx(), y = 300.dp.toPx())
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FinalexamTheme {
        Greeting("Android")
    }
}