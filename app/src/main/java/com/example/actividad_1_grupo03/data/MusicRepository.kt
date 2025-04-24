package com.example.actividad_1_grupo03.data

import com.example.actividad_1_grupo03.data.model.Album
import com.example.actividad_1_grupo03.data.model.Song

/**
 * Repositorio estático que contiene todos los datos de álbumes y canciones.
 *
 * Este objeto actúa como fuente centralizada de datos en memoria para la aplicación.
 * Se utiliza para poblar los ViewModels (`AlbumsViewModel`, `SearchViewModel`, etc.)
 * con la lista completa de álbumes disponibles, incluyendo artista, año y canciones.
 *
 * En un futuro, podría ser reemplazado o complementado con datos remotos o persistentes.
 */
object MusicRepository {
    val allAlbums = listOf(
        Album(1, "X 100PRE", "Bad Bunny", 2018, listOf(
            Song(1, "NI BIEN NI MAL", "3:54"),
            Song(2, "200 MPH", "2:59"),
            Song(3, "¿Quién Tú Eres?", "2:46"),
            Song(4, "Caro", "3:49"),
            Song(5, "Tenemos Que Hablar", "3:44"),
            Song(6, "Otra Noche en Miami", "3:53"),
            Song(7, "Ser Bichote", "3:13"),
            Song(8, "Si Estuviésemos Juntos", "3:25"),
            Song(9, "Solo de Mí", "3:41"),
            Song(10, "Cuando Perriabas", "3:23"),
            Song(11, "La Romana", "5:00"),
            Song(12, "Como Antes", "3:50"),
            Song(13, "RLNDT", "3:36"),
            Song(14, "Estamos Bien", "3:28"),
            Song(15, "MIA", "3:30")
        )),
        Album(2, "YHLQMDLG", "Bad Bunny", 2020, listOf(
            Song(16, "Si Veo a Tu Mamá", "2:50"),
            Song(17, "La Difícil", "2:43"),
            Song(18, "Pero Ya No", "2:40"),
            Song(19, "La Santa", "3:26"),
            Song(20, "Yo Perreo Sola", "2:52"),
            Song(21, "Bichiyal", "3:17"),
            Song(22, "Soliá", "2:39"),
            Song(23, "La Zona", "2:16"),
            Song(24, "Que Malo", "2:47"),
            Song(25, "Vete", "3:12"),
            Song(26, "Ignorantes", "3:30"),
            Song(27, "A Tu Merced", "2:55"),
            Song(28, "Una Vez", "3:52"),
            Song(29, "Safaera", "4:55"),
            Song(30, "25/8", "2:58"),
            Song(31, "Está Cabrón Ser Yo", "3:24"),
            Song(32, "Puesto Pa' Guerrial", "2:46"),
            Song(33, "P FKN R", "4:18"),
            Song(34, "Hablamos Mañana", "3:39"),
            Song(35, "<3", "2:33")
        )),
        Album(3, "El Último Tour del Mundo", "Bad Bunny", 2020, listOf(
            Song(36, "El Mundo es Mío", "2:45"),
            Song(37, "Te Mudaste", "2:10"),
            Song(38, "Hoy Cobré", "2:42"),
            Song(39, "Maldita Pobreza", "3:50"),
            Song(40, "La Noche de Anoche", "3:23"),
            Song(41, "Te Deseo Lo Mejor", "2:50"),
            Song(42, "Yo Visto Así", "3:00"),
            Song(43, "Haciendo Que Me Amas", "2:42"),
            Song(44, "Booker T", "2:36"),
            Song(45, "La Droga", "3:28"),
            Song(46, "Dakiti", "3:25"),
            Song(47, "Trellas", "3:43"),
            Song(48, "Sorry Papi", "3:42"),
            Song(49, "120", "3:18"),
            Song(50, "Antes Que Se Acabe", "3:53"),
            Song(51, "Cantares de Navidad", "3:42")
        )),
        Album(4, "Un Verano Sin Ti", "Bad Bunny", 2022, listOf(
            Song(52, "Moscow Mule", "4:05"),
            Song(53, "Después de la Playa", "3:50"),
            Song(54, "Me Porto Bonito", "2:58"),
            Song(55, "Tití Me Preguntó", "4:03"),
            Song(56, "Un Ratito", "2:56"),
            Song(57, "Yo No Soy Celoso", "3:50"),
            Song(58, "Tarot", "3:57"),
            Song(59, "Neverita", "2:53"),
            Song(60, "La Corriente", "3:18"),
            Song(61, "Efecto", "3:33"),
            Song(62, "Party", "3:35"),
            Song(63, "Aguacero", "2:49"),
            Song(64, "Enséñame a Bailar", "2:53"),
            Song(65, "Ojitos Lindos", "4:18"),
            Song(66, "Dos Mil 16", "3:28"),
            Song(67, "El Apagón", "3:58"),
            Song(68, "Otro Atardecer", "3:23"),
            Song(69, "Un Coco", "3:55"),
            Song(70, "Andrea", "4:38"),
            Song(71, "Me Fui de Vacaciones", "3:36"),
            Song(72, "Un Verano Sin Ti", "2:53"),
            Song(73, "Agosto", "3:23"),
            Song(74, "Callaita", "4:10")
        )),
        Album(5, "Nadie Sabe Lo Que Va a Pasar Mañana", "Bad Bunny", 2023, listOf(
            Song(75, "NADIE SABE", "3:20"),
            Song(76, "MONACO", "3:31"),
            Song(77, "FINA", "3:13"),
            Song(78, "HIBIKI", "3:43"),
            Song(79, "MR. OCTOBER", "3:36"),
            Song(80, "TELÉFONO NUEVO", "3:40"),
            Song(81, "SEDA", "3:17"),
            Song(82, "GRACIAS POR NADA", "3:50"),
            Song(83, "THUNDER Y LIGHTNING", "4:11"),
            Song(84, "PERRO NEGRO", "2:52"),
            Song(85, "ACHO PR", "3:52"),
            Song(86, "UN PREVIEW", "2:51"),
            Song(87, "WHERE SHE GOES", "3:51")
        )),
        Album(6, "Oasis", "Bad Bunny & J Balvin", 2019, listOf(
            Song(88, "Mojaita", "2:58"),
            Song(89, "Yo Le Llego", "3:24"),
            Song(90, "Cuidao Por Ahí", "2:47"),
            Song(91, "Que Pretendes", "2:39"),
            Song(92, "La Canción", "4:02"),
            Song(93, "Un Peso", "3:33"),
            Song(94, "Odio", "2:45"),
            Song(95, "Como Un Bebé", "3:42")
        )),
        Album(7, "Las Que No Iban A Salir", "Bad Bunny", 2020, listOf(
            Song(96, "En Casita", "2:44"),
            Song(97, "Bye Me Fui", "3:35"),
            Song(98, "Pa’ Romperla", "3:28"),
            Song(99, "Canción Con Yandel", "3:15"),
            Song(100, "Bendiciones", "3:32"),
            Song(101, "Ronca Freestyle", "2:50"),
            Song(102, "Hasta Que Dios Diga", "4:21"),
            Song(103, "Don Don (Remix)", "3:46"),
            Song(104, "6 Rings", "2:40")
        )),
        Album(
            id = 8,
            title = "Debí Tirar Más Fotos",
            artist = "Bad Bunny",
            year = 2025,
            songs = listOf(
                Song(105, "Nuevayol", "2:56"),
                Song(106, "Voy a llevarte pa PR", "3:15"),
                Song(107, "Baile inolvidable", "4:02"),
                Song(108, "Perfumito nuevo (feat. RaiNao)", "3:45"),
                Song(109, "Weltita (feat. Chuwi)", "3:30"),
                Song(110, "Veldá (feat. Omar Courtz & Dei V)", "3:50"),
                Song(111, "El clúb", "3:40"),
                Song(112, "Ketu tecré", "3:25"),
                Song(113, "Bokete", "3:10"),
                Song(114, "Kloufrens", "3:35"),
                Song(115, "Turista", "4:00"),
                Song(116, "Café con ron (feat. Los Pleneros de la Cresta)", "3:55"),
                Song(117, "Pitorro de coco", "3:20"),
                Song(118, "Lo que le pasó a Hawaii", "3:50"),
                Song(119, "EoO", "3:30"),
                Song(120, "DtMF", "3:57"),
                Song(121, "La mudanza", "4:10")
            )
        ),
        Album(
            id = 9,
            title = "Súper Sangre Joven",
            artist = "Duki",
            year = 2019,
            songs = listOf(
                Song(121, "Goteo", "3:30"),
                Song(122, "Hitboy", "3:30"),
                Song(123, "Te Traje Flores", "3:30"),
                Song(124, "A Punta de Espada", "3:30"),
                Song(125, "LeBron", "3:30"),
                Song(126, "Tumbando el Club (Remix)", "3:30"),
                Song(127, "Ballin'", "3:30"),
                Song(128, "Ferrari", "3:30"),
                Song(129, "Sol y Luna", "3:30"),
                Song(130, "Perrea", "3:30"),
            )
        ),

        Album(
            id = 10,
            title = "24",
            artist = "Duki",
            year = 2020,
            songs = listOf(
                Song(131, "Deja Vu", "3:30"),
                Song(132, "Marca de la Cadena", "3:30"),
                Song(133, "Smoke a Lot", "3:30"),
                Song(134, "24", "3:30"),
                Song(135, "Flex Like Trunkz", "3:30"),
                Song(136, "Fornai", "3:30"),
                Song(137, "Acapella", "3:30"),
                Song(138, "Eo Eo", "3:30"),
            )
        ),

        Album(
            id = 11,
            title = "Desde el Fin del Mundo",
            artist = "Duki",
            year = 2021,
            songs = listOf(
                Song(139, "Muero de Fiesta Este Finde", "3:30"),
                Song(140, "Chico Estrella", "3:30"),
                Song(141, "Malbec", "3:30"),
                Song(142, "Pintao", "3:30"),
                Song(143, "Cascada", "3:30"),
                Song(144, "Sudor y Trabajo", "3:30"),
                Song(145, "Volando Bajito", "3:30"),
                Song(146, "Ticket", "3:30"),
                Song(147, "Unfollow", "3:30"),
                Song(148, "Ley de Atracción", "3:30"),
            )
        ),

        Album(
            id = 12,
            title = "Vivo Desde el Fin del Mundo",
            artist = "Duki",
            year = 2021,
            songs = listOf(
                Song(149, "Goteo (En Vivo)", "3:30"),
                Song(150, "Hitboy (En Vivo)", "3:30"),
                Song(151, "Te Traje Flores (En Vivo)", "3:30"),
                Song(152, "A Punta de Espada (En Vivo)", "3:30"),
                Song(153, "LeBron (En Vivo)", "3:30"),
                Song(154, "Muero de Fiesta Este Finde (En Vivo)", "3:30"),
                Song(155, "Chico Estrella (En Vivo)", "3:30"),
                Song(156, "Malbec (En Vivo)", "3:30"),
                Song(157, "Pintao (En Vivo)", "3:30"),
                Song(158, "Cascada (En Vivo)", "3:30"),
            )
        ),

        Album(
            id = 13,
            title = "Temporada de Reggaetón",
            artist = "Duki",
            year = 2021,
            songs = listOf(
                Song(159, "Ley de Atracción", "3:30"),
                Song(160, "Unfollow", "3:30"),
                Song(161, "Midtown", "3:30"),
                Song(162, "En Movimiento", "3:30"),
                Song(163, "Yin Yan", "3:30"),
                Song(164, "Top 5", "3:30"),
                Song(165, "Esto Recién Empieza", "3:30"),
                Song(166, "Amor Bipolar", "3:30"),
            )
        ),
        Album(
            id = 14,
            title = "Temporada de Reggaetón 2",
            artist = "Duki",
            year = 2022,
            songs = listOf(
                Song(167, "Amor Bipolar", "3:15"),
                Song(168, "Celosa", "2:37"),
                Song(169, "Perreo Bendito", "2:39"),
                Song(170, "Si Quieren Frontear", "3:20"),
                Song(171, "Esto Recién Empieza", "2:26"),
                Song(172, "Antes de Perderte", "2:56"),
                Song(173, "La Vuelta", "0:40"),
                Song(174, "GIVENCHY", "3:02")
            )
        ),
        Album(
            id = 15,
            title = "Antes de Ameri",
            artist = "Duki",
            year = 2023,
            songs = listOf(
                Song(175, "01 de ENEro", "3:30"),
                Song(176, "Jefes del Sudoeste", "3:30"),
                Song(177, "Apollo 13", "3:30"),
                Song(178, "Santo Grial", "3:30"),
                Song(179, "Harakiri", "3:30"),
                Song(180, "Remember Me", "3:30"),
                Song(181, "Troya", "3:30"),
                Song(182, "Contra Mí", "3:30"),
                Song(183, "Gigi", "3:30"),
                Song(184, "Don't Lie", "3:30"),
                Song(185, "Uno Dos", "3:30"),
                Song(186, "N.C.L.C.", "3:30"),
            )
        ),

        Album(
            id = 16,
            title = "AMERI",
            artist = "Duki",
            year = 2024,
            songs = listOf(
                Song(187, "ROCKSTAR 2.0", "3:30"),
                Song(188, "Coco Chanel", "3:30"),
                Song(189, "Ameri", "3:30"),
                Song(190, "Top 5 (Remix)", "3:30"),
                Song(191, "Halo", "3:30"),
                Song(192, "Lo Pasao Pisao", "3:30"),
                Song(193, "Pasajero", "3:30"),
                Song(194, "ADA", "3:30"),
                Song(195, "Ultimo Tren", "3:30"),
                Song(196, "Call Me Maybe", "3:30"),
                Song(197, "Q Lindo", "3:30"),
                Song(198, "Fanatico", "3:30"),
                Song(199, "Moonwalk", "3:30"),
                Song(200, "Hola Perrea", "3:30"),
                Song(201, "Estrella", "3:30"),
            )
        ),
    )
}
