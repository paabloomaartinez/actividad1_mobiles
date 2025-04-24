package com.example.actividad_1_grupo03.data.model

/**
 * Modelo de datos que representa un álbum musical.
 * Incluye información como título, artista, año y una lista de canciones.
 */
data class Album(
    val id: Int,
    val title: String,
    val artist: String,
    val year: Int,
    val songs: List<Song>
)