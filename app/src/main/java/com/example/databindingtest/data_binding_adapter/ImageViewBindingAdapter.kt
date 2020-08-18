package com.example.databindingtest.data_binding_adapter

import android.graphics.BitmapFactory
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.databindingtest.R
import java.io.IOException
import java.lang.NumberFormatException
import java.text.NumberFormat
import java.util.*

@BindingAdapter("imagFromAsset")
fun setImageFromAsset(view: ImageView, fileName: String) {
    try {
        val bitmap = BitmapFactory.decodeStream(view.context?.assets?.open(fileName))
        view.setImageBitmap(bitmap)
    } catch (e: IOException) {
        e.printStackTrace()
    }

}

@BindingAdapter("imagUrl","placeholderImage","errorImage",requireAll = false)
fun loadImageFromUrl(view : ImageView, url : String,isPlacehoder : Boolean, isError : Boolean) {
    val requestOption : RequestOptions = RequestOptions()
    if(isPlacehoder){
        requestOption.placeholder(R.drawable.ic_placehodler)
    }

    if(isError){
        requestOption.placeholder(R.drawable.ic_error)
    }

    Glide.with(view.context)
        .load(url)
        .into(view)
}

@BindingAdapter("priceText")
fun setPriceText(view : TextView, amount : Double){
    val formatter = NumberFormat.getCurrencyInstance(Locale.US)
    view.text = "Rs. $amount / each"
}

@BindingAdapter("ratingText")
fun setTotalRating(view : TextView , rating : Int){
    view.text = "($rating)"
}