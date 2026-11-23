package com.kayla.quakewatch.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Mendefinisikan seluruh rute dan menu navigasi di QuakeWatch.
 */
sealed class Screen(
    val route: String,
    val title: String,
    val icon: ImageVector? = null
) {
    object Home : Screen("home", "Home", Icons.Default.Home)
    object Map : Screen("map", "Peta", Icons.Default.Map)
    object History : Screen("history", "Riwayat", Icons.Default.History)
    object Profile : Screen("profile", "Profil", Icons.Default.Person)
    object Detail : Screen("detail/{earthquakeId}", "Detail Gempa") {
        fun createRoute(earthquakeId: String): String = "detail/$earthquakeId"
    }
}

val bottomNavScreens = listOf(
    Screen.Home,
    Screen.Map,
    Screen.History,
    Screen.Profile
)
