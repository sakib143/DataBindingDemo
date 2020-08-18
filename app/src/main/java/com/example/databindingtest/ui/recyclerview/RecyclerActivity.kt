package com.example.databindingtest.ui.recyclerview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.databindingtest.R
import com.example.databindingtest.data.model.ProductModel
import com.example.databindingtest.listner.IMainActivity

class RecyclerActivity : AppCompatActivity(),IMainActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)


        val fragment = ProductListFragment()

        supportFragmentManager
            .beginTransaction()
            .addToBackStack("Product List Fragment")
            .add(R.id.fragment_container, fragment, "fragment_product_list")
            .commit()
    }

    override fun adapterToActivity(productmodel: ProductModel) {
        val fragment = ProductDetailsFragment()
        var bundle = Bundle()
        bundle.putParcelable("product_key", productmodel)
        fragment.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .addToBackStack("Product Detail Fragment")
            .replace(R.id.fragment_container, fragment, "product_detail_fragment")
            .commit()
    }

    override fun fragmentToActivity(productmodel: ProductModel) {
        Log.e("=> "," showInActivity " + productmodel.name)
    }
}