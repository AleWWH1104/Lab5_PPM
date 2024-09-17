package com.irisa.lab5_ppm.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.*
import com.irisa.lab5_ppm.screens.*
import com.irisa.lab5_ppm.R

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
        composable(
            route = AppScreens.Detail.route,
            arguments = listOf(
            navArgument("imageId") { type = NavType.IntType },
            navArgument("title") { type = NavType.StringType }
        )){ backStackEntry ->
            val imageId = backStackEntry.arguments?.getInt("imageId") ?: R.drawable.default1
            val title = backStackEntry.arguments?.getString("title") ?: "No Title"
            Detail_Screen(navController, imageId, title)
        }
        composable(route = AppScreens.Profile.route){
            Profile_Screen(navController)
        }
    }
}