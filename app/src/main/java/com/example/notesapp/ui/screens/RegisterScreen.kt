package com.example.notesapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RegisterScreen(modifier: Modifier = Modifier) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var againpassword by remember { mutableStateOf("") }

    Box(modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = modifier.padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Welcome to Notes App", fontSize = 36.sp, fontWeight = FontWeight.SemiBold, textAlign = TextAlign.Center)
            Spacer(modifier = modifier.height(12.dp))
            OutlinedTextField(value = username, onValueChange = {username = it}, label = { Text(text = "Username") }, placeholder = { Text(text = "Enter your username") })
            Spacer(modifier = modifier.height(12.dp))
            OutlinedTextField(value = password, onValueChange = {password = it}, label = { Text(text = "Password") }, placeholder = { Text(text = "Enter your password") })
            Spacer(modifier = modifier.height(12.dp))
            OutlinedTextField(value = againpassword, onValueChange = {againpassword = it}, label = { Text(text = "Password Again") }, placeholder = { Text(text = "Enter your password again") })
            Spacer(modifier = modifier.height(12.dp))
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun RegisterScreenPreview() {
    RegisterScreen()
}