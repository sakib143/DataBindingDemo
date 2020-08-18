package com.example.databindingtest.data_binding_adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingtest.data.model.ProductModel
import com.example.databindingtest.ui.recyclerview.ProductsAdapter

@BindingAdapter("bindMainRecyclerview")
fun bindRecyclerView(view: RecyclerView, list: List<ProductModel>) {
    if (list.isEmpty())
        return

    val layoutManager = view.layoutManager
    if (layoutManager == null)
        view.layoutManager = GridLayoutManager(view.context, 2)

    var adapter = view.adapter

    if (adapter == null) {
        adapter = ProductsAdapter(view.context,list)
        view.adapter = adapter
    }
}