package com.example.textfeilds

import android.graphics.drawable.Icon
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
//import androidx.media3.common.util.Log
import com.example.textfeilds.ui.theme.TextFeildsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFeildsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                }
            }
        }
    }
}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Column(
//        modifier = Modifier
//        .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//        ) {
//        var text by remember {
//            mutableStateOf("saad")
//        }
//        TextField(
//            value = text, onValueChange = { newtext ->
//                text = newtext
//
//            },
//            enabled = false,
//            readOnly = true,
//            label = {
//                Text(text = "name:")
//            },
//            singleLine = true,
//            maxLines = 5,
////            leadingIcon = {
////                IconButton(
////                    onClick = {}
////                ){
////                    Icon(
////                        imageVector = Icons.Filled.Email,
////                        contentDescription = "Email icon"
////                    )
////                }
////            },
//            trailingIcon = {
//                IconButton(
//                    onClick = { Log.d("Trailing Icon", "Clicked") }
//                ){
//                    Icon(
//                        imageVector = Icons.Filled.Email,
//                        contentDescription = "Email icon"
//                    )
//                }
//            },
//        keyboardOptions = KeyboardOptions(
//            keyboardType = KeyboardType.Email,
//            imeAction = ImeAction.Search
//            ),
//            keyboardActions = KeyboardActions(
//                onSearch = {Log.d("IMEaction","Clicked")}
//            )
//        )
//
//        OutlinedTextField(
//            value = text, onValueChange = {newtext ->
//            text = newtext
//        }
//        )
//        BasicTextField(
//            modifier = Modifier.background(Color.LightGray),
//            value = text, onValueChange = { newtext ->
//            text = newtext
//        }
//        )
//    }
//
//}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharCountLimit(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        var name by remember {
            mutableStateOf("")
        }
        var maxChar = 10

        OutlinedTextField(
            value = name,
            onValueChange = {
                if(it.length <= maxChar){
                    name = it
                }
                            },
            label = {Text(text = "Name")},
            placeholder = {Text(text = "Enter your name")},
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TextFeildsTheme {
        CharCountLimit()
    }
}