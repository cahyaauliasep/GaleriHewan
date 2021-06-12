package org.d3if0088.tp06.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ButtonFragment : Fragment() {
    private lateinit var binding: ButtonFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = ButtonFragmentBinding.inflate(
                layoutInflater, container, false)
        return binding.root
    }

}