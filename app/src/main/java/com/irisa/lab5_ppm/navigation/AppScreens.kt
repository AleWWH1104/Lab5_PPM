package com.irisa.lab5_ppm.navigation

sealed class AppScreens(val route: String) {
    object Home: AppScreens("home_screen")
    object Profile: AppScreens("profile_screen")
    object Detail: AppScreens("detail_screen")
    object Places: AppScreens("places_screen")

}