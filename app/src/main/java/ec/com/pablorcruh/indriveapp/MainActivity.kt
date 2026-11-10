package ec.com.pablorcruh.indriveapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import ec.com.pablorcruh.indriveapp.presentation.navigation.graph.root.RootNavGraph
import ec.com.pablorcruh.indriveapp.ui.theme.IndriveappTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navHostController : NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IndriveappTheme {
                Surface() {
                    navHostController = rememberNavController()
                    RootNavGraph(navHostController)
                }
            }
        }
    }
}
