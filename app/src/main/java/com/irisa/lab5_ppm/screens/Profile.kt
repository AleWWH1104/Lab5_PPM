package com.irisa.lab5_ppm.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.irisa.lab5_ppm.R


@Composable
fun Profile_Screen(navController: NavController) {
    var switchState by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        nav_banner(navController)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .background(Color(0xFF299DAD)),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painterResource(id = R.drawable.perfil), contentDescription = "perfil", modifier = Modifier
                    .size(150.dp)
                    .padding(10.dp))
            Text(modifier = Modifier.padding(16.dp),
                text = "Nombre Apellido",
                style = MaterialTheme.typography.titleLarge
            )
        }
        Option_Perfil(iconF = Icons.Filled.AccountCircle, title = "Edit Profile", contentDescription = "profile", trailingContent = { Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = "",  Modifier.padding(5.dp)) })
        Option_Perfil(iconF = Icons.Filled.Lock, title = "Reset Password", contentDescription = "password", trailingContent = { Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = "", Modifier.padding(5.dp)) })
        Option_Perfil(iconF = Icons.Filled.Notifications, title = "Notifications", contentDescription = "notificacion", trailingContent = {
            Switch(checked = switchState, onCheckedChange = { switchState = it }, Modifier.padding(5.dp))
        })
        Option_Perfil(iconF = Icons.Filled.Favorite, title = "Favorites", contentDescription = "favorite", trailingContent = { Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = "", Modifier.padding(5.dp)) })
    }
}

@Composable
fun Option_Perfil(iconF: ImageVector, title: String, contentDescription: String, trailingContent: @Composable () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFafdbe1)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(iconF, contentDescription = contentDescription, Modifier.padding(5.dp))
        Text(text = title, Modifier.padding(10.dp), fontSize = 16.sp)
        Spacer(modifier = Modifier.weight(1f))
        trailingContent()
    }
}

