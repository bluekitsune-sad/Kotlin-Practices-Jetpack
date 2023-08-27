package com.example.shoppingmart.ui

import androidx.annotation.DrawableRes
import com.example.shoppingmart.R

object Utils {
    val category = listOf(
//        Category(title = "Drink" , resId = androidx.core.R.drawable.ic_call_answer , id = 0),
        Category(title = "Drink" , resId = R.drawable.ic_drinks , id = 0),
        Category(title = "Vegetable" , resId = R.drawable.ic_vegitables , id = 1),
        Category(title = "Fruits" , resId = R.drawable.ic_fruits , id = 2),
        Category(title = "Cleaning" , resId = R.drawable.ic_cleaning , id = 3),
        Category(title = "Electronic" , resId = R.drawable.ic_electronic , id = 4),
//        Category(title = "None" , resId = androidx.core.R.drawable.ic_call_answer , id = 10001),
        )
}

data class Category(
    @DrawableRes val resId: Int = -1,
    val title: String = "",
    val id: Int = -1
)