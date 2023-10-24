package com.example.entrepantallas.navigation

sealed class AppScreen(val route: String){
    object firstScreen: AppScreen("first_screen")
    object secondScreen: AppScreen("second_screen")
}
