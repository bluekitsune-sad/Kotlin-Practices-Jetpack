package com.example.navigation.navigation.NavGRaph

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.navigation.Screens.DetailScreen
import com.example.navigation.Screens.HomeScreen
import com.example.navigation.navigation.DETAIL_ARGUMENT_KEY
import com.example.navigation.navigation.DETAIL_ARGUMENT_KEY_2
import com.example.navigation.navigation.HOME_ROUTE
import com.example.navigation.navigation.Screen

fun NavGraphBuilder.HomeNavGraph(
    navController: NavController
){
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route,
//            arguments = listOf(navArgument("id"){
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 0;
//                    nullable = true;
                    navArgument(DETAIL_ARGUMENT_KEY_2) {
                        type = NavType.StringType
                        defaultValue = "Saad Yousuf"
                    }
                }),
        ) {
            Log.d("Args", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            Log.d("Args", it.arguments?.getString(DETAIL_ARGUMENT_KEY_2).toString())
            DetailScreen(navController = navController)
        }
    }
}