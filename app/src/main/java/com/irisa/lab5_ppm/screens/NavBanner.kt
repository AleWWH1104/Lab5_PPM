package com.irisa.lab5_ppm.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.navigation.NavController
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.irisa.lab5_ppm.navigation.AppScreens

@Composable
fun nav_banner(navController: NavController) {
    var expanded by remember { mutableStateOf(false) } // Controla si el menú está desplegado o no

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFafdbe1)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // Título en el lado izquierdo
        Text(
            text = "TodoEventos",
            Modifier.padding(10.dp),
            style = MaterialTheme.typography.titleLarge
        )

        // Botón de tres puntos en el lado derecho
        IconButton(onClick = { expanded = true }) { // Despliega el menú
            Icon(Icons.Filled.MoreVert, contentDescription = "Menú")
        }

        // Menú desplegable
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            DropdownMenuItem(
                text = { Text("Home") },
                onClick = {
                    expanded = false
                    navController.navigate(route= AppScreens.Home.route) // Navega a la pantalla de Home
                }
            )
            DropdownMenuItem(
                text = { Text("Perfil") },
                onClick = {
                    expanded = false
                    navController.navigate(route= AppScreens.Profile.route) // Navega a la pantalla de Perfil
                }
            )
            DropdownMenuItem(
                text = { Text("Places") },
                onClick = {
                    expanded = false
                    navController.navigate(route= AppScreens.Places.route) // Navega a la pantalla de Places
                }
            )
        }
    }
}