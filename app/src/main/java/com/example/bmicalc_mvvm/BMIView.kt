package com.example.bmicalc_mvvm

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class BMIView( private val viewModel: BMIViewModel) {
/*
    @Composable
    fun bmi(viewModel: BMIViewModel){

        val weight = viewModel.getWeight()
        val height = viewModel.getHeight()

        var heightInput: String by remember { mutableStateOf("") }
        var weightInput: String by remember { mutableStateOf("") }

        fun calculateBMI(){

        }

        Column {
            Text(
                text = "Otsikko",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 16.dp)
            )
            OutlinedTextField(
                value = height,
                onValueChange = {viewModel.setHeight(it.replace(',','.'))},
                label = {Text(stringResource(R.string.height))},
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxWidth()
            )
            OutlinedTextField(
                value = weight,
                onValueChange = {viewModel.setWeight(it.replace(',','.'))},
                label = { Text(text = "Paino") },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxWidth()
            )
            Text(text = stringResource(R.string.result) + String.format("%.2f",viewModel.calculateBMI()).replace(',','.'))
        }
    }
*/
}