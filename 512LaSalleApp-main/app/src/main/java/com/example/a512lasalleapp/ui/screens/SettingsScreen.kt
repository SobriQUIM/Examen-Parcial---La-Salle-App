package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.a512lasalleapp.R
import com.example.a512lasalleapp.ui.screens.Change_password_screen
import com.example.a512lasalleapp.ui.utils.Screens
import com.example.a512lasalleapp.ui.screens.Change_password_screen

// Hacemos que el NavController sea opcional con un valor por defecto null
@Composable
fun SettingsScreen(innerPadding: PaddingValues, navController: NavController? = null) {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding)) {

        Column(modifier = Modifier.padding(16.dp)) {
            // Información del Alumno
            StudentInfo()

            Spacer(modifier = Modifier.height(24.dp))

            // Opciones
            OptionItem(text = "Cambiar contraseña", onClick = {
                navController?.navigate(Screens.Changepassword.route)
            })

            Spacer(modifier = Modifier.height(16.dp))

            OptionItem(text = "Cambiar tema de la aplicacion", onClick = {
                navController?.navigate(Screens.ChangeTheme.route)
            })

            }
        }
    }



@Composable
fun StudentInfo() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        // Imagen circular del alumno
        Image(
            painter = painterResource(id = R.drawable.estudiante_foto), // Reemplazar con la imagen del estudiante
            contentDescription = "Imagen del alumno",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
    }

    Spacer(modifier = Modifier.height(16.dp))

    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        Text(text = "Nombre Completo: Carla Martínez Padilla", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text(text = "Fecha de Nacimiento: 15/08/2000", fontSize = 16.sp)
        Text(text = "Correo: cmp76890@lasallebajio.edu.mx", fontSize = 16.sp)
    }
}

@Composable
fun OptionItem(text: String, onClick: () -> Unit) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = text, fontSize = 16.sp)
            Button(onClick = onClick) {
                Icon(Icons.Default.ArrowForward, contentDescription = null)
            }
        }
    }
}


// Vista previa para comprobar el diseño
@Preview(showBackground = true)
@Composable
fun SettingsScreenPreview() {
    // Llamamos a SettingsScreen sin pasar NavController, ya que es opcional ahora
    SettingsScreen(innerPadding = PaddingValues(0.dp))
}


