package ec.com.pablorcruh.indriveapp.presentation.navigation.graph.auth

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import ec.com.pablorcruh.indriveapp.presentation.navigation.Graph
import ec.com.pablorcruh.indriveapp.presentation.navigation.screen.auth.AuthScreen
import ec.com.pablorcruh.indriveapp.presentation.screens.auth.login.LoginScreen
import ec.com.pablorcruh.indriveapp.presentation.screens.auth.register.RegisterScreen

fun NavGraphBuilder.AuthNavGraph(navController: NavHostController){
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ){
        composable(route = AuthScreen.Login.route){
            LoginScreen(navController)
        }
        composable(route = AuthScreen.Register.route){
            RegisterScreen(navController)
        }
    }
}