package com.example.notesmvvmjetpackcompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.notesmvvmjetpackcompose.navigation.NavRoute

@Composable
fun AddScreen(navController: NavHostController) {
    var title by remember {
        mutableStateOf("")
    }
    var subtitle by remember {
        mutableStateOf("")
    }
    Scaffold() {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Add new note",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
                )
            OutlinedTextField(
                value = title,
                label = {
                    Text(text = "Entered title")
                },
                onValueChange = {
                    title = it
                }
            )
            OutlinedTextField(
                value = subtitle,
                label = {
                    Text(text = "Entered subtitle")
                },
                onValueChange = {
                    subtitle = it
                }
            )
            Button(
                onClick = { navController.navigate(NavRoute.MainScreen.route) }
            ) {
                Text(text = "Add note")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAddScreen() {
    MainScreen(navController = rememberNavController())
}