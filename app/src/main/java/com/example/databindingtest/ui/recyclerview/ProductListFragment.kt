package com.example.databindingtest.ui.recyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.databindingtest.data.repository.Repository
import com.example.databindingtest.databinding.FragmentProductListBinding

class ProductListFragment : Fragment()  {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                             savedInstanceState: Bundle?): View? {

        val binding =  FragmentProductListBinding.inflate(inflater, container, false)

        binding.dataList = Repository.productList

        return binding.root
    }
}