package com.tahazahid.android.hew.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tahazahid.android.hew.R
import com.tahazahid.android.hew.databinding.FragmentOtpBinding
import com.tahazahid.android.hew.utils.TinyDB

class OtpFragment : Fragment() {

    private var _binding : FragmentOtpBinding? = null
    private val binding get() = _binding!!

    private lateinit var tinyDB: TinyDB

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOtpBinding.inflate(inflater,container,false)

        tinyDB = TinyDB(requireContext())

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}