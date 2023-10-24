package com.example.entrepantallas.navigation

import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.entrepantallas.screen.FirstScreen
import com.example.entrepantallas.screen.SecondScreen

@Composable
fun AppNavigatiob(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.firstScreen.route){
        composable(route = AppScreen.firstScreen.route){
            FirstScreen(navController)
        }
        composable(route = AppScreen.secondScreen.route + "/{text}",
            arguments = listOf(navArgument(name = "text"){
                type = NavType.StringType
                }
            )
        ){
            SecondScreen(navController, it.arguments?.getString("text"))
        }
    }
}