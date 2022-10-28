package ru.dinarastepina.speaker.models

data class Phrase(
    val id: Int,
    val eng: String,
    val rus: String,
    val audio: String?
)