package ru.dinarastepina.speaker.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ru.dinarastepina.speaker.models.Phrase

@Database(entities = [Phrase::class], version = 1, exportSchema = false)
abstract class SpeakerDatabase : RoomDatabase() {
    abstract fun getDao(): SpeakerDao

    companion object {
        @Volatile
        private var INSTANCE: SpeakerDatabase? = null

        fun getDatabase(context: Context): SpeakerDatabase {
            val currentInstance = INSTANCE
            if (currentInstance != null) {
                return currentInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SpeakerDatabase::class.java,
                    "engDataBase.db"
                ).createFromAsset("engDataBase.db").build()
                INSTANCE = instance
                return instance
            }
        }
    }
}

