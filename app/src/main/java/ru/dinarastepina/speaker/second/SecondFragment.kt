package ru.dinarastepina.speaker.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import ru.dinarastepina.speaker.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var vb: FragmentSecondBinding
    private val args by navArgs<SecondFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        vb = FragmentSecondBinding.inflate(layoutInflater, container, false)

        vb.topicTv.text = "Тема: ${args.info}"
        return vb.root
    }
}