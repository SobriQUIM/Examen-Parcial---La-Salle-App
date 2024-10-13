package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController

@Composable
fun SubjectDetailsScreen(subjectName: String) {
    // Simular datos de calificaciones por parcial
    val partialGrades = listOf(9.0, 8.5, 9.2)

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        Text(text = "Calificaciones para $subjectName", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))

        // Mostrar las calificaciones de cada parcial
        partialGrades.forEachIndexed { index, grade ->
            Text(text = "Parcial ${index + 1}: $grade", fontSize = 18.sp)
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
