package com.example.animated_shimmer_effect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.animated_shimmer_effect.navigation.SetupNavGraph
import com.example.animated_shimmer_effect.ui.theme.Animated_Shimmer_EffectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Animated_Shimmer_EffectTheme {
//                repeat(7) {
//                    AnimatedShimmer()
//                }
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Animated_Shimmer_EffectTheme {

    }
}