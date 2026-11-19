package com.example.lab4mobile.data

import com.example.lab4mobile.R

/**
 * Источник данных о местах города. Все тексты хранятся в ресурсах (strings_places.xml)
 */
object PlacesRepository {

    private val places: List<Place> = listOf(
        Place(
            id = 1,
            category = Category.PARKS,
            nameRes = R.string.place_1_name,
            shortDescriptionRes = R.string.place_1_short,
            descriptionRes = R.string.place_1_description,
            addressRes = R.string.place_1_address
        ),
        Place(
            id = 2,
            category = Category.PARKS,
            nameRes = R.string.place_2_name,
            shortDescriptionRes = R.string.place_2_short,
            descriptionRes = R.string.place_2_description,
            addressRes = R.string.place_2_address
        ),
        Place(
            id = 3,
            category = Category.PARKS,
            nameRes = R.string.place_3_name,
            shortDescriptionRes = R.string.place_3_short,
            descriptionRes = R.string.place_3_description,
            addressRes = R.string.place_3_address
        ),
        Place(
            id = 4,
            category = Category.PARKS,
            nameRes = R.string.place_4_name,
            shortDescriptionRes = R.string.place_4_short,
            descriptionRes = R.string.place_4_description,
            addressRes = R.string.place_4_address
        ),
        Place(
            id = 5,
            category = Category.PARKS,
            nameRes = R.string.place_5_name,
            shortDescriptionRes = R.string.place_5_short,
            descriptionRes = R.string.place_5_description,
            addressRes = R.string.place_5_address
        ),
        Place(
            id = 6,
            category = Category.MUSEUMS,
            nameRes = R.string.place_6_name,
            shortDescriptionRes = R.string.place_6_short,
            descriptionRes = R.string.place_6_description,
            addressRes = R.string.place_6_address
        ),
        Place(
            id = 7,
            category = Category.MUSEUMS,
            nameRes = R.string.place_7_name,
            shortDescriptionRes = R.string.place_7_short,
            descriptionRes = R.string.place_7_description,
            addressRes = R.string.place_7_address
        ),
        Place(
            id = 8,
            category = Category.MUSEUMS,
            nameRes = R.string.place_8_name,
            shortDescriptionRes = R.string.place_8_short,
            descriptionRes = R.string.place_8_description,
            addressRes = R.string.place_8_address
        ),
        Place(
            id = 9,
            category = Category.MUSEUMS,
            nameRes = R.string.place_9_name,
            shortDescriptionRes = R.string.place_9_short,
            descriptionRes = R.string.place_9_description,
            addressRes = R.string.place_9_address
        ),
        Place(
            id = 10,
            category = Category.MUSEUMS,
            nameRes = R.string.place_10_name,
            shortDescriptionRes = R.string.place_10_short,
            descriptionRes = R.string.place_10_description,
            addressRes = R.string.place_10_address
        ),
        Place(
            id = 11,
            category = Category.CAFES,
            nameRes = R.string.place_11_name,
            shortDescriptionRes = R.string.place_11_short,
            descriptionRes = R.string.place_11_description,
            addressRes = R.string.place_11_address
        ),
        Place(
            id = 12,
            category = Category.CAFES,
            nameRes = R.string.place_12_name,
            shortDescriptionRes = R.string.place_12_short,
            descriptionRes = R.string.place_12_description,
            addressRes = R.string.place_12_address
        ),
        Place(
            id = 13,
            category = Category.CAFES,
            nameRes = R.string.place_13_name,
            shortDescriptionRes = R.string.place_13_short,
            descriptionRes = R.string.place_13_description,
            addressRes = R.string.place_13_address
        ),
        Place(
            id = 14,
            category = Category.CAFES,
            nameRes = R.string.place_14_name,
            shortDescriptionRes = R.string.place_14_short,
            descriptionRes = R.string.place_14_description,
            addressRes = R.string.place_14_address
        ),
        Place(
            id = 15,
            category = Category.CAFES,
            nameRes = R.string.place_15_name,
            shortDescriptionRes = R.string.place_15_short,
            descriptionRes = R.string.place_15_description,
            addressRes = R.string.place_15_address
        ),
        Place(
            id = 16,
            category = Category.KIDS,
            nameRes = R.string.place_16_name,
            shortDescriptionRes = R.string.place_16_short,
            descriptionRes = R.string.place_16_description,
            addressRes = R.string.place_16_address
        ),
        Place(
            id = 17,
            category = Category.KIDS,
            nameRes = R.string.place_17_name,
            shortDescriptionRes = R.string.place_17_short,
            descriptionRes = R.string.place_17_description,
            addressRes = R.string.place_17_address
        ),
        Place(
            id = 18,
            category = Category.KIDS,
            nameRes = R.string.place_18_name,
            shortDescriptionRes = R.string.place_18_short,
            descriptionRes = R.string.place_18_description,
            addressRes = R.string.place_18_address
        ),
        Place(
            id = 19,
            category = Category.KIDS,
            nameRes = R.string.place_19_name,
            shortDescriptionRes = R.string.place_19_short,
            descriptionRes = R.string.place_19_description,
            addressRes = R.string.place_19_address
        ),
        Place(
            id = 20,
            category = Category.KIDS,
            nameRes = R.string.place_20_name,
            shortDescriptionRes = R.string.place_20_short,
            descriptionRes = R.string.place_20_description,
            addressRes = R.string.place_20_address
        ),
        Place(
            id = 21,
            category = Category.MALLS,
            nameRes = R.string.place_21_name,
            shortDescriptionRes = R.string.place_21_short,
            descriptionRes = R.string.place_21_description,
            addressRes = R.string.place_21_address
        ),
        Place(
            id = 22,
            category = Category.MALLS,
            nameRes = R.string.place_22_name,
            shortDescriptionRes = R.string.place_22_short,
            descriptionRes = R.string.place_22_description,
            addressRes = R.string.place_22_address
        ),
        Place(
            id = 23,
            category = Category.MALLS,
            nameRes = R.string.place_23_name,
            shortDescriptionRes = R.string.place_23_short,
            descriptionRes = R.string.place_23_description,
            addressRes = R.string.place_23_address
        ),
        Place(
            id = 24,
            category = Category.MALLS,
            nameRes = R.string.place_24_name,
            shortDescriptionRes = R.string.place_24_short,
            descriptionRes = R.string.place_24_description,
            addressRes = R.string.place_24_address
        ),
        Place(
            id = 25,
            category = Category.MALLS,
            nameRes = R.string.place_25_name,
            shortDescriptionRes = R.string.place_25_short,
            descriptionRes = R.string.place_25_description,
            addressRes = R.string.place_25_address
        )
    )

    /**
     * Места выбранной категории
     */
    fun getPlaces(category: Category): List<Place> = places.filter { it.category == category }

    /**
     * Место по идентификатору
     */
    fun getPlace(id: Int): Place? = places.find { it.id == id }
}
