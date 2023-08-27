package com.example.navigationpracticewithdani.Screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Inner1_1_2( navController: NavController) {
    Text(
        modifier = Modifier,
        text = "Stop currently in Inner 1_1_2",
        color = MaterialTheme.colorScheme.primary,
        fontSize = MaterialTheme.typography.titleLarge.fontSize,
        fontWeight = FontWeight.Bold
    )
    Text(
        modifier = Modifier
            .padding(top = 150.dp)
            ,
        text ="Stop currently in Inner 1_1_2",
        fontSize = MaterialTheme.typography.titleMedium.fontSize,
        fontWeight = FontWeight.Bold
    )
}