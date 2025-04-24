package com.example.actividad_1_grupo03.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.actividad_1_grupo03.ui.components.AlbumCard
import com.example.actividad_1_grupo03.viewmodel.AlbumsViewModel
import com.example.actividad_1_grupo03.viewmodel.SongsViewModel

/**
 * Pantalla principal que muestra la lista de álbumes disponibles.
 * Cada álbum puede ser seleccionado para ver su lista de canciones.
 * Utiliza un LazyColumn y el componente AlbumCard.
 */
@Composable
fun AlbumsScreen(
    albumsViewModel: AlbumsViewModel,
    songsViewModel: SongsViewModel,
    onAlbumSelected: () -> Unit
) {
    val sortedAlbums = albumsViewModel.albums.sortedByDescending { it.year }

    LazyColumn {
        items(sortedAlbums.size) { index ->
            val album = sortedAlbums[index]
            AlbumCard(album = album) {
                songsViewModel.selectedAlbum.value = album
                onAlbumSelected()
            }
        }
    }
}
