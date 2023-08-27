package com.example.navigationpracticewithdani.navigation.NavGRaph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigationpracticewithdani.navigation.Screen
import com.example.navigationpracticewithdani.Screens.*

fun NavGraphBuilder.LoverNavGraph(
    navController: NavController
){
        navigation(
        startDestination = Screen.Home.route,
        route = Screen.Home.route
    ) {
        composable(route = Screen.Home.route){
            HomeScreen(navController)
        }
        composable(
            route = Screen.Inner2.route
        ) {
            Inner2(navController = navController)
        }
        composable(
            route = Screen.Inner2_1.route
        ) {
            Inner2_1(navController = navController)
        }
        composable(
            route = Screen.Inner2_2.route
        ) {
            Inner2_2(navController = navController)
        }
        composable(
            route = Screen.Inner2_1_1.route
        ) {
            Inner2_1_1(navController = navController)
        }
        composable(
            route = Screen.Inner2_1_2.route
        ) {
            Inner2_1_2(navController = navController)
        }
        composable(
            route = Screen.Inner2_2_1.route
        ) {
            Inner2_2_1(navController = navController)
        }
        composable(
            route = Screen.Inner2_2_2.route
        ) {
            Inner2_2_2(navController = navController)
        }
    }
}