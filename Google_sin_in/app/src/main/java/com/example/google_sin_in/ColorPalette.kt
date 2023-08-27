package com.example.google_sin_in

// ColorPalette.kt

//import androidx.compose.material.darkColors
//import androidx.compose.material.lightColors
import android.graphics.Color.rgb
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

//private val DarkColorPalette = darkColorScheme(
//    primary = Color.White,
////    primaryVariant = Color.Gray,
//    secondary = Color.White,
//    onPrimary = Color.Black,
//    onSecondary = Color.Black
//)
//
//private val LightColorPalette = lightColorScheme(
//    primary = Color.Black,
////    primaryVariant = Color.Gray,
//    secondary = Color.Black,
//    onPrimary = Color.White,
//    onSecondary = Color.White
//)

val DarkColorPalette = darkColorScheme(
//    primary = Color(0xFF1D3557),
    primary = Color(rgb(71, 71, 107)),
//    primaryVariant = Color(0xFF457B9D),
//    secondary = Color(0xFFA8DADC),
    secondary = Color(rgb(83, 198, 140)),
//    secondaryVariant = Color(0xFFE63946),
    background = Color(0xFF0A192F),
    surface = Color(0xFF1D3557),
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.White,
    onSurface = Color.White,
)

val LightColorPalette = lightColorScheme(
    primary = Color(0xFF1D3557),
//    primaryVariant = Color(0xFF457B9D),
    secondary = Color(0xFFA8DADC),
//    secondaryVariant = Color(0xFFE63946),
    background = Color(rgb(196, 255, 77)),
//    surface = Color(rgb(213, 255, 128)),
    surface = Color(rgb(230, 255, 179)),
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
)
fun darkColors() = DarkColorPalette

fun lightColors() = LightColorPalette
