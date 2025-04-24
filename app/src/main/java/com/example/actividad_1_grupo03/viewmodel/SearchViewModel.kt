package com.example.actividad_1_grupo03.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.actividad_1_grupo03.data.MusicRepository
import com.example.actividad_1_grupo03.data.model.Album

/**
 * ViewModel responsable de gestionar la lógica de búsqueda de álbumes.
 *
 * La búsqueda puede realizarse por título del álbum, artista, nombre de canción o año de publicación.
 * Utiliza datos en memoria proporcionados por el `MusicRepository`.
 */
class SearchViewModel : ViewModel() {

    private val allAlbums = MusicRepository.allAlbums

    val results = mutableStateListOf<Album>()

    init {
        results.addAll(allAlbums.sortedByDescending { it.year })
    }

    fun search(query: String) {
        results.clear()
        val filtered = if (query.isBlank()) {
            allAlbums
        } else {
            allAlbums.filter { album ->
                album.title.contains(query, ignoreCase = true) ||
                        album.artist.contains(query, ignoreCase = true) ||
                        album.songs.any { song ->
                            song.title.contains(query, ignoreCase = true)
                        }||
                        album.year.toString().contains(query)
            }
        }
        results.addAll(filtered.sortedByDescending { it.year })
    }
}

