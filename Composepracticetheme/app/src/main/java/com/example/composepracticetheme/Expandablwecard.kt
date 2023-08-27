package com.example.composepracticetheme

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.modifier.ModifierLocal
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExpandedCard(
    title: String,
//    titleFontSize: TextUnit = MaterialTheme.typography.titleSmall.fontSize,
//    titleFontWeight: FontWeight = FontWeight.Bold,
    description: String,
//    descriptionFontWeight: FontWeight = FontWeight.Normal,
//    descriptionFontSize: TextUnit = MaterialTheme.typography.bodySmall.fontSize,
//    descriptionMaxLine: Int = 4
){
    var expendedState by remember {
        mutableStateOf(false)
    }
    val rotationState by animateFloatAsState(
        targetValue = if(expendedState)180f else 0f
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(
                animationSpec = tween(
//                    delayMillis = 300,
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            ),
        shape = MaterialTheme.shapes.medium,
        onClick = {
            expendedState = !expendedState
        }
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .weight(6f) //This means that this will make 7 part and take 6 of the space
                    ,
                    text = title,
                    fontWeight = FontWeight.Bold,
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis //this will show '...' when it reaches more then one line
                )
                IconButton(
                    modifier = Modifier
                        .alpha(5.0f)
                        .weight(1f)
                        .rotate(rotationState)
                    ,
                    onClick = {
                        expendedState = !expendedState
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "DROP-Down Arrow"
                    )

                }
            }
            if(expendedState){
                Text(
                    text = description,
                    fontSize = MaterialTheme.typography.bodySmall.fontSize
                )
            }
        }
    }


}

@Composable
@Preview
fun ExpandableCardPreview(){
    var title : String = "Adolf Hitler"
    var description : String = "Adolf Hitler (1889-1945) is " +
            "unquestionably the central figure in the story of the " +
            "Holocaust. It was the combination of his virulent hatred " +
            "of Jews and his success in creating a political movement that " +
            "was able to seize control of Germany " +
            "that made the campaign to exterminate the Jews possible."
    ExpandedCard(title,description)
}