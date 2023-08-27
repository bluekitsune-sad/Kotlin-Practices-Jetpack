package com.example.navigation.navigation.NavGRaph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.Screens.LoginScreen
import com.example.navigation.Screens.SignUpScreen
import com.example.navigation.navigation.AUTHENTICATION_ROUTE
import com.example.navigation.navigation.Screen

fun NavGraphBuilder.AuthenNavGraoh(
    navController: NavController
){
    navigation(         //this is the nexted navGraoh
        startDestination = Screen.Login.route,
        route = AUTHENTICATION_ROUTE
    ) {
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.Signin.route
        ) {
            SignUpScreen(navController = navController)
        }
    }
}