package com.example.notesmvvmjetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.notesmvvmjetpackcompose.screens.*

sealed class NavRoute(val route: String) {
    object StartScreen : NavRoute(route = "start_screen")
    object MainScreen : NavRoute(route = "main_screen")
    object AddScreen : NavRoute(route = "add_screen")
    object NoteScreen : NavRoute(route = "note_screen")
}

@Composable
fun RouteNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoute.StartScreen.route) {
        composable(NavRoute.StartScreen.route) {
            StartScreen(navController = navController)
        }
        composable(NavRoute.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(NavRoute.AddScreen.route) {
            AddScreen(navController = navController)
        }
        composable(NavRoute.NoteScreen.route) {
            NoteScreen(navController = navController)
        }
    }
}