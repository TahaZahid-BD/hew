package com.tahazahid.android.hew.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tahazahid.android.hew.databinding.FragmentPhoneLoginBinding
import com.tahazahid.android.hew.utils.TinyDB

class PhoneLoginFragment : Fragment() {

    private var _binding : FragmentPhoneLoginBinding? = null
    private val binding get() = _binding!!
    private lateinit var tinyDB: TinyDB

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPhoneLoginBinding.inflate(inflater,container,false)

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