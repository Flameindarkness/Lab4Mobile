package com.example.lab4mobile.data

import androidx.annotation.StringRes

/**
 * Рекомендуемое место
 * @param id Идентификатор, передаётся на экран деталей через Safe Args
 * @param category Категория места
 * @param nameRes Название
 * @param shortDescriptionRes Краткое описание для списка
 * @param descriptionRes Подробное описание
 * @param addressRes Адрес или расположение
 */
data class Place(
    val id: Int,
    val category: Category,
    @StringRes val nameRes: Int,
    @StringRes val shortDescriptionRes: Int,
    @StringRes val descriptionRes: Int,
    @StringRes val addressRes: Int
)
