package ec.com.pablorcruh.indriveapp.presentation.screens.auth.register

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ec.com.pablorcruh.indriveapp.presentation.screens.auth.register.components.RegisterContent
import ec.com.pablorcruh.indriveapp.ui.theme.IndriveappTheme

@Composable
fun RegisterScreen(navHostController: NavHostController){
    Scaffold() {paddingValues ->
        RegisterContent(navHostController, paddingValues)
    }
}

@Preview
@Composable
fun RegisterScreenPreview(
){
    IndriveappTheme() {
        RegisterScreen(rememberNavController())
    }
}