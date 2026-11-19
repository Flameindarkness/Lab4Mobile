package com.example.lab4mobile.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab4mobile.data.ThemePreferences
import com.example.lab4mobile.databinding.FragmentSettingsBinding

/**
 * Экран настроек: переключатель тёмной темы
 */
class SettingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val themePreferences = ThemePreferences(requireContext())
        binding.darkThemeSwitch.isChecked = themePreferences.isDarkTheme
        binding.darkThemeSwitch.setOnCheckedChangeListener { _, isChecked ->
            // Сохраняем выбор и применяем тему: активити пересоздаётся, экран настроек остаётся открытым
            themePreferences.isDarkTheme = isChecked
            themePreferences.applyTheme()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
