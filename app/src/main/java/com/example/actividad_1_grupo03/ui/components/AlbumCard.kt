package com.example.actividad_1_grupo03.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.mymusic.R
import com.example.mymusic.data.model.Album

/**
 * Composable reutilizable que muestra la información de un álbum en formato tarjeta.
 * Incluye el título del álbum, artista y año.
 * Se puede hacer clic en la tarjeta para ejecutar una acción personalizada.
 */
@Composable
fun AlbumCard(album: Album, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable { onClick() },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background // MusicBlue
        ),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = stringResource(R.string.album_title) + ": " + album.title,
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = "by ${album.artist}",
                color = MaterialTheme.colorScheme.secondary // MusicGreen
            )
            Text(
                text = "Year: ${album.year}",
                color = MaterialTheme.colorScheme.secondary // MusicOrange
            )
        }
    }
}
