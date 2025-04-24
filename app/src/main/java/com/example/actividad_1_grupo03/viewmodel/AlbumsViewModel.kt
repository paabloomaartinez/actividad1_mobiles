package com.example.actividad_1_grupo03.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.actividad_1_grupo03.data.MusicRepository
import com.example.actividad_1_grupo03.data.model.Album
import com.example.actividad_1_grupo03.data.model.Song

/**
 * ViewModel para la pantalla de álbumes.
 * Se encarga de mantener y proporcionar la lista de álbumes disponibles.
 * Los datos se almacenan en memoria.
 */
class AlbumsViewModel : ViewModel() {
    val albums = mutableStateListOf<Album>()

    init {
        albums.addAll(MusicRepository.allAlbums)
    }
}