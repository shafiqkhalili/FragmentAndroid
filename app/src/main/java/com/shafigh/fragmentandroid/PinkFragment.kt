package com.shafigh.fragmentandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class PinkFragment: Fragment() {

    private lateinit var textName : TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.pink_fragment,container,false)
        textName = view.findViewById(R.id.textViewName)

        return view
    }
    fun setText(text:String): Unit {
        textName.text = text
    }
}