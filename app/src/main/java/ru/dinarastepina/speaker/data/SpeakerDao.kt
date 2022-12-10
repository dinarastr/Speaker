package ru.dinarastepina.speaker.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import ru.dinarastepina.speaker.models.Phrase

@Dao
interface SpeakerDao {
    @Query("select * from eng_to_rus order by rus asc")
    fun getAllPhrases(): LiveData<List<Phrase>>

    @Query("select * from eng_to_rus where eng like :search||'%'")
    fun findPhrase(search: String): LiveData<List<Phrase>>

    @Query("select * from eng_to_rus where topic like :topic")
    fun findByTopic(topic: String): LiveData<List<Phrase>>
}