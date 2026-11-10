package ec.com.pablorcruh.indriveapp.presentation.screens.auth.register

import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor() : ViewModel(){

    var state by mutableStateOf(RegisterState())
        private set

    var errorMessage by mutableStateOf("")

    fun register(){
        if(isValidForm()){

        }
    }

    fun onNameInput(name: String){
        state = state.copy(name = name)
    }

    fun onLastNameInput(lastName: String){
        state = state.copy(lastName = lastName)
    }

    fun onEmailInput(email: String){
        state = state.copy(email = email)
    }

    fun onPhoneInput(phone: String){
        state = state.copy(phone = phone)
    }

    fun onPasswordInput(password: String){
        state = state.copy(password = password)
    }

    fun onConfirmPasswordInput(confirmPassword: String){
        state = state.copy(confirmPassword = confirmPassword)
    }

    fun isValidForm(): Boolean{
        errorMessage = ""
        if(state.name.isEmpty()){
            errorMessage = "Ingresar un nombre"
            return false
        }

        if(state.lastName.isEmpty()){
            errorMessage = "Ingresar un apellido"
            return false
        }
        if(state.phone.isEmpty()){
            errorMessage = "Ingresar un telefono"
            return false
        }
        if(state.email.isEmpty()){
            errorMessage = "Ingresar un email"
            return false
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(state.email).matches()){
            errorMessage = "Ingresar un email valido"
            return false
        }

        if(state.password.length < 6){
            errorMessage = "El password debe tener mas de 6 caracteres"
            return false
        }

        if(state.confirmPassword.length < 6){
            errorMessage = "El password debe tener mas de 6 caracteres"
            return false
        }

        if(!state.password.equals(state.confirmPassword)){
            errorMessage = "El password y confirmPassword deben ser iguales"
            return false
        }

        return true
    }
}