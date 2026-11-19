package com.example.lab4mobile.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.lab4mobile.R

/**
 * Категория рекомендаций
 * @param titleRes Название категории
 * @param descriptionRes Краткое описание для главного экрана
 * @param iconRes Иллюстрация категории
 */
enum class Category(
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val iconRes: Int
) {
    PARKS(R.string.category_parks, R.string.category_parks_description, R.drawable.ic_category_park),
    MUSEUMS(R.string.category_museums, R.string.category_museums_description, R.drawable.ic_category_museum),
    CAFES(R.string.category_cafes, R.string.category_cafes_description, R.drawable.ic_category_cafe),
    KIDS(R.string.category_kids, R.string.category_kids_description, R.drawable.ic_category_kids),
    MALLS(R.string.category_malls, R.string.category_malls_description, R.drawable.ic_category_mall)
}
