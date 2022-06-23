package com.salsabila.idn.samaquran.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.salsabila.idn.samaquran.R
import com.salsabila.idn.samaquran.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var tabName: String? = null

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        const val ARG_TAB = "tab_name"
        const val TAB_SURAT = "surah"
        const val TAB_TAFSIR = "tafsir"
        const val TAB_BOOKMARK = "bookmark"
    }
}
