package com.example.lab4mobile.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab4mobile.data.Category
import com.example.lab4mobile.databinding.ItemCategoryBinding

/**
 * Адаптер списка категорий
 */
class CategoryAdapter(
    private val categories: List<Category>,
    private val onCategoryClick: (Category) -> Unit
) : RecyclerView.Adapter<CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]
        with(holder.binding) {
            categoryIcon.setImageResource(category.iconRes)
            categoryTitle.setText(category.titleRes)
            categoryDescription.setText(category.descriptionRes)
            root.setOnClickListener { onCategoryClick(category) }
        }
    }

    override fun getItemCount(): Int = categories.size
}
