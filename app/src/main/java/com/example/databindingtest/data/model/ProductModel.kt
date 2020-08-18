package com.example.databindingtest.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProductModel(
    val itemId: String,
    val name: String,
    val description: String,
    val price: Double,
    val salePrice: Double,
    val rating: Float,
    val totalRatings: Int,
    val image: String,
    val errorImage: Int,
    val placeholderImage: Int
) : Parcelable