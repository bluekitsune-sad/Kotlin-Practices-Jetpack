package com.example.composepracticetheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepracticetheme.ui.theme.ComposePracticeThemeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ComposePracticeTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
            ComposePracticeThemeTheme {
            Column {
//                    Text(
//                        text = "Daniyal Khan",
//                        color = MaterialTheme.colorScheme.primary,
//                        fontSize = 40.sp
//                    )
//                Text(
//                    buildAnnotatedString {
//                        withStyle(style = ParagraphStyle()){
//                            withStyle(
//                                style = SpanStyle(
////                        color = Color(0xFF565656),
//                                    color = MaterialTheme.colorScheme.primary,
//                                    fontSize = 30.sp,
//                                    fontWeight = FontWeight.Bold
//                                )
//                            ){
//                                append("A")
//                            }
//                            append("B")
//                            append("C")
//                            append("D")
//                        }
//                    }, modifier = Modifier.width(200.dp)
//                )
                cardd()

            }
            }
        }
    }
}

@Composable
fun cardd() {
    var expanded by remember {
        mutableStateOf(false)
    }
    var title = "sad"
    var body = "inhfoinhoiegoeignogk" +
            "giebogebogbe" +
            "kgnpoginegi"
    val rotationState by animateFloatAsState(
        targetValue = if (expanded) 180f else 0f
    )
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
//                .animateContentSize(
//                    animationSpec = tween(
//                        delayMillis = 300,
//                        easing = LinearOutSlowInEasing
//                    )
//                )
    ) {
//            Column(modifier = Modifier.width(IntrinsicSize.Max)) {
        Column {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(5.dp)
            )
//            if (expanded) {
//                Text(text = body , modifier = Modifier.padding(5.dp))
//                IconButton(onClick = { expanded = false }) {
//                    Icon(Icons.Default.Share, contentDescription = "Collapse")
//                }
//            } else {
//                IconButton(onClick = { expanded = true }) {
//                    Icon(Icons.Default.ExitToApp, contentDescription = "Expand")
//                }
//            }
            AnimatedVisibility(visible = expanded) {
                Column {
                    Text(text = body, modifier = Modifier.padding(5.dp))
                    IconButton(onClick = { expanded = false }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Collapse")
                    }
                }
            }
            if (!expanded) {
                IconButton(onClick = { expanded = true }) {
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Expand")
                }
            }
        }
    }
}

@Composable
fun StringAnnotationCheck() {
    var colortest = MaterialTheme.colorScheme.primary
    Text(
        buildAnnotatedString {
            withStyle(style = ParagraphStyle()) {
                withStyle(
                    style = SpanStyle(
//                        Color(0xFF565656),
                        color = colortest,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("A")
                }
                append("B")
                append("C")
                append("D")
            }
        }, modifier = Modifier.width(200.dp)
    )
}



//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Preview
@Composable
fun GreetingPreview() {
    ComposePracticeThemeTheme {
        cardd()
  }
}