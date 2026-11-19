package com.example.lab4mobile.ui.category

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.lab4mobile.NavGraphDirections
import com.example.lab4mobile.R
import com.example.lab4mobile.data.Category
import com.example.lab4mobile.data.PlacesRepository
import com.example.lab4mobile.databinding.FragmentCategoryBinding

/**
 * Общий экран списка мест. Конкретная категория задаётся в наследниках
 * (ParksFragment, MuseumsFragment и т.д.), у каждого из них свой destination в nav_graph.xml
 */
abstract class CategoryFragment : Fragment() {

    protected abstract val category: Category

    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.placeList.layoutManager =
            GridLayoutManager(requireContext(), resources.getInteger(R.integer.list_columns))
        binding.placeList.adapter = PlaceAdapter(PlacesRepository.getPlaces(category)) { place ->
            // Safe Args: id места передаётся на экран деталей типобезопасно
            findNavController().navigate(NavGraphDirections.actionGlobalPlaceDetail(place.id))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
