package ru.dinarastepina.speaker.first

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ru.dinarastepina.speaker.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var vb: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        vb = FragmentFirstBinding.inflate(layoutInflater, container, false)

        vb.familyBtn.setOnClickListener {
            val action = FirstFragmentDirections.firstToSecond("семья")
            vb.root.findNavController().navigate(action)
        }

        return vb.root
    }
}