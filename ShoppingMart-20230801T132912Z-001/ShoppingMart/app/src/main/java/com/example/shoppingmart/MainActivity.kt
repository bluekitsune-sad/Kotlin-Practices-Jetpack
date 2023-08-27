package com.example.shoppingmart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.shoppingmart.ui.navigation.ShoppingMartNavigation
import com.example.shoppingmart.ui.theme.ShoppingMartTheme

/*
https://www.youtube.com/watch?v=-Kx9D54laqU&list=PLUPcj46QWTDWlxtIwE3A6VEWUFEO8nh0Z&index=6
*/

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShoppingMartTheme {
                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
                    ShoppingMartApp()
//                }
            }
        }
    }

    @Composable
    fun ShoppingMartApp() {
        ShoppingMartNavigation()
    }
}
