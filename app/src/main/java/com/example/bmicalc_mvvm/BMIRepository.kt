package com.example.bmicalc_mvvm

import androidx.compose.ui.Modifier

class BMIRepository(
    private var weight: String,
    private var height: String
) {
    fun calculateBMI(): Float {
        val heightValue = this.height.toFloatOrNull() ?: 0.0f
        val weightValue = this.weight.toIntOrNull() ?: 0
        val bmi = if (weightValue > 0 && heightValue > 0) weightValue / (heightValue * heightValue) else 0.0f

        //val bmi = if (weight > 0 && height > 0) weight / (height * height) else 0.0f
        return(bmi)
    }
    fun getWeight(): String {
        return(this.weight)
    }
    fun getHeight(): String{
        return(this.height)
    }
    fun setHeight(h: String){
        println("Setting height: ${h}")
        this.height = h
    }
    fun setWeight(w: String){
        println("Setting weight: ${w}")
        this.weight = w
    }
}