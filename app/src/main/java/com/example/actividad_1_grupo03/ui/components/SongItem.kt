package com.example.actividad_1_grupo03.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.mymusic.data.model.Song
import com.example.mymusic.R

/**
 * Composable reutilizable que muestra la información básica de una canción.
 * Se presenta en una fila con título y duración.
 */
@Composable
fun SongItem(song: Song) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(
            text = song.title,
            modifier = Modifier.weight(1f),
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = song.duration,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}
