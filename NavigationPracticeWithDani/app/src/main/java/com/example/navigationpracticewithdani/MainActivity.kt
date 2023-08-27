package com.example.navigationpracticewithdani

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigationpracticewithdani.navigation.NavGRaph.ASetupNavGraph
import com.example.navigationpracticewithdani.ui.theme.NavigationPracticeWithDaniTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationPracticeWithDaniTheme {
                navController = rememberNavController()
//                SetupNavGraph(navController = navController)
//                MainScreen()
                ASetupNavGraph(navController = navController)
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavigationPracticeWithDaniTheme {

    }
}