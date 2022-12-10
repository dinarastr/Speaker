package ru.dinarastepina.speaker.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import ru.dinarastepina.speaker.adapter.PhraseAdapter
import ru.dinarastepina.speaker.databinding.FragmentSecondBinding
import ru.dinarastepina.speaker.viewmodel.SpeakerViewModel

class SecondFragment : Fragment() {

    private lateinit var vb: FragmentSecondBinding
    private val args by navArgs<SecondFragmentArgs>()
    private val vm: SpeakerViewModel by activityViewModels()
    private val adapter: PhraseAdapter by lazy { PhraseAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        vb = FragmentSecondBinding.inflate(layoutInflater, container, false)
        vb.topicTv.text = "Тема: ${args.info}"

        vm.allPhrases().observe(viewLifecycleOwner) { phrases ->
            adapter.setPhrases(phrases)
        }

        vb.phrasesRv.adapter = adapter
        return vb.root
    }
}