package com.example.lab4mobile.ui.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab4mobile.data.Place
import com.example.lab4mobile.databinding.ItemPlaceBinding

/**
 * Адаптер списка мест выбранной категории
 */
class PlaceAdapter(
    private val places: List<Place>,
    private val onPlaceClick: (Place) -> Unit
) : RecyclerView.Adapter<PlaceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val binding = ItemPlaceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlaceViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        val place = places[position]
        with(holder.binding) {
            placeIcon.setImageResource(place.category.iconRes)
            placeName.setText(place.nameRes)
            placeShortDescription.setText(place.shortDescriptionRes)
            root.setOnClickListener { onPlaceClick(place) }
        }
    }

    override fun getItemCount(): Int = places.size
}
