package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.a512lasalleapp.ui.utils.Screens

@Composable
fun GradesScreen(innerPadding: PaddingValues, navController: NavController? = null) {
    // Datos del alumno y materias
    val studentName = "Carla Martínez Padilla"
    val career = "Ingeniería en Sistemas Computacionales"
    val semester = "5to Semestre"
    val gpa = 9.2
    val subjects = listOf(
        "Matemáticas" to 9.5,
        "Física" to 8.8,
        "Programación" to 9.7,
        "Base de Datos" to 9.0
    )

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding)) {

        Column(modifier = Modifier.padding(16.dp)) {
            // Información del alumno
            Text(text = "Nombre: $studentName", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(text = "Carrera: $career", fontSize = 18.sp)
            Text(text = "Semestre: $semester", fontSize = 18.sp)
            Text(text = "Promedio Acumulado: $gpa", fontSize = 18.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(16.dp))

            // Lista de materias
            Text(text = "Materias Cursadas:", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))

            // Mostrar cada materia con su promedio
            subjects.forEach { subject ->
                SubjectItem(subjectName = subject.first, average = subject.second, onClick = {
                    // Navegación a la pantalla de detalles de calificaciones por materia
                    navController?.navigate(Screens.SubjectDetails.route + "/${subject.first}")
                })
            }
        }
    }
}

@Composable
fun SubjectItem(subjectName: String, average: Double, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = subjectName, fontSize = 18.sp)
            Text(text = "Promedio: $average", fontSize = 18.sp)
        }
    }
}
