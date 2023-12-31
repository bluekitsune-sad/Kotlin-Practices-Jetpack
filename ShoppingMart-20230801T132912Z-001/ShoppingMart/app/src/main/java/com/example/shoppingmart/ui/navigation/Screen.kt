package com.example.shoppingmart.ui.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object Home : Screen("home_screen")
    object Detail : Screen("detail_screen")
}