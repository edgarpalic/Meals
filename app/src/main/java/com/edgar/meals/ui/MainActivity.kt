package com.edgar.meals.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.edgar.meals.ui.mealz.MealsCategoriesScreen
import com.edgar.meals.ui.theme.MealsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MealsTheme {
                MealsCategoriesScreen()
            }
        }
    }
}