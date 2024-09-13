package com.irisa.lab5_ppm.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun place_item(center: String, location: String){
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = Icons.Filled.LocationOn, contentDescription = "")
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(10.dp)
        ) {
            Text(text = center, fontSize = 16.sp)
            Text(text = location, fontSize = 12.sp)
        }

        // Ícono a la derecha
        IconButton(onClick = {
            // Acción al hacer clic en el botón
        }) {
            Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = "")
        }
    }

}

@Composable
fun Places_Screen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(15.dp), horizontalAlignment = Alignment.CenterHorizontally
    ){
        nav_banner(navController)
        place_item("Guns and Roses LA", "LA Hall")
        place_item("Guns and Roses Denver", "Denver Hall")
        place_item("Guns and Roses New York", "Maddison Square Garden")
    }
}