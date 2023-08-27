package com.example.customuiarc

//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.size
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.drawBehind
//import androidx.compose.ui.geometry.Offset
//import androidx.compose.ui.geometry.Size
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.StrokeCap
//import androidx.compose.ui.graphics.drawscope.DrawScope
//import androidx.compose.ui.graphics.drawscope.Stroke
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.Dp
//import androidx.compose.ui.unit.dp

//@Composable
//fun CustomComponent(
//    canvasSize: Dp = 300.dp,
//    indicatorvalue: Int = 0,
//    maxIndicatorvalue: Int = 100,
//    backgroundIndicatorColor: Color = MaterialTheme.colorScheme.onSurface,
//    backgroundIndicatorStrokeWidth: Float = 100f,
//) {
//    Column(
//        modifier = Modifier
//            .size(canvasSize)
//            .drawBehind {
//                val componentSize = size / 1.25f
//                backgroundIndicator(
//                    componentSize = componentSize,
//                    indicatorColor = backgroundIndicatorColor,
//                    indicatorStrokeWidth = backgroundIndicatorStrokeWidth
//                )
//            }
//    ) {
//
//    }
//
//}
//
//fun DrawScope.backgroundIndicator(
//    componentSize: Size,
//    indicatorColor: Color,
//    indicatorStrokeWidth: Float
//){
//    drawArc(
//        size = componentSize,
//        color = indicatorColor,
//        startAngle = 150f,
//        sweepAngle = 240f,
//        useCenter = false,
//        style = Stroke(
//            width = indicatorStrokeWidth,
//            cap = StrokeCap.Round
//        ),
//        topLeft = Offset(
//            x = (size.width - componentSize.width) / 2f,
//            y = (size.height - componentSize.height) / 2f
//        )
//    )
//}
//
//
//@Preview(showBackground = true)
//@Composable
//fun CustomComponentPrev() {
//    CustomComponent()
//}
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.geometry.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp


@Composable
fun CustomComposable(
    canvasSize: Dp = 300.dp,
    indicatorValue: Int = 0,
    maxIndicatorValue: Int = 100,
    backgroundIndicatorColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.25f),
    backgroundIndicatorStrokeWidth: Float = 25f,
    foregroundIndicatorColor: Color = MaterialTheme.colorScheme.primary,
    foregroundIndicatorStrokeWidth: Float = 25f,
    indicatorStrokeCap: StrokeCap = StrokeCap.Round,
    bigTextFontSize: TextUnit = MaterialTheme.typography.headlineMedium.fontSize,
    bigTextColor: Color = MaterialTheme.colorScheme.onSurface,
    bigTextSuffix: String = "GB",
    smallText: String = "Remaining",
    smallTextFontSize: TextUnit = MaterialTheme.typography.headlineLarge.fontSize,
    smallTextColor: Color = MaterialTheme.colorScheme.onSurface.copy(0.3f)
) {
    val animatorIndicatorValue = remember{ Animatable(initialValue = 0f) }
    LaunchedEffect(key1 = indicatorValue){
        animatorIndicatorValue.animateTo(indicatorValue.toFloat())
    }
    var percentage = (animatorIndicatorValue.value / maxIndicatorValue) * 100
    if(percentage >100){
        percentage = 100f
    }
    val sweepAngle by animateFloatAsState(
        targetValue =(2.4 * percentage).toFloat(),
        animationSpec = tween(1000)
    )
    val recievedValue by animateIntAsState(
        targetValue = indicatorValue,
        animationSpec = tween(1000)
    )
    val bigTextColorAnimation by animateColorAsState(
        targetValue = if(indicatorValue == 0)
            MaterialTheme.colorScheme.onSurface.copy(alpha = 0.3f)
        else
            bigTextColor
    )

    Column(modifier = Modifier
        .size(canvasSize)
        .drawBehind {
            val indicatorSize = size / 1.25f
            backgroundIndicator(
                componentSize = indicatorSize,
                indicatorColor = backgroundIndicatorColor,
                indicatorStrokeWidth = backgroundIndicatorStrokeWidth,
                indicatorStrokeCap = indicatorStrokeCap
            )
            foregroundIndicator(
                sweepAngle = sweepAngle,
                componentSize = indicatorSize,
                indicatorColor = foregroundIndicatorColor,
                indicatorStrokeWidth = foregroundIndicatorStrokeWidth,
                indicatorStrokeCap = indicatorStrokeCap
            )
        },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        EmbeddedElements(
            bigText = recievedValue,
            bigTextFontSize = bigTextFontSize,
            bigTextColor = bigTextColorAnimation,
            bigTextSuffix = bigTextSuffix,
            smallText = smallText,
            smallTextColor = smallTextColor,
            smallTextFontSize = smallTextFontSize
        )
    }
}

fun DrawScope.backgroundIndicator(
    componentSize: Size,
    indicatorColor: Color,
    indicatorStrokeWidth: Float,
    indicatorStrokeCap: StrokeCap
){
    drawArc(
        size = componentSize,
        color = indicatorColor,
        startAngle = 150f,
        sweepAngle = 240f,
        useCenter = false,
        style = Stroke(
            width = indicatorStrokeWidth,
            cap = indicatorStrokeCap
        ),
        topLeft = Offset(
            x = (size.width - componentSize.width) / 2f,
            y = (size.width - componentSize.width) / 2f
        )
    )
}

fun DrawScope.foregroundIndicator(
    sweepAngle: Float,
    componentSize: Size,
    indicatorColor: Color,
    indicatorStrokeWidth: Float,
    indicatorStrokeCap: StrokeCap
){
    drawArc(
        size = componentSize,
        color = indicatorColor,
        startAngle = 150f,
        sweepAngle = sweepAngle,
        useCenter = false,
        style = Stroke(
            width = indicatorStrokeWidth,
            cap = indicatorStrokeCap
        ),
        topLeft = Offset(
            x = (size.width - componentSize.width) / 2f,
            y = (size.width - componentSize.width) / 2f
        )
    )
}

@Composable
fun EmbeddedElements(
    bigText: Int,
    bigTextFontSize : TextUnit,
    bigTextColor: Color,
    bigTextSuffix: String,
    smallText: String,
    smallTextColor: Color,
    smallTextFontSize: TextUnit
) {
    Text(
        text = smallText,
        color = smallTextColor,
        fontSize = smallTextFontSize,
        textAlign = TextAlign.Center
    )
    Text(
        text = "$bigText ${bigTextSuffix.take(2)}",
        color = bigTextColor,
        fontSize = bigTextFontSize,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold
        )
}
@Composable
@Preview(showBackground = true)
fun CustomComposablePreview() {
    CustomComposable()
}