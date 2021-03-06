package com.puldroid.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_blank.*


class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (arguments?.getString("name") == "DC")
            lv.adapter = ArrayAdapter<String>(
                requireContext(), android.R.layout.simple_expandable_list_item_1,
                listOf("Superman", "Batman", "Flash", "Wonder Woman", "Aquaman")
            )
        else
            lv.adapter = ArrayAdapter<String>(
                requireContext(), android.R.layout.simple_expandable_list_item_1,
                listOf("Iron Man", "Captain Marvel", "THor", "DOctor Strange", "Hulk", "Spiderman")
            )
    }


}
