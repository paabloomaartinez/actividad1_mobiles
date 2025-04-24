package com.example.actividad_1_grupo03.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.actividad_1_grupo03.data.model.Album

/**
 * ViewModel para la pantalla de canciones.
 * Almacena el álbum seleccionado por el usuario y proporciona su lista de canciones.
 */
class SongsViewModel : ViewModel() {
    var selectedAlbum = mutableStateOf<Album?>(null)
}
