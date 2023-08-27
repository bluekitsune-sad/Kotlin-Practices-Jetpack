package com.example.navigationpracticewithdani.Screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navigationpracticewithdani.navigation.Screen

@Composable
fun Inner1_2( navController: NavController) {
    Text(
        modifier = Modifier.clickable{
            navController.navigate(Screen.Inner1_2_1.route)
        },
        text = "Inner1_2_1",
        color = MaterialTheme.colorScheme.primary,
        fontSize = MaterialTheme.typography.titleLarge.fontSize,
        fontWeight = FontWeight.Bold
    )
    Text(
        modifier = Modifier
            .padding(top = 150.dp)
            .clickable {
                navController.navigate(Screen.Inner1_2_2.route)
            },
        text ="Inner1_2_2",
        fontSize = MaterialTheme.typography.titleMedium.fontSize,
        fontWeight = FontWeight.Bold
    )
}