package com.example.databindingtest.utils

object StringUtils {

    @JvmStatic
    fun getTotalRating(totalRating : Int) : String {
        return "($totalRating)"
    }

    @JvmStatic
    fun getFormatedPrice(price : Double) : String{
        return "$price$"
    }
}