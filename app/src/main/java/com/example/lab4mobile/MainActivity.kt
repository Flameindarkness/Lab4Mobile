package com.example.lab4mobile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

/**
 * Экран-хост: Toolbar, боковое меню (Drawer), нижняя панель вкладок и NavHostFragment.
 * На планшете (layout-sw600dp) боковое меню закреплено и DrawerLayout отсутствует
 */
class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            // Нижний отступ не задаём: BottomNavigationView сам учитывает панель навигации
            val safeArea = insets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
            )
            v.setPadding(safeArea.left, safeArea.top, safeArea.right, 0)
            insets
        }

        val toolbar: MaterialToolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        // На телефоне DrawerLayout есть, на планшете — null (меню всегда открыто)
        val drawerLayout: DrawerLayout? = findViewById(R.id.drawer_layout)

        // Верхнеуровневые экраны: на них в Toolbar показывается «гамбургер», а не стрелка «Назад»
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.parksFragment,
                R.id.museumsFragment,
                R.id.cafesFragment,
                R.id.kidsFragment,
                R.id.mallsFragment,
                R.id.aboutFragment,
                R.id.settingsFragment
            ),
            drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)

        // setupWithNavController синхронизирует меню с графом навигации и использует
        // saveState/restoreState, поэтому выбранная вкладка не теряется при повороте экрана
        findViewById<NavigationView>(R.id.navigation_view).setupWithNavController(navController)
        findViewById<BottomNavigationView>(R.id.bottom_navigation).setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean =
        navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
}
