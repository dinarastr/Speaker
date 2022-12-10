package ru.dinarastepina.speaker.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import ru.dinarastepina.speaker.data.SpeakerDatabase
import ru.dinarastepina.speaker.models.Phrase

class SpeakerViewModel(application: Application) : AndroidViewModel(
    application
) {
    private val dao = SpeakerDatabase.getDatabase(application).getDao()

    fun allPhrases(): LiveData<List<Phrase>> {
        return dao.getAllPhrases()
    }
}