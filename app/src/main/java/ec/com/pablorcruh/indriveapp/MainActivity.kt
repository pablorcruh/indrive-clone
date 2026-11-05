package ec.com.pablorcruh.indriveapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ec.com.pablorcruh.indriveapp.presentation.screens.auth.login.LoginScreen
import ec.com.pablorcruh.indriveapp.ui.theme.IndriveappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IndriveappTheme {
                LoginScreen()
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    IndriveappTheme {
        LoginScreen()
    }
}