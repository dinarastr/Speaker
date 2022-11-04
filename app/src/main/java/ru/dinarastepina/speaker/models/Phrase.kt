package ru.dinarastepina.speaker.models

data class Phrase(
    val id: Int,
    val eng: String,
    val rus: String,
    val audioEng: String? = null,
    val audioRus: String? = null
)