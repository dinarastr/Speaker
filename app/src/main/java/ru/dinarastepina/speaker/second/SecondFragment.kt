package ru.dinarastepina.speaker.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import ru.dinarastepina.speaker.adapter.PhraseAdapter
import ru.dinarastepina.speaker.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var vb: FragmentSecondBinding
    private val args by navArgs<SecondFragmentArgs>()
    private lateinit var adapter: PhraseAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        vb = FragmentSecondBinding.inflate(layoutInflater, container, false)
        adapter = PhraseAdapter()
        vb.topicTv.text = "Тема: ${args.info}"
        vb.phrasesRv.adapter = adapter
        return vb.root
    }
}