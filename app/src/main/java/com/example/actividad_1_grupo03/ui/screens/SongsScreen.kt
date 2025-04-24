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
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.ui.res.painterResource
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.foundation.clickable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.window.Dialog
import androidx.compose.foundation.lazy.itemsIndexed

/**
 * Pantalla que muestra las canciones del álbum seleccionado.
 * Se utiliza un LazyColumn para mostrar cada canción con el componente SongItem.
 * 
 * También se muestra la portada del disco y es clickable para poder ver la imagen en grande.
 */
@Composable
fun SongsScreen(songsViewModel: SongsViewModel) {
    val album = songsViewModel.selectedAlbum.value
    val showImageDialog = remember { mutableStateOf(false) }

    album?.let {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = it.title,
                        style = MaterialTheme.typography.titleLarge,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = "by ${it.artist}",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.secondary
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Image(
                    painter = painterResource(id = it.coverResId),
                    contentDescription = "Cover of ${it.title}",
                    modifier = Modifier
                        .size(64.dp)
                        .clip(MaterialTheme.shapes.medium)
                        .clickable { showImageDialog.value = true }
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn {
                itemsIndexed(album.songs) { index, song ->
                    SongItem(
                        song = song,
                        number = index + 1
                    )
                }
            }
        }

        if (showImageDialog.value) {
            Dialog(onDismissRequest = { showImageDialog.value = false }) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                        .padding(24.dp)
                        .clip(MaterialTheme.shapes.medium)
                        .background(MaterialTheme.colorScheme.surface)
                ) {
                    Image(
                        painter = painterResource(id = it.coverResId),
                        contentDescription = "Full cover of ${it.title}",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}

