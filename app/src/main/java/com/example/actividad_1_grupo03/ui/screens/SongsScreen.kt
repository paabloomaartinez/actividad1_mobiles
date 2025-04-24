package com.example.actividad_1_grupo03.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.actividad_1_grupo03.ui.components.SongItem
import com.example.actividad_1_grupo03.viewmodel.SongsViewModel

/**
 * Pantalla que muestra las canciones del álbum seleccionado.
 * Se utiliza un LazyColumn para mostrar cada canción con el componente SongItem.
 */
@Composable
fun SongsScreen(songsViewModel: SongsViewModel) {
    val album = songsViewModel.selectedAlbum.value
    album?.let {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)) {

            Text(
                text = it.title,
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.primary
            )

            Text(
                text = "by ${it.artist}",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            LazyColumn {
                items(album.songs.size) { index ->
                    SongItem(song = album.songs[index])
                }
            }
        }
    }
}
