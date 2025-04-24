package com.example.actividad_1_grupo03

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.actividad_1_grupo03.ui.screens.AlbumsScreen
import com.example.actividad_1_grupo03.ui.screens.SearchScreen
import com.example.actividad_1_grupo03.ui.screens.SongsScreen
import com.example.actividad_1_grupo03.ui.theme.Actividad_1_Grupo03Theme
import com.example.actividad_1_grupo03.viewmodel.AlbumsViewModel
import com.example.actividad_1_grupo03.viewmodel.SearchViewModel
import com.example.actividad_1_grupo03.viewmodel.SongsViewModel
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Search
import androidx.activity.compose.BackHandler

/**
 * Punto de entrada principal de la aplicación.
 * Administra la navegación entre pantallas usando estados Compose.
 * Carga los ViewModels y aplica el tema general de la app.
 */
@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Actividad_1_Grupo03Theme {
                val albumsViewModel = remember { AlbumsViewModel() }
                val songsViewModel = remember { SongsViewModel() }
                val searchViewModel = remember { SearchViewModel() }

                var currentScreen by remember { mutableStateOf("albums") }

                BackHandler(enabled = currentScreen != "albums") {
                    currentScreen = "albums"
                }
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = when (currentScreen) {
                                    "albums" -> stringResource(R.string.app_name)
                                    "songs" -> "Canciones"
                                    "search" -> "Buscar"
                                    else -> ""
                                })
                            },
                            navigationIcon = {
                                if (currentScreen != "albums") {
                                    IconButton(onClick = { currentScreen = "albums" }) {
                                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Atrás")
                                    }
                                }
                            }
                        )
                    },
                    bottomBar = {
                        NavigationBar {
                            NavigationBarItem(
                                selected = currentScreen == "albums",
                                onClick = { currentScreen = "albums" },
                                icon = { Icon(Icons.Default.MusicNote, contentDescription = stringResource(R.string.albums_title)) },
                                label = { Text("Álbumes") }
                            )
                            NavigationBarItem(
                                selected = currentScreen == "search",
                                onClick = { currentScreen = "search" },
                                icon = { Icon(Icons.Default.Search, contentDescription = stringResource(R.string.search_title)) },
                                label = { Text("Buscar") }
                            )
                        }
                    }
                ) { padding ->
                    Box(modifier = Modifier.padding(padding)) {
                        when (currentScreen) {
                            "albums" -> AlbumsScreen(
                                albumsViewModel = albumsViewModel,
                                songsViewModel = songsViewModel,
                                onAlbumSelected = { currentScreen = "songs" }
                            )

                            "songs" -> SongsScreen(songsViewModel = songsViewModel)

                            "search" -> SearchScreen(
                                searchViewModel = searchViewModel,
                                songsViewModel = songsViewModel,
                                onAlbumSelected = { currentScreen = "songs" }
                            )
                        }
                    }
                }
            }
        }
    }
}
