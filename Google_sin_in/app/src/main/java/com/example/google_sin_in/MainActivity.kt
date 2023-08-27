package com.example.google_sin_in

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.google_sin_in.DarkColorPalette
import com.example.google_sin_in.LightColorPalette
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.google_sin_in.ui.theme.Google_sin_inTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Google_sin_inTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DarkModeToggleButton()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Composable
fun Theemem(){
    Column(){
//        var toggle: int = 1
//        Text(text = "SAAD", color = MaterialTheme.colorScheme.primary)
//        Button(onClick = { /*TODO*/ }) {

//        }
    }
}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Google_sin_inTheme {
//        Theemem()
//    }
//}



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DarkModeToggleButton() {
    val isDarkMode = isSystemInDarkTheme()
    val themeState = remember { mutableStateOf(isDarkMode) }

    MaterialTheme(
        colorScheme = if (themeState.value) darkColors() else lightColors()
    ) {
        Scaffold(
            topBar = {
                TopAppBar(title = { Text(stringResource(R.string.app_name)) })
            },
            content = {
                PaddingValues(20.dp)
                Button(
                    onClick = { themeState.value = !themeState.value },
                    modifier = Modifier.padding(60.dp)
                ) {
                    Text(text = if (themeState.value) "Switch to Light Mode" else "Switch to Dark Mode",
//                        color = if (themeState.value) DarkColorPalette.secondary else LightColorPalette.secondary
                        color = MaterialTheme.colorScheme.secondary
                        )
                }
            }
        )
    }
}

@Preview
@Composable
fun DarkModeToggleButtonPreview() {
    DarkModeToggleButton()
}
