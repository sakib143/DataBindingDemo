package com.example.databindingtest.ui.recyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.databindingtest.data.model.ProductModel
import com.example.databindingtest.data.repository.Repository
import com.example.databindingtest.databinding.FragmentProductDetailsBinding
import com.example.databindingtest.databinding.FragmentProductListBinding
import com.example.databindingtest.listner.IMainActivity

class ProductDetailsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding = FragmentProductDetailsBinding.inflate(inflater, container, false)
        val product = arguments?.getParcelable<ProductModel>("product_key")
        binding.product = product!!
        binding.productDetailsFragmentListner = context as IMainActivity
        return binding.root
    }
}