package com.artifitia.jetpackcomposelearning

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun MyAppNavigation(){

    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Routes.screenA, builder = {
        composable( Routes.screenA) {
            TestScreen(navController)
        }
        composable( Routes.screenB+"/{tet}") {
            var name= it.arguments?.getString("tet")
            TestBScreen(name= name?:"No Name")
        }
    })
}