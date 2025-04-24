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
            Song(96, "SI ELLA SALE", "2:23"),
            Song(97, "MÁS DE UNA CITA", "3:03"),
            Song(98, "BYE ME FUI", "2:58"),
            Song(99, "CANCIÓN CON YANDEL", "3:29"),
            Song(100, "PA' ROMPERLA", "3:14"),
            Song(101, "BAD CON NICKY", "3:22"),
            Song(102, "BENDICIONES", "2:35"),
            Song(103, "CÓMO SE SIENTE - Remix", "3:47"),
            Song(104, "RONCA FREESTYLE", "2:30"),
            Song(105, "EN CASITA", "2:56")
        )),
        Album(
            id = 8,
            title = "Debí Tirar Más Fotos",
            artist = "Bad Bunny",
            year = 2025,
            songs = listOf(
                Song(106, "Nuevayol", "2:56"),
                Song(107, "Voy a llevarte pa PR", "3:15"),
                Song(108, "Baile inolvidable", "4:02"),
                Song(109, "Perfumito nuevo (feat. RaiNao)", "3:45"),
                Song(110, "Weltita (feat. Chuwi)", "3:30"),
                Song(111, "Veldá (feat. Omar Courtz & Dei V)", "3:50"),
                Song(112, "El clúb", "3:40"),
                Song(113, "Ketu tecré", "3:25"),
                Song(114, "Bokete", "3:10"),
                Song(115, "Kloufrens", "3:35"),
                Song(116, "Turista", "4:00"),
                Song(117, "Café con ron (feat. Los Pleneros de la Cresta)", "3:55"),
                Song(118, "Pitorro de coco", "3:20"),
                Song(119, "Lo que le pasó a Hawaii", "3:50"),
                Song(120, "EoO", "3:30"),
                Song(121, "DtMF", "3:57"),
                Song(122, "La mudanza", "4:10")
            )
        ),
        Album(
            id = 9,
            title = "Súper Sangre Joven",
            artist = "Duki",
            year = 2019,
            songs = listOf(
                Song(123, "Te Traje Flores", "2:02"),
                Song(124, "It's a Vibe", "3:40"),
                Song(125, "Hitboy", "2:58"),
                Song(126, "Señorita", "2:41"),
                Song(127, "Me Gusta Lo Simple", "3:16"),
                Song(128, "Perdón", "3:38"),
                Song(129, "A Punta de Espada", "3:22"),
                Song(130, "La Jefatura", "3:31"),
                Song(131, "One Million Dollar Baby", "4:40"),
                Song(132, "Goteo", "2:44")
            )
        ),
        Album(
            id = 10,
            title = "24",
            artist = "Duki",
            year = 2020,
            songs = listOf(
                Song(133, "Flex Like Trunkz", "2:49"),
                Song(134, "Pastillas", "3:20"),
                Song(135, "Sin Mirar", "2:02"),
                Song(136, "Vida Eterna", "3:16"),
                Song(137, "Deja Vu", "2:53"),
                Song(138, "Marca de la Cadena", "3:04"),
                Song(139, "Smoke a Lot", "2:46"),
                Song(140, "24", "3:48")
            )
        ),
        Album(
            id = 11,
            title = "Desde el Fin del Mundo",
            artist = "Duki",
            year = 2021,
            songs = listOf(
                Song(141, "Sudor y Trabajo", "3:00"),
                Song(142, "Pintao", "2:47"),
                Song(143, "Chico Estrella", "2:50"),
                Song(144, "Volando Bajito", "2:14"),
                Song(145, "Cuanto", "3:10"),
                Song(146, "Rápido", "2:15"),
                Song(147, "I Don't Know", "3:38"),
                Song(148, "Sol", "4:04"),
                Song(149, "Luna", "3:20"),
                Song(150, "Malbec", "2:55"),
                Song(151, "Mi Diablo", "3:12"),
                Song(152, "Fifty Fifty", "4:40"),
                Song(153, "Valentino", "2:36"),
                Song(154, "Cascada", "3:12"),
                Song(155, "Ticket", "3:08"),
                Song(156, "Muriéndome", "2:39"),
                Song(157, "Ella Es Mi Bitch", "4:06"),
                Song(158, "Muero de Fiesta Este Finde", "3:13")
            )
        ),
        Album(
            id = 12,
            title = "Vivo Desde el Fin del Mundo",
            artist = "Duki",
            year = 2021,
            songs = listOf(
                Song(159, "Sudor y Trabajo - Vivo Calafate", "3:01"),
                Song(160, "Chico Estrella - Vivo Calafate", "2:48"),
                Song(161, "Ticket - Vivo Calafate", "3:10"),
                Song(162, "Mi Diablo - Vivo Calafate", "3:12"),
                Song(163, "Rápido - Vivo Calafate", "2:14"),
                Song(164, "I Don't Know - Vivo Calafate", "3:39"),
                Song(165, "Luna - Vivo Calafate", "3:22"),
                Song(166, "Malbec - Vivo Calafate", "2:55"),
                Song(167, "Sol - Vivo Calafate", "3:58"),
                Song(168, "Volando Bajito - Vivo Calafate", "2:01"),
                Song(169, "Cascada - Vivo Calafate", "3:14")
            )
        ),
        Album(
            id = 13,
            title = "Temporada de Reggaetón",
            artist = "Duki",
            year = 2021,
            songs = listOf(
                Song(170, "En Movimiento", "2:50"),
                Song(171, "Ley de Atracción", "3:00"),
                Song(172, "BICI", "4:08"),
                Song(173, "Midtown", "3:25"),
                Song(174, "TOP 5", "2:26"),
                Song(175, "YIN YAN", "3:09"),
                Song(176, "Unfollow", "3:16")
            )
        ),
        Album(
            id = 14,
            title = "Temporada de Reggaetón 2",
            artist = "Duki",
            year = 2022,
            songs = listOf(
                Song(177, "Amor Bipolar", "3:15"),
                Song(178, "Celosa", "2:37"),
                Song(179, "Perreo Bendito", "2:39"),
                Song(180, "Si Quieren Frontear", "3:20"),
                Song(181, "Esto Recién Empieza", "2:52"),
                Song(182, "Antes de Perderte", "2:56"),
                Song(183, "La Vuelta", "0:40"),
                Song(184, "GIVENCHY", "3:02")
            )
        ),
        Album(
            id = 15,
            title = "Antes de Ameri",
            artist = "Duki",
            year = 2023,
            songs = listOf(
                Song(185, "01 de ENEro", "1:54"),
                Song(186, "JEFES DEL SUDOESTE", "2:27"),
                Song(187, "RoCKSTAR 2.0", "2:53"),
                Song(188, "hARAKIRI", "2:41"),
                Song(189, "CONTRA<Mí", "2:39"),
                Song(190, "CISpher (audio latino)", "4:10"),
                Song(191, "GiGi", "2:25"),
                Song(192, "don't liE", "3:33"),
                Song(193, "antes de perderte (OG VERSION)", "2:46"),
                Song(194, "TROYA", "2:43"),
                Song(195, "uNO dOS", "2:45"),
                Song(196, "N.C.L.C", "1:26"),
                Song(197, "aPoLo13", "2:38"),
                Song(198, "Último Tren a Ameri", "1:51"),
                Song(199, "BUSCANDO Ameri", "1:04"),
                Song(200, "Remember Me", "2:50")
            )
        ),
        Album(
            id = 16,
            title = "AMERI",
            artist = "Duki",
            year = 2024,
            songs = listOf(
                Song(201, "Leitmotiv", "1:25"),
                Song(202, "Nueva Era", "3:37"),
                Song(203, "Brindis", "3:00"),
                Song(204, "Buscarte Lejos", "3:14"),
                Song(205, "Imperio", "2:48"),
                Song(206, "Hardaway", "3:36"),
                Song(207, "Cine", "2:22"),
                Song(208, "Vida De Rock", "3:01"),
                Song(209, "No Drama", "2:54"),
                Song(210, "Barro", "3:21"),
                Song(211, "Un Día Más", "2:45"),
                Song(212, "Trato De Estar Bien", "3:33"),
                Song(213, "Wake Up & Bake Up", "3:26"),
                Song(214, "Constelación", "3:20"),
                Song(215, "Ameri", "3:19")
            )
        ),
        Album(17, "Trap Cake, Vol. 1", "Rauw Alejandro", 2019, listOf(
            Song(216, "Al Mismo Tiempo", "4:10"),
            Song(217, "Cubierto de Ti", "4:29"),
            Song(218, "Espuma", "4:20"),
            Song(219, "Encima De Mí", "3:44"),
            Song(220, "Na' de Ti", "3:07"),
            Song(221, "Cuento de Hadas", "3:49"),
            Song(222, "Hasta Donde", "5:13")
        )),

        Album(18, "Concierto Virtual en Tiempos de COVID-19 Desde el Coliseo de Puerto Rico", "Rauw Alejandro", 2020, listOf(
            Song(223, "Intro - Live", "0:52"),
            Song(224, "Que Le Dé - Live", "2:15"),
            Song(225, "El Efecto - Live", "3:34"),
            Song(226, "Al Mismo Tiempo - Live", "3:40"),
            Song(227, "Dream Girl - Remix - Live", "2:48"),
            Song(228, "T.I.I. - Live", "2:15"),
            Song(229, "Yo Sabía - Live", "3:41"),
            Song(230, "Cuerpo en Venta - Live", "1:39"),
            Song(231, "La Cama - Remix - Live", "1:39"),
            Song(232, "Detective - Live", "2:08"),
            Song(233, "Ponte Pa' Mí - Live", "2:52"),
            Song(234, "Mírame - Live", "3:03"),
            Song(235, "Elegí - Live", "3:50"),
            Song(236, "Interlude - Live", "2:12"),
            Song(237, "Tattoo - Live", "4:17"),
            Song(238, "Una Noche - Live", "1:27"),
            Song(239, "Fantasías - Live", "5:30")
        )),

        Album(19, "Afrodisíaco", "Rauw Alejandro", 2020, listOf(
            Song(240, "Dile a Él", "3:29"),
            Song(241, "Strawberry Kiwi", "3:32"),
            Song(242, "Mood", "2:56"),
            Song(243, "Química", "4:55"),
            Song(244, "Enchule", "3:05"),
            Song(245, "De Cora <3", "3:10"),
            Song(246, "Un Sueño", "3:42"),
            Song(247, "Reloj", "3:51"),
            Song(248, "No Te Creo", "3:49"),
            Song(249, "Soy Una Gárgola", "4:09"),
            Song(250, "Pensándote", "3:36"),
            Song(251, "Perreo Pesau'", "4:20"),
            Song(252, "Algo Mágico", "4:21"),
            Song(253, "Ponte Pa' Mí", "3:03"),
            Song(254, "Elegí - Remix", "5:23"),
            Song(255, "Tattoo - Remix", "3:42")
        )),

        Album(20, "VICE VERSA", "Rauw Alejandro", 2021, listOf(
            Song(256, "Todo De Ti", "3:19"),
            Song(257, "Sexo Virtual", "3:28"),
            Song(258, "Nubes", "2:58"),
            Song(259, "Desesperados", "3:44"),
            Song(260, "2/Catorce", "3:25"),
            Song(261, "Aquel Nap ZzZz", "4:56"),
            Song(262, "Cúrame", "2:44"),
            Song(263, "Cosa Guapa", "4:15"),
            Song(264, "Desenfocao'", "2:50"),
            Song(265, "¿Cuando Fue?", "2:48"),
            Song(266, "Old Skul", "3:34"),
            Song(267, "¿Y Eso?", "3:20"),
            Song(268, "Tengo un Pal", "3:15"),
            Song(269, "Brazilera", "3:04")
        )),

        Album(21, "Trap Cake Vol. 2", "Rauw Alejandro", 2022, listOf(
            Song(270, "MUSEO", "4:15"),
            Song(271, "CAPRICHOSO", "2:47"),
            Song(272, "RED VELVET", "3:33"),
            Song(273, "FCK U X2", "4:39"),
            Song(274, "NO DRAMA", "3:13"),
            Song(275, "WUEPA", "3:42"),
            Song(276, "GRACIAS POR NADA", "3:39"),
            Song(277, "GTR", "3:26"),
            Song(278, "HACKIAO", "4:11")
        )),

        Album(22, "SATURNO", "Rauw Alejandro", 2023, listOf(
            Song(279, "SATURNO", "1:31"),
            Song(280, "PUNTO 40", "3:10"),
            Song(281, "MÁS DE UNA VEZ", "4:05"),
            Song(282, "LEJOS DEL CIELO", "3:28"),
            Song(283, "DEJAU'", "3:02"),
            Song(284, "GATAS", "3:27"),
            Song(285, "PANTIES Y BRASIERES", "3:17"),
            Song(286, "CAZADORES", "3:46"),
            Song(287, "DECA Y A LAS VEGAS (INTERLUDE)", "1:27"),
            Song(288, "QUÉ RICO CH*GAMOS", "4:06"),
            Song(289, "RON VOLA", "3:06"),
            Song(290, "NO ME SUELTES", "2:42"),
            Song(291, "VERDE MENTA", "3:08"),
            Song(292, "CORAZÓN DESPEINADO", "3:27"),
            Song(293, "DIME QUIÉN???", "2:44"),
            Song(294, "RAULEETO (SKIT)", "1:10"),
            Song(295, "DE CAROLINA", "3:01"),
            Song(296, "LOKERA", "3:17")
        )),

        Album(23, "PLAYA SATURNO", "Rauw Alejandro", 2023, listOf(
            Song(297, "PLAYA SATURNO INTRO", "1:15"),
            Song(298, "CUANDO BAJE EL SOL", "2:46"),
            Song(299, "AL CALLAO'", "4:02"),
            Song(300, "CURI", "2:45"),
            Song(301, "NO ME MOLESTE", "3:41"),
            Song(302, "PICARDÍA", "3:35"),
            Song(303, "PONTE NASTY", "4:02"),
            Song(304, "INQUIETO", "3:42"),
            Song(305, "HOY AQUÍ", "3:07"),
            Song(306, "CELEBRANDO", "3:27"),
            Song(307, "NO ME SORPRENDE", "3:30"),
            Song(308, "DILUVIO", "3:17"),
            Song(309, "TE PEGAS", "3:03"),
            Song(310, "BABY HELLO", "3:42")
        )),

        Album(24, "Cosa Nuestra", "Rauw Alejandro", 2024, listOf(
            Song(311, "Cosa Nuestra", "4:20"),
            Song(312, "Déjame Entrar", "4:14"),
            Song(313, "Qué Pasaría...", "3:11"),
            Song(314, "Tú Con Él", "4:49"),
            Song(315, "Committed", "2:39"),
            Song(316, "Espresso Martini", "3:11"),
            Song(317, "Baja Pa' Acá", "3:20"),
            Song(318, "Me Conozco", "3:49"),
            Song(319, "Il Capo", "4:09"),
            Song(320, "Revoli", "3:35"),
            Song(321, "Mil Mujeres", "2:48"),
            Song(322, "Khé?", "3:26"),
            Song(323, "Se Fue", "4:00"),
            Song(324, "Pasaporte", "4:23"),
            Song(325, "Touching The Sky", "3:05"),
            Song(326, "Amar De Nuevo", "4:28"),
            Song(327, "2:12 AM", "3:31"),
            Song(328, "SEXXMACHINE", "3:56")
        )),
    )
}
