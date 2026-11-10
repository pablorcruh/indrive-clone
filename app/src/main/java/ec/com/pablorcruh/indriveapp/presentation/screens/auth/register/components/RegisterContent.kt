package ec.com.pablorcruh.indriveapp.presentation.screens.auth.register.components

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.NavHostController
import ec.com.pablorcruh.indriveapp.R
import ec.com.pablorcruh.indriveapp.presentation.components.DefaultButton
import ec.com.pablorcruh.indriveapp.presentation.components.DefaultOutlinedTextField
import ec.com.pablorcruh.indriveapp.presentation.screens.auth.register.RegisterViewModel

@Composable
fun RegisterContent(
    navHostController: NavHostController,
    paddingValues: PaddingValues,
    viewModel: RegisterViewModel = hiltViewModel()
){
    val state = viewModel.state

    val context = LocalContext.current

    LaunchedEffect(key1 = viewModel.errorMessage) {
        if(viewModel.errorMessage.isNotEmpty()){
            Toast.makeText(context, viewModel.errorMessage, Toast.LENGTH_LONG).show()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color(0XFFAC9E1F),Color(0xFFFFE91F))
                )
            )
            .padding(paddingValues)
    ){
        Column(
            modifier = Modifier
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ){
            Text(
                text = "Login",
                fontSize = 27.sp,
                color = Color.Black,
                modifier = Modifier
                    .rotate(90f)
                    .padding(top=10.dp)
                    .clickable{
                        navHostController.popBackStack()
                    }
            )
            Spacer(modifier = Modifier.height(150.dp))
            Text(
                text = "Register",
                fontSize = 33.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier
                    .rotate(90f)
                    .padding(top=60.dp)
            )
            Spacer(modifier = Modifier.height(250.dp))
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 60.dp, bottom = 35.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0XFFFEFA1E),Color(0xFFF3CE00))
                    ),
                    shape = RoundedCornerShape(
                        topStart = 35.dp,
                        bottomStart = 35.dp
                    )
                )
        ){
            Column(
                modifier = Modifier
                    .statusBarsPadding(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)
                ){
                    Image(
                        modifier = Modifier
                            .size(150.dp)
                            .align(Alignment.Center),
                        painter = painterResource(id = R.drawable.car_white),
                        contentDescription = null
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                DefaultOutlinedTextField(
                    modifier = Modifier,
                    value = state.name,
                    label = "Nombre",
                    icon = Icons.Outlined.Person,
                    onValueChange = {
                        viewModel.onNameInput(it)
                    }
                )
                Spacer(modifier = Modifier.height(10.dp))
                DefaultOutlinedTextField(
                    modifier = Modifier,
                    value = state.lastName,
                    label = "Apellido",
                    icon = Icons.Outlined.Person,
                    onValueChange = {
                        viewModel.onLastNameInput(it)
                    }
                )
                Spacer(modifier = Modifier.height(10.dp))
                DefaultOutlinedTextField(
                    modifier = Modifier,
                    value = state.email,
                    label = "Email",
                    icon = Icons.Outlined.Email,
                    onValueChange = {
                        viewModel.onEmailInput(it)
                    }
                )
                Spacer(modifier = Modifier.height(10.dp))
                DefaultOutlinedTextField(
                    modifier = Modifier,
                    value = state.phone,
                    label = "Telefono",
                    icon = Icons.Outlined.Phone,
                    onValueChange = {
                        viewModel.onPhoneInput(it)
                    },
                    keyboardType = KeyboardType.Email
                )
                Spacer(modifier = Modifier.height(10.dp))
                DefaultOutlinedTextField(
                    modifier = Modifier,
                    value = state.password,
                    label = "Password",
                    icon = Icons.Outlined.Lock,
                    onValueChange = {
                        viewModel.onPasswordInput(it)
                    },
                    hiddenText = true
                )
                Spacer(modifier = Modifier.height(10.dp))
                DefaultOutlinedTextField(
                    modifier = Modifier,
                    value = state.confirmPassword,
                    label = "Repiie Password",
                    icon = Icons.Outlined.Lock,
                    onValueChange = {
                        viewModel.onConfirmPasswordInput(it)
                    },
                    hiddenText = true
                )
                Spacer(modifier = Modifier.weight(1f))
                DefaultButton(
                    modifier = Modifier,
                    text = "Crear Usuario",
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(15.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){

                    Spacer(modifier = Modifier
                        .width(30.dp)
                        .height(1.dp)
                        .background(Color.Black)
                    )
                    Text(
                        modifier = Modifier.padding(horizontal =7.dp ),
                        text = "O",
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier
                        .width(30.dp)
                        .height(1.dp)
                        .background(Color.Black)
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ){
                    Text(
                        text = "Ya tienes cuenta?",
                        color = Color.Black,
                        fontSize = 17.sp
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        modifier = Modifier.clickable{
                            navHostController.popBackStack()
                        },
                        text = "Iniciar Sesion",
                        color = Color.Black,
                        fontSize = 17.sp
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
            }
        }
    }
}