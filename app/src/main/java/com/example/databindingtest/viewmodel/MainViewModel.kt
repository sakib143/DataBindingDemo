package com.example.databindingtest.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.databindingtest.data.model.ProductModel
import com.example.databindingtest.data.repository.Repository

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private var product = Repository.productList.get(1) //Getting first position of arraylist

    fun getProduct(): ProductModel = product

}