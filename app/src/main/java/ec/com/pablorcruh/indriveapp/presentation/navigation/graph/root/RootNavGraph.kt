package ec.com.pablorcruh.indriveapp.presentation.navigation.graph.root

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import ec.com.pablorcruh.indriveapp.presentation.navigation.Graph
import ec.com.pablorcruh.indriveapp.presentation.navigation.graph.auth.AuthNavGraph

@Composable
fun RootNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTH
    ){
        AuthNavGraph(navController)
    }
}