package com.example.actividad_1_grupo03.data.model

import androidx.annotation.DrawableRes

/**
 * Modelo de datos que representa un álbum musical.
 * Incluye información como título, artista, año, imagen de portada y una lista de canciones.
 */
data class Album(
    val id: Int,
    val title: String,
    val artist: String,
    val year: Int,
    @DrawableRes val coverResId: Int,
    val songs: List<Song>
)