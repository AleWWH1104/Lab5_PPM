package com.irisa.lab5_ppm.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.irisa.lab5_ppm.R

@Composable
fun Detail_Screen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ){
        nav_banner(navController)
        Image(
            painterResource(id = R.drawable.concert1), contentDescription = "",
            contentScale= ContentScale.Fit )
        Text(modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF299DAD)),
            text = "lugar", fontSize = 16.sp)
        Text(modifier = Modifier.padding(10.dp),
            text = "Title", style = MaterialTheme.typography.titleLarge)
        Row( modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            // Iconos al lado derecho
            Icon(imageVector = Icons.Filled.DateRange, contentDescription = "fecha")
            // Título en el lado izquierdo
            Text(
                text = "Fecha",
                Modifier.padding(10.dp),
                fontSize = 16.sp ,color= Color.Gray
            )
            Text(
                text = "hora",
                Modifier.padding(10.dp),
                fontSize = 16.sp, color= Color.Gray
            )
        }
        Text(modifier = Modifier.padding(10.dp),
            text = "About", style = MaterialTheme.typography.titleLarge)
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit sed do.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(10.dp)
        )
        // Usamos weight(1f) para ocupar el espacio restante
        Spacer(modifier = Modifier.weight(1f))
        Row(// Row en la parte inferior
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp), // Espacio superior opcional
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(onClick = { /* Acción del botón izquierdo */ }, colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFafdbe1), contentColor = Color.Black)) {
                Text(text = "Favorito")
            }
            Button(onClick = { /* Acción del botón derecho */ }, colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFafdbe1), contentColor = Color.Black)) {
                Text(text = "Comprar")
            }
        }
    }
}