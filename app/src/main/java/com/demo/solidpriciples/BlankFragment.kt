package com.demo.solidpriciples

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class BlankFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BlankFragment","OnCreated Called")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        Log.d("BlankFragment","onCreateView Called")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("BlankFragment","onAttach Called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("BlankFragment","onViewCreated Called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("BlankFragment","onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BlankFragment","onResume Called")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("BlankFragment","onViewStateRestored Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BlankFragment","onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BlankFragment","onStop Called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("BlankFragment","onSaveInstanceState Called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("BlankFragment","onDestroyView Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BlankFragment","onDestroy Called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("BlankFragment","onDetach Called")
    }
}