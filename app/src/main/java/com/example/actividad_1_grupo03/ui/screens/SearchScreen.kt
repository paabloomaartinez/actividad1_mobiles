package com.example.actividad_1_grupo03.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.actividad_1_grupo03.R
import com.example.actividad_1_grupo03.ui.components.AlbumCard
import com.example.actividad_1_grupo03.viewmodel.SearchViewModel
import com.example.actividad_1_grupo03.viewmodel.SongsViewModel

/**
 * Pantalla de búsqueda de álbumes.
 *
 * Permite al usuario buscar álbumes por título, artista, canción o año.
 * Se muestra una barra de búsqueda con un `OutlinedTextField` y una lista
 * de resultados que se actualiza dinámicamente.
 *
 * Al hacer clic en un álbum, se selecciona y navega a la pantalla de canciones.
 * Muestra un mensaje cuando no hay resultados de búsqueda.
 */
@Composable
fun SearchScreen(
    searchViewModel: SearchViewModel,
    songsViewModel: SongsViewModel,
    onAlbumSelected: () -> Unit
) {
    var query by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = query,
            onValueChange = {
                query = it
                searchViewModel.search(it)
            },
            label = { Text("Buscar álbum") },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = stringResource(R.string.search_title)) },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(searchViewModel.results.size) { index ->
                val album = searchViewModel.results[index]
                AlbumCard(album = album) {
                    songsViewModel.selectedAlbum.value = album
                    onAlbumSelected()
                }
            }
        }

        if (searchViewModel.results.isEmpty()) {
            Text(
                text = "No se encontraron álbumes para \"$query\"",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.error,
                modifier = Modifier.padding(top = 16.dp)
            )
        }
    }
}
