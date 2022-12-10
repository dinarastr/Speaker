package ru.dinarastepina.speaker.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "eng_to_rus")
data class Phrase(
    @PrimaryKey
    val id: Int,
    val eng: String,
    val rus: String? = null,
    val audioEng: String? = null,
    val audioRus: String? = null,
    val topic: String
)