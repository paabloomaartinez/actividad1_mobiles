package com.example.actividad_1_grupo03.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.actividad_1_grupo03.data.model.Song


/**
 * Composable reutilizable que muestra la información básica de una canción.
 * Se presenta en una fila con número, título y duración.
 */
@Composable
fun SongItem(song: Song, number: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "$number.",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .width(32.dp)
                .padding(end = 4.dp),
            color = MaterialTheme.colorScheme.primary
        )
        Column {
            Text(
                text = song.title,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                text = song.duration,
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.secondary
            )
        }
    }
}
