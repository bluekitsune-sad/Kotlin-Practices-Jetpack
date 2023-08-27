package com.example.shoppingmart.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.shoppingmart.ui.detail.DetailScreen
import com.example.shoppingmart.ui.home.HomeScreen
import com.example.shoppingmart.ui.theme.Animation.AnimatedSplashScreen

enum class Routes{
    Home,
    Detail,
    Splash
}

@Composable
fun ShoppingMartNavigation(
    navHostController: NavHostController = rememberNavController()
) {
    NavHost(navController = navHostController, startDestination = Routes.Splash.name) {

        composable(route = Routes.Splash.name) {
            AnimatedSplashScreen(navController = navHostController, onNavigate = {
                navHostController.navigate(route = Routes.Home.name)
            })
        }

        composable(route = Routes.Home.name){
//            HomeScreen(onNavigate = {id ->
//                navHostController.navigate(route = "${Routes.Detail.name}")
//
//            })
            HomeScreen(onNavigate = { id ->
                navHostController.navigate(route = "${Routes.Detail.name}?id=$id")
            })
        }

        composable(
            route = "${Routes.Detail.name}?id={id}",
            arguments = listOf(navArgument("id"){type = NavType.IntType})
//            route = "${Routes.Detail.name}/{id}", // Use {} instead of ?id={}
//            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ){
            val id = it.arguments?.getInt("id") ?: -1
            DetailScreen(id = id) {
                navHostController.navigateUp()
            }
        }
    }
}