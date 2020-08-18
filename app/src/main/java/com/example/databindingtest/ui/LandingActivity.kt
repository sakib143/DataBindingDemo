package com.example.databindingtest.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databindingtest.R
import com.example.databindingtest.databinding.ActivityLandingBinding
import com.example.databindingtest.ui.recyclerview.RecyclerActivity

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityLandingBinding = DataBindingUtil.setContentView(this,R.layout.activity_landing)
        binding.listner = this

    }

    fun redirectToRecyclerview(){
        val intent = Intent(this, RecyclerActivity::class.java)
        startActivity(intent)
    }

    fun redirectToFragment(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun checkBox(button : CompoundButton, isCheck : Boolean ){
        Log.e("=>"," Checkobx is checked " + isCheck)
    }

}