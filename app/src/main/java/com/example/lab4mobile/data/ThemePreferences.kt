package com.example.lab4mobile.data

import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.edit

/**
 * Хранит выбор темы в SharedPreferences, чтобы он сохранялся после перезапуска
 */
class ThemePreferences(context: Context) {

    private val preferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

    var isDarkTheme: Boolean
        get() = preferences.getBoolean(KEY_DARK_THEME, false)
        set(value) = preferences.edit { putBoolean(KEY_DARK_THEME, value) }

    /**
     * Применяет сохранённую тему ко всему приложению
     */
    fun applyTheme() {
        AppCompatDelegate.setDefaultNightMode(
            if (isDarkTheme) AppCompatDelegate.MODE_NIGHT_YES else AppCompatDelegate.MODE_NIGHT_NO
        )
    }

    companion object {
        private const val PREFERENCES_NAME = "settings"
        private const val KEY_DARK_THEME = "dark_theme"
    }
}
