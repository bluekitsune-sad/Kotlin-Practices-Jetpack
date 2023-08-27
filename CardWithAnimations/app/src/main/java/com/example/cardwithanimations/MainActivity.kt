package com.example.cardwithanimations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cardwithanimations.ui.theme.CardWithAnimationsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardWithAnimationsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var title : String = "Adolf Hitler"
                    var description : String = "Adolf Hitler (1889-1945) is " +
                            "unquestionably the central figure in the story of the " +
                            "Holocaust. It was the combination of his virulent hatred " +
                            "of Jews and his success in creating a political movement that " +
                            "was able to seize control of Germany " +
                            "that made the campaign to exterminate the Jews possible."
                    ExpandedCard(title,description)
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CardWithAnimationsTheme {
        var title : String = "Adolf Hitler"
        var description : String = "Adolf Hitler (1889-1945) is " +
                "unquestionably the central figure in the story of the " +
                "Holocaust. It was the combination of his virulent hatred " +
                "of Jews and his success in creating a political movement that " +
                "was able to seize control of Germany " +
                "that made the campaign to exterminate the Jews possible."
        ExpandedCard(title,description)
    }
}