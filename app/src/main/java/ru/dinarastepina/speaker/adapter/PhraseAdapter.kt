package ru.dinarastepina.speaker.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.dinarastepina.speaker.databinding.PhraseItemBinding
import ru.dinarastepina.speaker.models.Phrase

class PhraseAdapter : RecyclerView.Adapter<PhraseAdapter.PhraseViewHolder>() {

    var data: List<Phrase> = emptyList()

    fun setPhrases(list: List<Phrase>) {
        data = list
        notifyDataSetChanged()
    }

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