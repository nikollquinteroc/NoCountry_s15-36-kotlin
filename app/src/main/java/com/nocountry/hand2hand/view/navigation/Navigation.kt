package com.nocountry.hand2hand.view.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.nocountry.hand2hand.view.screens.HomeScreen
import com.nocountry.hand2hand.view.screens.LoginScreen
import com.nocountry.hand2hand.view.screens.RegistroScreen

@Composable
fun Navigation(context: Context, navController: NavHostController = rememberNavController()) {
    //val realtime = RealtimeManager()

    NavHost(
        navController = navController,
        startDestination = MainDestinations.LOGIN_ROUTE
    ){
        composable(MainDestinations.REGISTER_ROUTE){
            RegistroScreen(navigation = navController)
        }
        composable(MainDestinations.HOME_ROUTE){
            HomeScreen()
        }
        composable(MainDestinations.LOGIN_ROUTE){
            LoginScreen(navigation = navController)
        }
    }
}