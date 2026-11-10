package ec.com.pablorcruh.indriveapp.presentation.screens.auth.login

import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(): ViewModel() {

    var state by mutableStateOf(LoginState())
        private set

    var errorMessage by mutableStateOf("")

    fun onEmailInput(email: String){
        state = state.copy(email = email)
    }

    fun onPasswordInput(password: String){
        state = state.copy(password = password)
    }

    fun onLoginSubmit(){
        if(isValidForm()){

        }
    }

    fun isValidForm(): Boolean{
        errorMessage = ""
        if(state.email.isEmpty()){
            errorMessage = "Ingresar Email"
            return false
        }
        if(state.password.isEmpty()){
            errorMessage ="Ingresar Password"
            return false
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(state.email).matches()){
            errorMessage = "Email con formato no valido"
            return false
        }
        if(state.password.length < 6){
            errorMessage = "El password debe tener al menos 6 caracteres"
            return false
        }
        return true
    }
}