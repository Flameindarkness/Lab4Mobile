package com.example.lab4mobile

import android.app.Application
import com.example.lab4mobile.data.ThemePreferences

/**
 * Класс приложения: при запуске применяет тему, выбранную в настройках
 */
class CityApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ThemePreferences(this).applyTheme()
    }
}
