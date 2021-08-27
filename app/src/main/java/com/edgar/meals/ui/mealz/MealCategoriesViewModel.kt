package com.edgar.meals.ui.mealz

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.edgar.meals.model.MealsRepository
import com.edgar.meals.model.response.MealResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MealCategoriesViewModel(private val repository: MealsRepository = MealsRepository()) :
    ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val meals = getMeals()
            mealsState.value = meals
        }
    }

    val mealsState: MutableState<List<MealResponse>> = mutableStateOf(emptyList<MealResponse>())

    private suspend fun getMeals(): List<MealResponse> {
        return repository.getMeals().categories
    }
}