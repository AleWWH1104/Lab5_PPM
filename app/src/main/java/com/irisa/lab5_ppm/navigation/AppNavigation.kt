package com.irisa.lab5_ppm.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.irisa.lab5_ppm.screens.*

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.Home.route) {
        composable(route = AppScreens.Home.route){
            Event_Screen(navController)
        }
        composable(route = AppScreens.Places.route){
            Places_Screen(navController)
        }
        composable(route = AppScreens.Detail.route){
            Detail_Screen(navController)
        }
        composable(route = AppScreens.Profile.route){
            Profile_Screen(navController)
        }
    }
}