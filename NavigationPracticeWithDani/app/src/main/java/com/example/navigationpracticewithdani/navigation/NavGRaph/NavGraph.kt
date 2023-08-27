package com.example.navigationpracticewithdani.navigation.NavGRaph

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.navigation.navigation.NavGRaph.UpperNavGraph
import com.example.navigationpracticewithdani.navigation.Screen
import com.example.navigationpracticewithdani.BottomBarScreen
import com.example.navigationpracticewithdani.Screens.AHomeScreen
import com.example.navigationpracticewithdani.Screens.DetailScreen
import com.example.navigationpracticewithdani.Screens.HomeScreen
import com.example.navigationpracticewithdani.Screens.LoginScreen
import com.example.navigationpracticewithdani.Screens.ProfileScreen
import com.example.navigationpracticewithdani.Screens.SettingsScreen
import com.example.navigationpracticewithdani.Screens.SignUpScreen

//simple Complex Navigation Graph
@Composable
fun SetupNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
    ){
//        composable(route = Screen.Home.route){
//            HomeScreen(navController)
//        }

        UpperNavGraph(navController = navController)
        LoverNavGraph(navController = navController)
    }
}
//Bottom Navigation Graph
@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
    }
}
//Navigation with arguments Graph
@Composable
fun ASetupNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.AHome.route,
    ){
        composable(route = Screen.AHome.route){
            AHomeScreen(navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument("id"){
                type = NavType.IntType
            })
        ){
            Log.d("Args", it.arguments?.getInt("id").toString())
            DetailScreen(navController)
        }
        composable(route = Screen.Signin.route){
            SignUpScreen(navController)
        }
        composable(route = Screen.Login.route){
            LoginScreen(navController)
        }
    }
}
