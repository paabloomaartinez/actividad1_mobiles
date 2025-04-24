package com.example.actividad_1_grupo03.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.actividad_1_grupo03.R
import com.example.actividad_1_grupo03.data.model.Album
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.Image
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource

/**
 * Composable reutilizable que muestra la información de un álbum en formato tarjeta.
 * Incluye el título del álbum, artista, año y portada.
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
            containerColor = MaterialTheme.colorScheme.background
        ),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = stringResource(R.string.album_title) + ": " + album.title,
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = "by ${album.artist}",
                    color = MaterialTheme.colorScheme.secondary
                )
                Text(
                    text = "Year: ${album.year}",
                    color = MaterialTheme.colorScheme.secondary
                )
            }

            Image(
                painter = painterResource(id = album.coverResId),
                contentDescription = "Mini cover of ${album.title}",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(80.dp)
                    .align(Alignment.BottomEnd)
                    .padding(12.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
        }
    }
}
