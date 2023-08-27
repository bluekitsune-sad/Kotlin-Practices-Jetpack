package com.example.firstproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstproject.ui.theme.FirstProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Saad Yousuf here")
                    Programmm()
                }
            }
        }
    }
}

@Composable
fun ColumnScope.CustomItem(weight: Float,colors: Color){
    Surface(
        modifier = Modifier
            .height(50.dp)
            .weight(weight),
        color = MaterialTheme.colorScheme.primary
    ){

    }
}


@Composable
fun Programmm(){
    Column(Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
    ){
        Surface(
            Modifier
                .width(200.dp)
                .height(50.dp),
            color = MaterialTheme.colorScheme.primary
        ){

        }
        Surface(
            Modifier
                .width(200.dp)
                .height(50.dp),
            color = MaterialTheme.colorScheme.primary
        ){

        }
        Surface(
            Modifier
                .width(200.dp)
                .height(50.dp),
            color = MaterialTheme.colorScheme.primary
        ){

        }
        CustomItem(3f,MaterialTheme.colorScheme.secondary)

    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstProjectTheme {
//        Greeting("Android")
        Programmm()
    }
}