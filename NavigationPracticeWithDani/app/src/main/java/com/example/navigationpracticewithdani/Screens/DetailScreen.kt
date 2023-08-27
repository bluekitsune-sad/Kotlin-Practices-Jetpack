package com.example.navigationpracticewithdani.Screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigationpracticewithdani.navigation.Screen

@Composable
fun DetailScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            modifier = Modifier.clickable{
//                               navController.navigate(Screen.Home.route) // this will make it stay in the back stack
//                                         navController.popBackStack() // this will simply pop it
                                         navController.navigate(Screen.Home.route){
                                             popUpTo(Screen.Home.route){
                                                 inclusive = true
                                             }
                                         }
        },
            text = "Detail",
            color = Color.Red,
            fontSize = MaterialTheme.typography.titleMedium.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}
