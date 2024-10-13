package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.a512lasalleapp.MainScreen
import com.example.a512lasalleapp.ui.components.Widget
import com.example.a512lasalleapp.ui.components.WidgetPreview
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme


//@Preview
@Composable
fun Change_password_screen(innerPadding: PaddingValues, navController: NavController? = null)  {
    Box(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Cambio de Contraseña",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
    WidgetPreview()
}



