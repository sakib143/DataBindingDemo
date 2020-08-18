package com.example.databindingtest.ui.recyclerview

import android.content.Context
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.databinding.adapters.ViewBindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingtest.BR
import com.example.databindingtest.R
import com.example.databindingtest.data.model.ProductModel
import com.example.databindingtest.databinding.AdapterProductlistBinding
import com.example.databindingtest.listner.IMainActivity
import kotlinx.android.synthetic.main.fragment_main.view.*

class ProductsAdapter(private val context: Context, private val dataList: List<ProductModel>)
    : RecyclerView.Adapter<ProductsAdapter.BindingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {
//        val rootView =
//                ProductItemBinding.inflate(LayoutInflater.from(context),parent,false)

        val rootView: ViewDataBinding =
            AdapterProductlistBinding.inflate(LayoutInflater.from(context), parent, false)

        return BindingViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: BindingViewHolder, position: Int) {
        val product = dataList[position]

        holder.itemBinding.setVariable(BR.productItem, product)
        holder.itemBinding.executePendingBindings()
        //Set Item click listner in Adapte
        holder.itemBinding.setVariable(BR.productAdapterListner,holder.itemBinding.root.context as IMainActivity)

    }

    override fun getItemCount() = dataList.size

//    class BindingViewHolder(val itemBinding: ProductItemBinding)
//        : RecyclerView.ViewHolder(itemBinding.root)

    class BindingViewHolder(val itemBinding: ViewDataBinding)
        : RecyclerView.ViewHolder(itemBinding.root)

}