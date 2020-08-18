package com.example.databindingtest.ui

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.databindingtest.data.model.ProductModel
import com.example.databindingtest.databinding.FragmentMainBinding
import com.example.databindingtest.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_main.view.*
import java.io.IOException

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding = FragmentMainBinding.inflate(inflater, container, false)
        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        binding.product = viewModel.getProduct()
        binding.listner = this
        return binding.root
    }
}
