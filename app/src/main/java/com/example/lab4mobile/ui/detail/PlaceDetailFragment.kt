package com.example.lab4mobile.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.lab4mobile.data.PlacesRepository
import com.example.lab4mobile.databinding.FragmentPlaceDetailBinding

/**
 * Экран подробностей о месте. id места приходит через Safe Args
 */
class PlaceDetailFragment : Fragment() {

    private val args: PlaceDetailFragmentArgs by navArgs()

    private var _binding: FragmentPlaceDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPlaceDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val place = PlacesRepository.getPlace(args.placeId)
        if (place == null) {
            findNavController().navigateUp()
            return
        }

        (requireActivity() as AppCompatActivity).supportActionBar?.title = getString(place.nameRes)
        with(binding) {
            placeIcon.setImageResource(place.category.iconRes)
            placeCategory.setText(place.category.titleRes)
            placeName.setText(place.nameRes)
            placeAddress.setText(place.addressRes)
            placeDescription.setText(place.descriptionRes)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
