package com.example.textcustomiz

import android.os.Bundle
import android.text.style.SuperscriptSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.textcustomiz.ui.theme.TextCustomizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextCustomizTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()){
    Text(
//        text = "Hello $name!",
        text = stringResource(id = R.string.app_name),
        modifier = modifier
            .background(MaterialTheme.colorScheme.primary)
            .padding(16.dp),
        color = Color.White,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
//        fontSize = MaterialTheme.typography.bodyMedium,

        )
    }
}

@Composable
fun CustomText(){
    Text(
    buildAnnotatedString{
        withStyle(style = ParagraphStyle(
            textAlign = TextAlign.Center

        )){//paragraph styling can be applied for paragrafh level;



        withStyle(style = SpanStyle(
            color = MaterialTheme.colorScheme.primary,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
        )){ //Span style can be applied to character level
            append("A");
        }
        append("B");
        append("C");
        append("D");
            }
        }, modifier = Modifier.width(200.dp)
    )
}

@Composable
fun CustomText3(){
    Text(text = "Hello World".repeat(20), maxLines =2, overflow = TextOverflow.Ellipsis)
}

@Composable
fun Custom4(){
    Column() {
        SelectionContainer() {
            Column() {
                Text(text = "I can be Selected;")

                DisableSelection {
                    Text(text = "I cannot be Selected;")
                }
                Text(text = "I can be Selected;")

            }
        }
        DisableSelection {
            Text(text = "I cannot be Selected")
        }
    }
}
@Composable
fun SuperscriptText(normalText: String, superText: String){
    Text(buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = MaterialTheme.typography.bodySmall.fontSize
            )
        ){
            append(normalText)
        }
        withStyle(
            style = SpanStyle(
                fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                fontWeight = FontWeight.Normal,
                color = MaterialTheme.colorScheme.primary,
                baselineShift = BaselineShift.Superscript //SuperScript is power and SubScript is base;
            )
        ){
                append(superText)
            }

    })
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TextCustomizTheme {
        CustomText()
    }
}