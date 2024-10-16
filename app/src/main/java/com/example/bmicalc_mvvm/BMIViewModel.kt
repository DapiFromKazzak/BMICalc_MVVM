package com.example.bmicalc_mvvm

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BMIViewModel (): ViewModel(){
    var heightInput: String by mutableStateOf("")
    var weightInput: String by mutableStateOf("")


    fun calculateBMI(weightInput:String, heightInput:String):Number {
        val height = heightInput.toFloatOrNull() ?: 0.0f
        val weight = weightInput.toIntOrNull() ?: 0
        val bmi = if (weight > 0 && height > 0) weight / (height * height) else 0.0
        println("BMI: ${bmi}")
        return bmi
    }
}
/*
class BMIViewModel (
    private val repository: BMIRepository
): ViewModel(){
    fun calculateBMI(): Float {
        return repository.calculateBMI()
    }
    fun getWeight():String{
        return repository.getWeight()
    }
    fun getHeight():String{
        return repository.getHeight()
    }
    fun setHeight(height: String){
        println("Setting height: ${height}")
        repository.setHeight(height)
    }
    fun setWeight(weight: String){
        repository.setWeight(weight)
    }

}

*/