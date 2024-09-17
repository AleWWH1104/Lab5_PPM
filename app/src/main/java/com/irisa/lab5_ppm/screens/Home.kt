package com.irisa.lab5_ppm.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.tooling.preview.Preview
import com.irisa.lab5_ppm.R
import com.irisa.lab5_ppm.navigation.AppScreens
import com.irisa.lab5_ppm.ui.theme.Lab5_ppmTheme

@Composable
fun Event_Item(imageResId: Int, title: String, text: String, navController: NavController ) {
    Column(
        modifier = Modifier
            .width(150.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFF299DAD))
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
            .fillMaxWidth() .height(90.dp))
        {
            Image(painterResource(id = imageResId), contentDescription = title, modifier = Modifier
                .fillMaxSize())
        }

        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            navController.navigate(AppScreens.Detail.createRoute(imageResId, title))
        }, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF298DAD)), shape = RectangleShape) {
            Text(text = title, fontSize = 16.sp, textAlign = TextAlign.Start)
        }
        Text(text = text, fontSize = 12.sp)
    }
}

@Composable
fun Event_Screen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize() // Asegura que el contenido ocupe toda la pantalla
            .padding(15.dp)
            .verticalScroll(rememberScrollState()), // Permitir scroll si es necesario
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        nav_banner(navController)

        // Your Favorites Section
        Column(
            modifier = Modifier.fillMaxWidth(), // Asegura que este contenido ocupe todo el ancho
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Your favorites",
                fontSize = 18.sp,
                modifier = Modifier.padding(16.dp)
            )

            // Primera fila
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .fillMaxWidth()
            ) {
                Event_Item(
                    imageResId = R.drawable.concert1,
                    title = "Title 1",
                    text = "Supporting text",
                    navController = navController
                )
                Event_Item(
                    imageResId = R.drawable.concert2,
                    title = "Title 2",
                    text = "Supporting text",
                    navController = navController
                )
            }

            // Segunda fila
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .fillMaxWidth()
            ) {
                Event_Item(
                    imageResId = R.drawable.concert3,
                    title = "Title 3",
                    text = "Supporting text",
                    navController = navController
                )
                Event_Item(
                    imageResId = R.drawable.concert1,
                    title = "Title 4",
                    text = "Supporting text",
                    navController = navController
                )
            }
        }

        // All concerts Section
        Column(
            modifier = Modifier.fillMaxWidth(), // Asegura que este contenido ocupe todo el ancho
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "All Concerts",
                fontSize = 18.sp,
                modifier = Modifier.padding(16.dp)
            )

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .fillMaxWidth()
            ) {
                Event_Item(
                    imageResId = R.drawable.concert1,
                    title = "Title 1",
                    text = "Supporting text",
                    navController = navController
                )
                Event_Item(
                    imageResId = R.drawable.concert2,
                    title = "Title 2",
                    text = "Supporting text",
                    navController = navController
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab5_ppmTheme {
        val navController = rememberNavController()
        Event_Screen(navController)
    }
}
