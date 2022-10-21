package ru.dinarastepina.speaker.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import ru.dinarastepina.speaker.R
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

        vb.secondTv.text = "Тема: ${args.info}"
        return vb.root
    }
}