package ru.dinarastepina.speaker.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.dinarastepina.speaker.databinding.PhraseItemBinding
import ru.dinarastepina.speaker.models.Phrase

class PhraseAdapter : RecyclerView.Adapter<PhraseAdapter.PhraseViewHolder>() {

    val data: List<Phrase> = listOf(
        Phrase(
            id = 0,
            eng = "Thank you!\nThank you!\nThank you!",
            rus = "Спасибо!",
            audioEng = "thankyou.mp3"
        ),
        Phrase(
            id = 1,
            eng = "Sorry!",
            rus = "Простите!",
            audioEng = "sorry.mp3"
        ),
        Phrase(
            id = 2,
            eng = "Bye!",
            rus = "Пока!"
        ),
        Phrase(
            id = 3,
            eng = "Excuse me!",
            rus = "Извините!"
        ),
        Phrase(
            id = 0,
            eng = "Thank you!",
            rus = "Спасибо!",
            audioEng = "thankyou.mp3"
        ),
        Phrase(
            id = 1,
            eng = "Sorry!",
            rus = "Простите!",
            audioEng = "sorry.mp3"
        ),
        Phrase(
            id = 2,
            eng = "Bye!",
            rus = "Пока!"
        ),
        Phrase(
            id = 3,
            eng = "Excuse me!",
            rus = "Извините!"
        ),
        Phrase(
            id = 0,
            eng = "Thank you!",
            rus = "Спасибо!",
            audioEng = "thankyou.mp3"
        ),
        Phrase(
            id = 1,
            eng = "Sorry!",
            rus = "Простите!",
            audioEng = "sorry.mp3"
        ),
        Phrase(
            id = 2,
            eng = "Bye!",
            rus = "Пока!"
        ),
        Phrase(
            id = 3,
            eng = "Excuse me!",
            rus = "Извините!"
        ),
        Phrase(
            id = 0,
            eng = "Thank you!",
            rus = "Спасибо!",
            audioEng = "thankyou.mp3"
        ),
        Phrase(
            id = 1,
            eng = "Sorry!",
            rus = "Простите!",
            audioEng = "sorry.mp3"
        ),
        Phrase(
            id = 2,
            eng = "Bye!",
            rus = "Пока!"
        ),
        Phrase(
            id = 3,
            eng = "Excuse me!",
            rus = "Извините!"
        ),

        )

    class PhraseViewHolder(val vb: PhraseItemBinding) : RecyclerView.ViewHolder(vb.root) {
        fun bind(phrase: Phrase) {
            vb.phraseEng.text = phrase.eng
            vb.phraseRus.text = phrase.rus
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: PhraseViewHolder, position: Int) {
        val phraseItem = data[position]
        holder.bind(phraseItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhraseViewHolder {
        //todo: add different layout types
        val vb = PhraseItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PhraseViewHolder(vb)
    }
}