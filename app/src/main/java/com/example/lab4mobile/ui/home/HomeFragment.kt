package com.example.lab4mobile.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import androidx.recyclerview.widget.GridLayoutManager
import com.example.lab4mobile.R
import com.example.lab4mobile.data.Category
import com.example.lab4mobile.databinding.FragmentHomeBinding

/**
 * Главный экран: список категорий. По нажатию открывается экран выбранной категории
 */
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.categoryList.layoutManager =
            GridLayoutManager(requireContext(), resources.getInteger(R.integer.list_columns))
        binding.categoryList.adapter = CategoryAdapter(Category.entries) { category ->
            openCategory(category)
        }
    }

    /**
     * Переход к экрану категории с теми же параметрами, что и при выборе вкладки или пункта меню
     */
    private fun openCategory(category: Category) {
        val destinationId = when (category) {
            Category.PARKS -> R.id.parksFragment
            Category.MUSEUMS -> R.id.museumsFragment
            Category.CAFES -> R.id.cafesFragment
            Category.KIDS -> R.id.kidsFragment
            Category.MALLS -> R.id.mallsFragment
        }
        findNavController().navigate(destinationId, null, navOptions {
            launchSingleTop = true
            restoreState = true
            popUpTo(R.id.homeFragment) { saveState = true }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
