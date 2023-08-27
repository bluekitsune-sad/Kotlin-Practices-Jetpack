package com.example.navigation.navigation.NavGRaph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.navigation.navigation.HOME_ROUTE
import com.example.navigation.navigation.ROOT_ROUTE
import com.example.navigation.navigation.Screen

@Composable
fun SetupNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE

    ){
        HomeNavGraph(navController = navController) // this is for the root NavGraph
        AuthenNavGraoh(navController = navController) // this is for nested navigation Screen
    }
}