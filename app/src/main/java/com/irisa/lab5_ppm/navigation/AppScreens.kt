package com.irisa.lab5_ppm.navigation

sealed class AppScreens(val route: String) {
    object Home: AppScreens("home_screen")
    object Profile: AppScreens("profile_screen")
    object Detail: AppScreens("detail_screen/{imageId}/{title}"){
        fun createRoute(imageId: Int, title: String): String {
            return "detail_screen/$imageId/$title"
        }
    }
    object Places: AppScreens("places_screen")

}