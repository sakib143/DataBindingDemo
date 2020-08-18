package com.example.databindingtest.listner

import com.example.databindingtest.data.model.ProductModel

interface IMainActivity {
    fun adapterToActivity(productmodel: ProductModel)
    fun fragmentToActivity(productmodel: ProductModel)
}