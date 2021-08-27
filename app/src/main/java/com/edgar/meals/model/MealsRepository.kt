package com.edgar.meals.model

import com.edgar.meals.model.api.MealsWebService
import com.edgar.meals.model.response.MealsCategoriesResponse

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    suspend fun getMeals(): MealsCategoriesResponse {
        return webService.getMeals()
    }
}